package userLoginMVC.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

import userLoginMVC.beans.User;
import userLoginMVC.dao.LoadDAO;
import userLoginMVC.db.SQLConnUtil;
import userLoginMVC.util.ConvertSetUtil;

public class LoadDAOImpl implements LoadDAO {

	@Override
	public Set<User> load() {
		
		SQLConnUtil sqlconn=SQLConnUtil.getInstance();
		Connection conn=sqlconn.openConnection();
		Set<User> users=null;
		try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from T_USER_0998");
			users=ConvertSetUtil.convert(rs);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally{
			sqlconn.closeConnection();
		}
		return users;
	}

}
