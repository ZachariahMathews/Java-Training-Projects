package com.envestnet.doit.handlers;

import javax.servlet.http.HttpServletRequest;

import com.envestnet.doit.beans.User;
import com.envestnet.doit.services.LoginService;
import com.envestnet.doit.services.impl.LoginServiceImpl;

public class LoginHandler {

	HttpServletRequest request;

	public LoginHandler(HttpServletRequest request) {
		
		this.request = request;
	}
	
	public boolean login(){
		
		LoginService ls=new LoginServiceImpl();
		return ls.login(new User(request.getParameter("userid"),request.getParameter("password")));
	}
}
