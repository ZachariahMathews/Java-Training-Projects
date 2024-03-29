package calculationdemo.servlets;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import calculationdemo.util.Calculation;
import calculationdemo.util.CalculationForm;

/**
 * Servlet implementation class CalculationServlet
 */
public class CalculationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private List<Calculation> cal=new ArrayList<Calculation>();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session=request.getSession();
		int num1=0,num2=0,count=0;
		Cookie c1=null,c2=null;

		if(session.getAttribute("status")!=null&&(boolean) session.getAttribute("status"))
		{
			Cookie[] cookies=request.getCookies();
			Calculation c=null;

			if(request.getParameter("num1")!=null&&request.getParameter("num2")!=null&&request.getParameter("op")!=null)
			{
				c=new Calculation(Integer.parseInt(request.getParameter("num1")), Integer.parseInt(request.getParameter("num2"))
						, request.getParameter("op").charAt(0));
				if(cookies!=null){

					for(Cookie k:cookies){

						System.out.println(k.getName()+" "+k.getValue());
						if(k.getName().equals("NUM1")||k.getName().equals("NUM2")){

							count++;
						}
					}
					if(count==2){

						System.out.println("*****cookie present*****");
						for(Cookie k:cookies){
							System.out.println(k.getName()+" "+k.getValue());
							if(k.getName().equals("NUM1")){

								k.setValue(request.getParameter("num1"));
								response.addCookie(k);
								System.out.println("cookie num1 updated "+k.getValue());
							}
							else if(k.getName().equals("NUM2")){

								k.setValue(request.getParameter("num2"));
								response.addCookie(k);
								System.out.println("cookie num2 updated "+k.getValue());
							}
						}
					}

					else if(count==0){

						System.out.println("*****new cookie*****");
						for(Cookie k:cookies){

							System.out.println("cookie present:"+k.getName()+" "+k.getValue());
						}
						System.out.println("parameter num1: "+request.getParameter("num1"));
						System.out.println("parameter num2: "+request.getParameter("num2"));
						Cookie co1=new Cookie("NUM1",request.getParameter("num1"));
						Cookie co2=new Cookie("NUM2", request.getParameter("num2"));
						response.addCookie(co1);
						response.addCookie(co2);
						System.out.println("cookie created first:");
						System.out.println(co1.getName()+" "+co1.getValue());
						System.out.println(co2.getName()+" "+co2.getValue());
					}
				}
			}
			else{

				System.out.println("***** FIRST RUN *****");
				count=0;
				if(cookies!=null){

					for(Cookie k:cookies){

						System.out.println("firstRUN cookie: "+k.getName()+" "+k.getValue());
						if(k.getName().equals("NUM1")){

							count++;
							c1=k;
						}
						else if(k.getName().equals("NUM2")){

							count++;
							c2=k;
						}
					}
					if(count==2){

						System.out.println("*****values already present*****");
						num1=Integer.parseInt(c1.getValue());
						num2=Integer.parseInt(c2.getValue());
					}
				}
			}

			List<Calculation>cal=(List<Calculation>) session.getAttribute("history");
			if(cal==null){

				cal=new ArrayList<Calculation>();
			}
			cal.add(c);
			session.setAttribute("history", cal);

			response.setContentType("text/html");
			Writer w=response.getWriter();

			w.write(CalculationForm.getCalculationForm(num1,num2));
			w.flush();
			w.close();
		}
		else{

			Writer w=response.getWriter();
			w.write("<h1>Not logged in</h1>");
			w.flush();
			w.close();
		}
	}


}
