package com.envestnet.doit.services.impl;

import com.envestnet.doit.dao.DoneDAO;
import com.envestnet.doit.dao.impl.DoneDAOImpl;
import com.envestnet.doit.services.DoneService;

public class DoneServiceImpl implements DoneService {

	@Override
	public void done(int taskid) {
		
		DoneDAO dao=new DoneDAOImpl();
		dao.done(taskid);
		
	}

}
