package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicInsertQuery {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//step1:- load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step2:-get the connection
			String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);


			//step3:-issue sql query
			String sql = "insert into employee_info values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			String empid=args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1,id);
			String name = args[1];
			pstmt.setString(2, name);
			String empsalary = args[2];
			int salary = Integer.parseInt(empsalary);
			pstmt.setInt(3, salary);
			String gender = args[3];
			pstmt.setString(4, gender);

			int count = pstmt.executeUpdate();

			//step4:- read the results
			System.out.println(count+ "row(s) inserted");


		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//step5:- close all jdbc objects
			try {
				if(conn!=null) {
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
