package userLoginMVC.handlers;

import java.util.Set;

import userLoginMVC.beans.User;
import userLoginMVC.services.LoadService;
import userLoginMVC.services.impl.LoadServiceImpl;

public class LoadHandler {

	public Set<User> load() {
		
		LoadService ls=new LoadServiceImpl();
		return ls.load();
		
	}

}
