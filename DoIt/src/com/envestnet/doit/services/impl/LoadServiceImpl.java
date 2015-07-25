package com.envestnet.doit.services.impl;

import java.util.List;

import com.envestnet.doit.beans.Task;
import com.envestnet.doit.dao.LoadDAO;
import com.envestnet.doit.dao.impl.LoadDAOImpl;
import com.envestnet.doit.services.LoadService;

public class LoadServiceImpl implements LoadService {

	@Override
	public List<Task> load() {
		
		LoadDAO dao=new LoadDAOImpl();
		return dao.load();
	}

}
