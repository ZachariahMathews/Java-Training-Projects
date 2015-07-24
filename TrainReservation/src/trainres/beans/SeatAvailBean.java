package trainres.beans;

public class SeatAvailBean {

	private int t_id;
	private String t_class;
	private int available;
	
	public SeatAvailBean(int t_id, String t_class, int available) {
		super();
		this.t_id = t_id;
		this.t_class = t_class;
		this.available = available;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_class() {
		return t_class;
	}
	public void setT_class(String t_class) {
		this.t_class = t_class;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
}
