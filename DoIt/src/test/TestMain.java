package test;

import com.envestnet.doit.db.SQLConnUtil;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SQLConnUtil sql=SQLConnUtil.getInstance();
		sql.openConnection();
		System.out.println("connected");
		sql.closeConnection();
	}

}
