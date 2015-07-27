package com.envestnet.doit.services.impl;

import java.util.List;

import com.envestnet.doit.beans.Task;
import com.envestnet.doit.dao.LoadDAO;
import com.envestnet.doit.dao.beans.TaskBean;
import com.envestnet.doit.dao.impl.LoadDAOImpl;
import com.envestnet.doit.dto.LoadDTO;
import com.envestnet.doit.dto.impl.LoadDTOImpl;
import com.envestnet.doit.services.LoadService;

public class LoadServiceImpl implements LoadService {

	@Override
	public List<Task> load() {
		
		LoadDAO dao=new LoadDAOImpl();
		List<TaskBean> taskbeans= dao.load();
		LoadDTO dto=new LoadDTOImpl();
		return dto.convertFrom(taskbeans);
	}

}
