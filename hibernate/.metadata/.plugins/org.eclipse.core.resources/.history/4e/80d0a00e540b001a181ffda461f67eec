package com.ustglobal.databasecurdoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import com.mysql.jdbc.Driver;

public class DynamicUpdate {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//step1:- load the driver class
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");    //its optional

			//step2:-get the connection
			String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);


			//step3:-issue sql query
			String sql = "update employee_info set name=? ,salary=? ,gender=? where id=?";
			pstmt = conn.prepareStatement(sql);

			//step4:- read the results
			String empid = args[0];
			int id = Integer.parseInt(empid);
			//pstmt.setInt(1, id);

			String empname = args[1];
			//pstmt.setString(2,empname);

			String empsalary = args[2];
			int salary = Integer.parseInt(empsalary);
			//pstmt.setString(3,empsalary);

			String gender = args[3];
			//pstmt.setString(4,gender);

			pstmt.setInt(4,id);
			pstmt.setString(1, empname);
			pstmt.setInt(2,salary);
			pstmt.setString(3, gender);

			int Count = pstmt.executeUpdate();
			System.out.println(Count+ "row(s) updated");


		}catch(Exception e) {
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
