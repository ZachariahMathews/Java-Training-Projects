package trainres.beans;

public class JourneyBean {

	private int p_id;
	private int t_id;
	private String t_class;
	private int seats;
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
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
	public int getseats() {
		return seats;
	}
	public void setseats(int seats) {
		this.seats = seats;
	}
	public JourneyBean(int p_id, int t_id, String t_class, int seats) {
		super();
		this.p_id = p_id;
		this.t_id = t_id;
		this.t_class = t_class;
		this.seats = seats;
	}
	
}
