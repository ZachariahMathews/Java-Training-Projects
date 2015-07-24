package test;

import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AboutServlet
 */
public class AboutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		processRequest(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		processRequest(request,response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/plain");
		/*Writer w=response.getWriter();
		Enumeration en=request.getHeaderNames();
		while(en.hasMoreElements()){
			String s=(String)en.nextElement();
			w.write(s+":"+request.getHeader(s)+"\r\n");
		}
		w.flush();
		w.close();*/
		request.setAttribute("arg1", "name");
		RequestDispatcher rd=request.getRequestDispatcher("FinalServlet");
		rd.forward(request, response);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		super.init(config);
		System.out.println("init Started");
		System.out.println(config.getInitParameter("driver"));
	}
}
