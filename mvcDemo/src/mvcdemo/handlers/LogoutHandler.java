package mvcdemo.handlers;


import javax.servlet.http.HttpServletRequest;

import mvcdemo.service.LogoutService;
import mvcdemo.service.impl.LogoutServiceImpl;


public class LogoutHandler {

	private HttpServletRequest request;

	public LogoutHandler(HttpServletRequest request) {
		
		this.request = request;
	}
	
	public void updateDB(){
		
		LogoutService ls=new LogoutServiceImpl();
		ls.update(request.getParameter("userid"));
		
	}
}
