package com.envestnet.doit.handlers;

import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpServletRequest;

import com.envestnet.doit.beans.Task;
import com.envestnet.doit.services.RemoveService;
import com.envestnet.doit.services.impl.RemoveServiceImpl;

public class RemoveHandler {

	HttpServletRequest request;

	public RemoveHandler(HttpServletRequest request) {

		this.request = request;
	}

	public List<Task> remove(List<Task> tasks) {

		int taskid = 0, dispid = 0;
		for (Task task : tasks) {

			++dispid;
			if (dispid == Integer.parseInt(request.getParameter("index"))) {

				taskid = task.getTaskid();
			}
		}
		ListIterator<Task> iterator = tasks.listIterator();
		while (iterator.hasNext()) {
			if (iterator.next().getTaskid() == taskid) {

				iterator.remove();
				break;
			}
		}
		RemoveService rs=new RemoveServiceImpl();
		rs.remove(taskid);
		return tasks;
	}

}
