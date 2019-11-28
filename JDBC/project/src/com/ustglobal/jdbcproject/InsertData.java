package com.ustglobal.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) {
		Connection conn =null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3307/manju?user=root&password=root";
			conn=DriverManager.getConnection(url);
			stmt = conn.createStatement();
			String sql = "insert into project values(3,'manu',56789,'atp')";
		int count =stmt.executeUpdate(sql);
		System.out.println(count+"rows updated");
	

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
