package com.envestnet.doit.services;

import java.util.List;

import com.envestnet.doit.beans.Task;
import com.envestnet.doit.dao.beans.TaskBean;

public interface LoadService {

	public List<Task> load();
	
	
}
