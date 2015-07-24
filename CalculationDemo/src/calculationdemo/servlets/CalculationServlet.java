package calculationdemo.servlets;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		Calculation c=null;
		if(request.getParameter("num1")!=null&&request.getParameter("num2")!=null&&request.getParameter("num2")!=null)
		{
			 c=new Calculation(Integer.parseInt(request.getParameter("num1")), Integer.parseInt(request.getParameter("num2"))
					, request.getParameter("op").charAt(0));
			//cal.add(c);
			
		}
				
		Writer w=response.getWriter();
		w.write(CalculationForm.getCalculationForm(checkSession(request, c)));
		w.flush();
		w.close();
	}

	private List<Calculation> checkSession(HttpServletRequest request,Calculation c){
		
		HttpSession session=request.getSession();
		List<Calculation>cal=(List<Calculation>) session.getAttribute("history");
		if(cal==null){
			
			cal=new ArrayList<Calculation>();
		}
		cal.add(c);
		session.setAttribute("history", cal);
		return cal;
	}

}
