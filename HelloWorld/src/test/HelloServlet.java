package test;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		Writer out=response.getWriter();
		out.write("<h1>Hello World!!</h1>");
		out.write(request.getQueryString()+"<br>");
		out.write(request.getParameter("username")+"<br>");
		out.write(request.getParameter("password")+"<br>");
		out.flush();
		out.close();
	}

}
