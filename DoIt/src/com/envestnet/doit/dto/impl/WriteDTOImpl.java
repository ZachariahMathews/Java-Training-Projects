package com.envestnet.doit.dto.impl;

import com.envestnet.doit.beans.Task;
import com.envestnet.doit.dao.beans.TaskBean;
import com.envestnet.doit.dto.WriteDTO;

public class WriteDTOImpl implements WriteDTO {

	@Override
	public TaskBean convertTO(Task task) {
		
		TaskBean taskbean=new TaskBean();
		taskbean.setTaskid(task.getTaskid());
		taskbean.setCategory(task.getCategory());
		taskbean.setPriority(task.getPriority());
		taskbean.setTask(task.getTask());
		taskbean.setTaskdate(task.getTaskdatetime().toLocalDate());
		taskbean.setTasktime(task.getTaskdatetime().toLocalTime());
		taskbean.setTaskgroup(task.getTaskgroup());
		taskbean.setUserid(task.getUserid());
		taskbean.setDone(task.getDone());
		return taskbean;
	}

}
