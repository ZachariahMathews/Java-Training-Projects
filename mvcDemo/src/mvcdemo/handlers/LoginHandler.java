package mvcdemo.handlers;

import javax.servlet.http.HttpServletRequest;

import mvcdemo.bean.User;
import mvcdemo.service.LoginService;
import mvcdemo.service.impl.LoginServiceImpl;

public class LoginHandler {

	private HttpServletRequest request;

	public LoginHandler(HttpServletRequest request) {
		
		this.request = request;
	}
	public User validate() throws Exception{
		
		User user=null;
		LoginService s=new LoginServiceImpl();
		user=s.login(request.getParameter("userid"),request.getParameter("password"));
		return user;
	}
}
