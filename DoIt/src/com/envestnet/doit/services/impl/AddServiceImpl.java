package com.envestnet.doit.services.impl;

import com.envestnet.doit.beans.Task;
import com.envestnet.doit.dao.AddDAO;
import com.envestnet.doit.dao.beans.TaskBean;
import com.envestnet.doit.dao.impl.AddDAOImpl;
import com.envestnet.doit.dto.WriteDTO;
import com.envestnet.doit.dto.impl.WriteDTOImpl;
import com.envestnet.doit.services.AddService;

public class AddServiceImpl implements AddService {

	@Override
	public void update(Task task) {
		
		WriteDTO dto=new WriteDTOImpl();
		AddDAO dao=new AddDAOImpl();
		dao.update(dto.convertTO(task));
	}

}
