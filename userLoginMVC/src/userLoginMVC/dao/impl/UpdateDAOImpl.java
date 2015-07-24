package userLoginMVC.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import userLoginMVC.beans.User;
import userLoginMVC.dao.UpdateDAO;
import userLoginMVC.db.SQLConnUtil;

public class UpdateDAOImpl implements UpdateDAO {

	@Override
	public void update(User u) {
		
		SQLConnUtil sqlconn=SQLConnUtil.getInstance();
		Connection conn=sqlconn.openConnection();
		try {
			PreparedStatement ps=conn.prepareStatement("insert into T_USER_0998 values(?,?)");
			ps.setInt(1, u.getId());
			ps.setString(2, u.getName());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			sqlconn.closeConnection();
		}
	}

}
