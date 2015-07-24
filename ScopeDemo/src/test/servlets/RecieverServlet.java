package test.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jrockit.jfr.RequestDelegate;

/**
 * Servlet implementation class RecieverServlet
 */
public class RecieverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext ctx=getServletContext();
		Integer totalAccess=(Integer) ctx.getAttribute("totalAccess");
		if(totalAccess==null){
			totalAccess=0;
			ctx.setAttribute("totalAccess", totalAccess);
		}
		totalAccess++;
		ctx.setAttribute("totalAccess", totalAccess);
		System.out.println("Total Access: "+totalAccess);
		
		Integer count=(Integer) request.getSession().getAttribute("count");
		if(count==null){
			
			request.getSession().setAttribute("count", new Integer(1));
		}
		System.out.println("Consumer: "+count);
		
		RequestDispatcher rd=request.getRequestDispatcher("ProducerServlet");
		rd.forward(request, response);
	}
}
