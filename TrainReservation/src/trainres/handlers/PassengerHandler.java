package trainres.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import trainres.beans.PassengerBean;

public class PassengerHandler {

	private HttpServletRequest request;

	public PassengerHandler(HttpServletRequest request) {
		
		this.request = request;
	}
	
	public void storePassenger(){
		
		PassengerBean pb=new PassengerBean(Integer.parseInt(request.getParameter("pid")),request.getParameter("name"));
		HttpSession session=request.getSession();
		session.setAttribute("passenger", pb);
	}
}
