package trainres.beans;

public class PassengerBean {

	private int p_id;
	private String p_name;
	
	public PassengerBean(int p_id, String p_name) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getName() {
		return p_name;
	}
	public void setName(String name) {
		this.p_name = name;
	}
}
