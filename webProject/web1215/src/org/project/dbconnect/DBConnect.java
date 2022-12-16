package org.project.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() {
		Connection conn = null;
		
		String Url = "jdbc:oracle:thin:@localhost:1521:xe";
		String Driver = "oracle.jdbc.driver.OracleDriver";
		String User = "system";
		String Password = "1234";
		
		try {
			Class.forName(Driver);
			System.out.println("Driver OK !");
			
			conn = DriverManager.getConnection(Url, User, Password);
			System.out.println("DB Connect Success !");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver Fail !");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB Connect Fail !");

		}		
		
		return conn;
		
	}
	
}
