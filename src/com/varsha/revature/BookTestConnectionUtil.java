package com.varsha.revature;

import java.sql.Connection;
import java.sql.DriverManager;

public class BookTestConnectionUtil {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookapp_db", "root", "root");
		System.out.println(conn);

	}
}
