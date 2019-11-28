package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {

			//step1:- load the driver 
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step 2:-get the connection
			String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=root";  
			conn = DriverManager.getConnection(url);

			//step3:-issue sql query
			String sql = "delete from employee_info where id = 2";

			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);

			//step4:- read the result
			System.out.println(count + "rows deleted");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//step 5:- close all jdbc objects
			try {
				if(conn!=null) {
					conn.close();
				}if(stmt!=null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}


	}//main closed

}//class closed
