package com.varsha.revature;

import java.sql.Connection;
import java.sql.DriverManager;

public class OrderTestConnectionUtil {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dive", "root", "root");
		System.out.println(conn);
	}
}
