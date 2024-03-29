package com.envestnet.doit.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.envestnet.doit.dao.LoginDAO;
import com.envestnet.doit.dao.beans.UserBean;
import com.envestnet.doit.db.SQLConnUtil;

public class LoginDAOImpl implements LoginDAO {

	@Override
	public boolean login(UserBean u) {
		
		SQLConnUtil sql=SQLConnUtil.getInstance();
		Connection conn=sql.openConnection();
		try {
			
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from USER where userid='"+u.getUserid()+"' and password='"+u.getPassword()+"'");
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally{
			sql.closeConnection();
		}
		return false;
	}

}
