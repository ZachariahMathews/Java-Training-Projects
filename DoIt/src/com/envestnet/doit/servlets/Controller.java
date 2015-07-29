package com.envestnet.doit.servlets;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.envestnet.doit.beans.Task;
import com.envestnet.doit.handlers.DoneHandler;
import com.envestnet.doit.handlers.EditHandler;
import com.envestnet.doit.handlers.LoadHandler;
import com.envestnet.doit.handlers.LoginHandler;
import com.envestnet.doit.handlers.RemoveHandler;
import com.envestnet.doit.handlers.SignupHandler;
import com.envestnet.doit.handlers.AddHandler;
import com.envestnet.doit.util.SortListUtil;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	public void init() throws ServletException {
		
		LoadHandler lh=new LoadHandler();
    	List<Task>tasks=lh.load();
    	getServletContext().setAttribute("tasks",SortListUtil.sort(tasks));
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
					
					request.getSession().setAttribute("userid", request.getParameter("userid"));
					requestForward(request, response, "list-home.jsp");
				} catch (IOException | ServletException e) {
					
					e.printStackTrace();
				}
			else{
				try {
					
					request.setAttribute("login", false);
					requestForward(request, response, "login.jsp");					
				} catch (IOException | ServletException e) {
					
					e.printStackTrace();
				}
			}
		}
		else if("list-add".equals(handlerName)){
			
			List<Task> tasks=(List<Task>) getServletContext().getAttribute("tasks");
			//System.out.println("Before: "+tasks.size());
			AddHandler uh=new AddHandler(request);
			tasks.add(uh.update());
			//System.out.println("After-1: "+tasks.size());
			/*for(Task t:tasks){
				System.out.println(t.getTask());
			}*/
			
			getServletContext().setAttribute("tasks", SortListUtil.sort(tasks));
			//System.out.println("After:2 "+((List<Task>)getServletContext().getAttribute("tasks")).size());
			try {
				
				requestForward(request, response, "list-home.jsp");					
			} catch (IOException | ServletException e) {
				
				e.printStackTrace();
			}
		}
		else if("edit-link".equals(handlerName)){
			
			/*List<Task> tasks=(List<Task>) getServletContext().getAttribute("tasks");
			EditHandler eh=new EditHandler(request);
			eh.edit();*/
			try {
				requestForward(request, response, "list-home.jsp");
			} catch (IOException | ServletException e) {
				
				e.printStackTrace();
			}
			
		}
		else if("edit-page".equals(handlerName)){
			
			EditHandler eh=new EditHandler(request);
			getServletContext().setAttribute("tasks",SortListUtil.sort(eh.edit((List<Task>) getServletContext().getAttribute("tasks"))));
			/*for(Task t:(List<Task>) getServletContext().getAttribute("tasks")){
				System.out.println(t.getTask());
			}*/
			try {
				requestForward(request, response, "list-home.jsp");
			} catch (IOException | ServletException e) {
				
				e.printStackTrace();
			}
			
		}
		else if("remove".equals(handlerName)){
			
			RemoveHandler eh=new RemoveHandler(request);
			getServletContext().setAttribute("tasks",SortListUtil.sort(eh.remove((List<Task>) getServletContext().getAttribute("tasks"))));
			/*for(Task t:(List<Task>) getServletContext().getAttribute("tasks")){
				System.out.println(t.getTask());
			}*/
			try {
				requestForward(request, response, "list-home.jsp");
			} catch (IOException | ServletException e) {
				
				e.printStackTrace();
			}
			
		}
		else if("done".equals(handlerName)){
			
			DoneHandler dh=new DoneHandler(request);
			getServletContext().setAttribute("tasks",(List<Task>) dh.done((List<Task>) getServletContext().getAttribute("tasks")));
			try {
				requestForward(request, response, "list-home.jsp");
			} catch (IOException | ServletException e) {
				
				e.printStackTrace();
			}
			
		}
		else if("signup-link".equals(handlerName)){
			
			try {
				requestForward(request, response, "signup.jsp");
			} catch (IOException | ServletException e) {
				
				e.printStackTrace();
			}
		}
		else if("signup-page".equals(handlerName)){
			
			SignupHandler sh=new SignupHandler(request);
			if(sh.signup())
				try {
					
					requestForward(request, response, "login.jsp");
				} catch (IOException | ServletException e) {
					
					e.printStackTrace();
				}
			else{
				try {
					
					request.setAttribute("signup", false);
					requestForward(request, response, "signup.jsp");					
				} catch (IOException | ServletException e) {
					
					e.printStackTrace();
				}
			}
		}
		else if("logout".equals(handlerName)){
			
			try {
				requestForward(request, response, "login.jsp");
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
