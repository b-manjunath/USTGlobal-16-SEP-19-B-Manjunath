package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class MySecondJDBC {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {

			//step1:- load the  driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step2:- get the connection
			String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//step 3:- issue SQL Query
			String sql = "insert into employee_info values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);

			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);

			String empname = args[1];
			pstmt.setString(2,empname);

			String empsalary = args[2];
			int salary = Integer.parseInt(empsalary);
			pstmt.setString(3,empsalary);

			String gender = args[3];
			pstmt.setString(4,gender);

			int count =pstmt.executeUpdate();

			//step4:- read the result

			System.out.println(count + "rows inserted");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {

			//step5: close all jdbc objects
			try {
				if(conn!= null) {
					conn.close();
				}if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
