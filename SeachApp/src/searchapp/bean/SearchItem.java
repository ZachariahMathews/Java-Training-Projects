package searchapp.bean;

public class SearchItem {

	private String name;
	private int salary;
	private int department;
	
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
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public SearchItem(String name, int salary, int department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
}
