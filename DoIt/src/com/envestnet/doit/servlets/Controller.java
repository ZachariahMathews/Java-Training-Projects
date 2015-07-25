package com.envestnet.doit.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.envestnet.doit.handlers.LoadHandler;
import com.envestnet.doit.handlers.LoginHandler;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	public void init() throws ServletException {
		
		LoadHandler lh=new LoadHandler();
    	getServletContext().setAttribute("tasks", lh.load());
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request,response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) {
		
		String handlerName=request.getParameter("handler");
		
		if("login".equals(handlerName)){
			
			LoginHandler lh=new LoginHandler(request);
			if(lh.login())
				try {
					
					requestForward(request, response, "list-home.jsp");
				} catch (IOException | ServletException e) {
					
					e.printStackTrace();
				}
				
		}
	}
	
	private void requestForward(HttpServletRequest request, HttpServletResponse response,String dest) throws IOException, ServletException {
		
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/WEB-INF/jsp/"+dest);
		rd.forward(request, response);
	}

}