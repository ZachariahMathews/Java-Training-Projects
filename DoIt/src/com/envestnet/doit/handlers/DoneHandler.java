package com.envestnet.doit.handlers;

import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpServletRequest;

import com.envestnet.doit.beans.Task;
import com.envestnet.doit.services.DoneService;
import com.envestnet.doit.services.RemoveService;
import com.envestnet.doit.services.impl.DoneServiceImpl;
import com.envestnet.doit.services.impl.RemoveServiceImpl;

public class DoneHandler {

	HttpServletRequest request;

	public DoneHandler(HttpServletRequest request) {
		
		this.request = request;
	}

	public List<Task> done(List<Task> tasks) {
		
		int taskid = 0, dispid = 0;
		for (Task task : tasks) {

			++dispid;
			if (dispid == Integer.parseInt(request.getParameter("index"))) {

				taskid = task.getTaskid();
			}
		}
		ListIterator<Task> iterator = tasks.listIterator();
		while (iterator.hasNext()) {
			
			Task task=iterator.next();
			if (task.getTaskid() == taskid) {

				task.setDone('y');
				break;
			}
		}
		DoneService ds=new DoneServiceImpl();
		ds.done(taskid);
		return tasks;
	}
	
}
