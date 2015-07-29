package com.envestnet.doit.dto;

import java.util.List;

import com.envestnet.doit.beans.Task;
import com.envestnet.doit.dao.beans.TaskBean;

public interface ReadDTO {

	public List<Task> convertFrom(List<TaskBean> taskbeans);

	
}
