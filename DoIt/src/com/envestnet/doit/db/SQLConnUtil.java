package com.envestnet.doit.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SQLConnUtil {

	private static SQLConnUtil tc;
	private Connection conn;
	private static Properties dbProperties=null;

	private SQLConnUtil(){


	}

	static{

		dbProperties=new Properties();
		InputStream is=SQLConnUtil.class.getResourceAsStream("/com/envestnet/doit/db/db.properties");
		try {
			dbProperties.load(is);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try{

			Class.forName(dbProperties.getProperty("driver"));
			//System.out.println("Driver loaded...");
		}
		catch(ClassNotFoundException e){

			e.printStackTrace();
		}
	}

	public Connection openConnection(){

		try {
			if(conn==null||conn.isClosed())
				conn=DriverManager.getConnection(dbProperties.getProperty("url"),dbProperties.getProperty("user"),dbProperties.getProperty("password"));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return conn;
	}

	public void closeConnection(){

		try {
			if(conn!=null&&!conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Connection closed...");
	}

	public static SQLConnUtil getInstance(){

		if(tc==null){
			tc=new SQLConnUtil();
		}
		return tc;
	}

	/*public static void main(String[] args) throws Exception{

		SQLConnUtil tc=SQLConnUtil.getInstance();
		Connection conn=tc.openConnection();
		System.out.println("Connection created...");
		Statement st=conn.createStatement();

		ResultSet rs=st.executeQuery("select * from trainers");
		ResultSetMetaData md=rs.getMetaData();

		for(int i=0;i<md.getColumnCount();i++){

			System.out.println(md.getColumnName(i+1)+" : "+md.getColumnTypeName(i+1));
		}

		String sql="select * from trainers where tid=?";
		//ResultSet rs=st.executeQuery("select * from trainers");
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1,10);
		ResultSet pstrs=pst.executeQuery();

		while(pstrs.next()){

			System.out.println(pstrs.getInt("tid")+","+pstrs.getString("name"));
		}
		pstrs.close();*/

		/*while(rs.next()){

			System.out.println(rs.getInt("tid")+","+rs.getString("name"));
		}
		rs.close();
		st.close();
		tc.closeConnection();
	}*/
}
