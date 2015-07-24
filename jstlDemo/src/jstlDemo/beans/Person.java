package jstlDemo.beans;

import java.util.Date;

public class Person {

	private String name;
	private int salary;
	private Date doj;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Person(String name, int salary, Date doj) {
		super();
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}
	
}
