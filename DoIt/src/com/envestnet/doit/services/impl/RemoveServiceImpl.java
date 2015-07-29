package com.envestnet.doit.services.impl;

import com.envestnet.doit.dao.RemoveDAO;
import com.envestnet.doit.dao.impl.RemoveDAOImpl;
import com.envestnet.doit.services.RemoveService;

public class RemoveServiceImpl implements RemoveService {

	@Override
	public void remove(int taskid) {
		
		RemoveDAO dao=new RemoveDAOImpl();
		dao.remove(taskid);
	}

}
