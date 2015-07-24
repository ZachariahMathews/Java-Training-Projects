package userLoginMVC.dao;

import java.util.Set;

import userLoginMVC.beans.User;

public interface LoadDAO {

	public Set<User> load();
}
