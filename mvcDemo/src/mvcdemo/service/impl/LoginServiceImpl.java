package mvcdemo.service.impl;

import mvcdemo.bean.User;
import mvcdemo.dao.LoginDAO;
import mvcdemo.dao.impl.LoginDAOImpl;
import mvcdemo.service.LoginService;

public class LoginServiceImpl implements LoginService{

	@Override
	public User login(String userId, String password) throws Exception {
		
		LoginDAO da=(LoginDAO) new LoginDAOImpl();
		return da.login(userId, password);
	}

}
