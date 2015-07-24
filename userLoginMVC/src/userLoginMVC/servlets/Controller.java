package userLoginMVC.servlets;

import java.io.IOException;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userLoginMVC.beans.User;
import userLoginMVC.handlers.LoadHandler;
import userLoginMVC.handlers.UpdateHandler;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @Override
    public void init() throws ServletException {
    	
    	LoadHandler lh=new LoadHandler();
    	getServletContext().setAttribute("users", lh.load());
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request,response);
	}

	private void processRequest(HttpServletRequest request,	HttpServletResponse response) {
		
		String handlerName=request.getParameter("handler");
		if(handlerName.equals("userRegistration")){
			
			Set<User> users=(Set<User>) getServletContext().getAttribute("users");
			UpdateHandler uh=new UpdateHandler(request);
			uh.update(users);
			try {
				requestForward(request, response, "index.jsp");
			} catch (IOException | ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private void requestForward(HttpServletRequest request, HttpServletResponse response,String dest) throws IOException, ServletException {
		
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/WEB-INF/pages/"+dest);
		rd.forward(request, response);
	}

}
