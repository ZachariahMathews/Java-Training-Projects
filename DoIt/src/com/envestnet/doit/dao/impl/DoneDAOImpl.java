package com.envestnet.doit.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.envestnet.doit.dao.DoneDAO;
import com.envestnet.doit.db.SQLConnUtil;

public class DoneDAOImpl implements DoneDAO {

	@Override
	public void done(int taskid) {
		
		SQLConnUtil sql=SQLConnUtil.getInstance();
		Connection conn=sql.openConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement("update TASK set done='y' where taskid=?");
			ps.setInt(1, taskid);
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally{
			sql.closeConnection();
		}
	}

}
