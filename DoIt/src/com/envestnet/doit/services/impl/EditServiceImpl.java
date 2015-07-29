package com.envestnet.doit.services.impl;

import com.envestnet.doit.beans.Task;
import com.envestnet.doit.dao.EditDAO;
import com.envestnet.doit.dao.impl.EditDAOImpl;
import com.envestnet.doit.dto.WriteDTO;
import com.envestnet.doit.dto.impl.WriteDTOImpl;
import com.envestnet.doit.services.EditService;

public class EditServiceImpl implements EditService {

	@Override
	public void edit(Task task) {
		
		WriteDTO dto=new WriteDTOImpl();
		EditDAO dao=new EditDAOImpl();
		dao.edit(dto.convertTO(task));
		
	}

}
