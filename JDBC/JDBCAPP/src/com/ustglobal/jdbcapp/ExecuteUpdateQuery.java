package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery {
	public static void main(String[] args) {
		Connection conn =null;
		Statement stmt = null;
		try {

			//step1:- load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step2:- get the connection
			String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//step3:- issue sql query
			String sql = "update employee_info set name='lahari',salary=25000,gender='M' where id =5";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);

			//step4:- read the result
			System.out.println(count + "rows updated");
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

	}//main() closed
}//executeupdatequery class closed
