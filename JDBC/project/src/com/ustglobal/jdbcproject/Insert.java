package com.ustglobal.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

		try {
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/manju?user=root&password=root");
			stmt=conn.createStatement();

			String sql="insert into project values(2,'pavan',88888,'tdp')";
			int count =stmt.executeUpdate(sql);
			System.out.println(count+"rows updated");

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(stmt!=null) {
					stmt.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
