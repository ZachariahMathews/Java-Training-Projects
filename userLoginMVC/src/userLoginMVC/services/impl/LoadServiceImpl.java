package userLoginMVC.services.impl;

import java.util.Set;

import userLoginMVC.beans.User;
import userLoginMVC.dao.LoadDAO;
import userLoginMVC.dao.impl.LoadDAOImpl;
import userLoginMVC.services.LoadService;

public class LoadServiceImpl implements LoadService {

	@Override
	public Set<User> load() {
		
		LoadDAO dao=new LoadDAOImpl();
		return dao.load();
	}

}
