package userLoginMVC.services.impl;

import userLoginMVC.beans.User;
import userLoginMVC.dao.UpdateDAO;
import userLoginMVC.dao.impl.UpdateDAOImpl;
import userLoginMVC.services.UpdateService;

public class UpdateServiceImpl implements UpdateService {

	@Override
	public void update(User u) {
		
		UpdateDAO dao=new UpdateDAOImpl();
		dao.update(u);
	}

}
