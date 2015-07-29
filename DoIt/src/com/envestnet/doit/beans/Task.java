package com.envestnet.doit.beans;

import java.time.LocalDateTime;

public class Task {
	
	private int displayid;
	private int taskid;
	private String userid;
	private String category;
	private String task;
	private LocalDateTime taskdatetime;
	private int priority;
	private int taskgroup;
	private char done;
	
	public char getDone() {
		return done;
	}
	public void setDone(char done) {
		this.done = done;
	}
	public Task() {
		// TODO Auto-generated constructor stub
	}
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public int getPriority() {
		return priority;
	}
	public LocalDateTime getTaskdatetime() {
		return taskdatetime;
	}
	public void setTaskdatetime(LocalDateTime taskdatetime) {
		this.taskdatetime = taskdatetime;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getTaskgroup() {
		return taskgroup;
	}
	public void setTaskgroup(int taskgroup) {
		this.taskgroup = taskgroup;
	}
	public int getDisplayid() {
		return displayid;
	}
	public void setDisplayid(int displayid) {
		this.displayid = displayid;
	}
}
