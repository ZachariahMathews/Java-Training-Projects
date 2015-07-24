package mvcdemo.service.impl;

import mvcdemo.dao.LogoutDAO;
import mvcdemo.dao.impl.LogoutDAOImpl;
import mvcdemo.service.LogoutService;

public class LogoutServiceImpl implements LogoutService{

	@Override
	public void update(String user) {
		
		LogoutDAO dao=new LogoutDAOImpl();
		dao.update(user);
	}

	
}
