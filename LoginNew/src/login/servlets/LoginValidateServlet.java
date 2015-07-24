package login.servlets;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginValidateServlet
 */
public class LoginValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Map<String,String> userInfo=new HashMap<String, String>();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		if(validateLogin(request)){
			Writer w=response.getWriter();
			w.write("Welcome, "+request.getParameter("username"));
			w.flush();
			w.close();
		}
		else{
			RequestDispatcher rd=request.getRequestDispatcher("LoginFormServlet");
			rd.forward(request, response);
		}
	}


	private boolean validateLogin(HttpServletRequest request) {
		
		if(userInfo.get(request.getParameter("username"))==null)
			return false;
		else if(userInfo.get(request.getParameter("username")).equals(request.getParameter("password")))
			return true;
		else
			return false;
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		super.init(config);
		userInfo.put("scott", "123");
		userInfo.put("red", "green");
		userInfo.put("abc", "abc");
	}

}
