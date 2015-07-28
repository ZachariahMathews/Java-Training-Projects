package com.envestnet.doit.services.impl;

import com.envestnet.doit.beans.Task;
import com.envestnet.doit.dao.UpdateDAO;
import com.envestnet.doit.dao.beans.TaskBean;
import com.envestnet.doit.dao.impl.UpdateDAOImpl;
import com.envestnet.doit.dto.UpdateDTO;
import com.envestnet.doit.dto.impl.UpdateDTOImpl;
import com.envestnet.doit.services.UpdateService;

public class UpdateServiceImpl implements UpdateService {

	@Override
	public void update(Task task) {
		
		UpdateDTO dto=new UpdateDTOImpl();
		UpdateDAO dao=new UpdateDAOImpl();
		dao.update(dto.convertTO(task));
	}

}
