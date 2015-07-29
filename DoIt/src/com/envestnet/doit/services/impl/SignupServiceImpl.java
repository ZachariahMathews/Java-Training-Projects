package com.envestnet.doit.services.impl;

import com.envestnet.doit.dao.SignupDAO;
import com.envestnet.doit.dao.beans.UserBean;
import com.envestnet.doit.dao.impl.SignupDAOImpl;
import com.envestnet.doit.services.SignupService;

public class SignupServiceImpl implements SignupService {

	@Override
	public boolean signup(UserBean userBean) {
		SignupDAO dao=new SignupDAOImpl();
		return dao.signup(userBean);
	}

}
