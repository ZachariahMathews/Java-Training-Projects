package test;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		Writer out=response.getWriter();
		
		if(request.getParameter("hiddenElement")==null){
			out.write("<h1>Form!!</h1>");
			out.write("<form action=\"Demo\"></br>");
			out.write("<input type=\"text\" name=\"username\" value=\"zach\"></br>");
			out.write("<input type=\"text\" name=\"password\" value=\"123\"></br>");
			out.write("<input type=\"hidden\" name=\"hiddenElement\" value=\"123\"></br>");
			out.write("<input type=\"submit\">");
			out.write("</form>");
		}
		else{
			if(request.getParameter("username").equals("zach")&&request.getParameter("password").equals("123")){
				out.write("<h1>Login Success</h1>");
			}
			else{
				out.write("<h1>Form!!</h1></br>");
				out.write("<form action=\"Demo\"></br>");
				out.write("<input type=\"text\" name=\"username\" value=\"zach\"></br>");
				out.write("<input type=\"text\" name=\"password\" value=\"123\"></br>");
				out.write("<input type=\"hidden\" name=\"hiddenElement\" value=\"123\"></br>");
				out.write("<input type=\"submit\">Login Failed</br>");
				out.write("</form>");
			}
		}
		out.flush();
		out.close();
	}

}
