package mvcdemo.dao;

import java.sql.SQLException;

import mvcdemo.bean.User;

public interface LoginDAO {

	public User login(String userId,String password)throws SQLException;
}
