package com.envestnet.doit.handlers;

import javax.servlet.http.HttpServletRequest;

import com.envestnet.doit.dao.beans.UserBean;
import com.envestnet.doit.services.SignupService;
import com.envestnet.doit.services.impl.SignupServiceImpl;

public class SignupHandler {

	HttpServletRequest request;

	public SignupHandler(HttpServletRequest request) {
		
		this.request = request;
	}

	public boolean signup() {
		
		SignupService ls=new SignupServiceImpl();
		return ls.signup(new UserBean(request.getParameter("userid"),request.getParameter("password")));
	}
	
	
}
