package com.envestnet.doit.beans;

import java.io.Serializable;

public class User implements Serializable{

	private String userid;
	private String password;
	
	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User(String userid, String password) {
		this.userid = userid;
		this.password = password;
	}
	
}