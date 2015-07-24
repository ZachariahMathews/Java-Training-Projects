package test.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProducerServlet
 */
public class ProducerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*ServletContext ctx=getServletContext();
		Integer totalAccess=(Integer) ctx.getAttribute("totalAccess");
		if(totalAccess==null){
			totalAccess=0;
			ctx.setAttribute("totalAccess", totalAccess);
		}
		totalAccess++;
		ctx.setAttribute("totalAccess", totalAccess);
		System.out.println("Total Access: "+totalAccess);
		
		Integer count=(Integer) request.getSession().getAttribute("count");
		count++;
		request.getSession().setAttribute("count", count);
		System.out.println("Producer: "+count);*/
		/*Writer w=response.getWriter();
		w.write("value: "+checkCookie(request, response));
		w.flush();
		w.close();*/
	}
	
	private String checkCookie(HttpServletRequest request,HttpServletResponse response){
		
		Cookie[] cookies=request.getCookies();
		Cookie temp=null;
		if(cookies!=null){
			
			for(Cookie k:cookies){
				if(k.getName().equals("myCookie")){
					temp=k;
					break;
				}
			}
		}
		if(temp==null){
			
			temp=new Cookie("myCookie", "1");
			System.out.println("Cookie created");
		}
		else{
			int v=Integer.parseInt(temp.getValue());
			System.out.println("Value: "+v);
			v++;
			temp.setValue(Integer.toString(v));
		}
		temp.setMaxAge(10*60);
		response.addCookie(temp);
		
		return temp.getValue();
	}
}
