package mvcdemo.service;

import mvcdemo.bean.User;

public interface LoginService {

	public User login(String userId,String password)throws Exception;
}
