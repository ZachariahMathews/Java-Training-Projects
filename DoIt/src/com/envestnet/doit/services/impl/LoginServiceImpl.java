package com.envestnet.doit.services.impl;

import com.envestnet.doit.dao.LoginDAO;
import com.envestnet.doit.dao.beans.UserBean;
import com.envestnet.doit.dao.impl.LoginDAOImpl;
import com.envestnet.doit.services.LoginService;

public class LoginServiceImpl implements LoginService {

	@Override
	public boolean login(UserBean u) {
		
		LoginDAO dao=new LoginDAOImpl();
		return dao.login(u);
	}

}
