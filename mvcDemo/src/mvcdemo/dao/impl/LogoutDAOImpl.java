package mvcdemo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mvcdemo.dao.LogoutDAO;
import mvcdemo.db.SQLConnUtil;

public class LogoutDAOImpl implements LogoutDAO{

	@Override
	public void update(String user) {
		
		SQLConnUtil sqlconn=SQLConnUtil.getInstance();
		Connection conn=sqlconn.openConnection();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("insert into login_event(login_id,logindate) values(?,SYSDATETIME())");
			ps.setString(1, user);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		sqlconn.closeConnection();		
	}

}
