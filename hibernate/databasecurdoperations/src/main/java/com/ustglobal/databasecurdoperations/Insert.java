package com.ustglobal.databasecurdoperations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;

public class Insert {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		//PreparedStatement pstmt = null;
		try {

			//step 1 :-load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step 2:- get the connection
			String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//step 3:- issue SQL query

			//String sql = "insert into employee_info values(?,?,?,?)";   ----------> Dynamic

			String sql = " insert into employee_info values(600,'kohli',120000,'M') ";  
			stmt = conn.createStatement();
			//pstmt = conn.prepareStatement(sql); -----> Dynamic

			//
			//			String empid=args[0];                   ------------------
			//			int id = Integer.parseInt(empid);                         |
			//			pstmt.setInt(1,id);                                       |
			//			String name = args[1];                                    |
			//			pstmt.setString(2, name);                                 |-------------> Dynamic 
			//			String empsalary = args[2];                               | 
			//			int salary = Integer.parseInt(empsalary);                 |
			//			pstmt.setInt(3, salary);                                  |
			//			String gender = args[3];                                  |
			//			pstmt.setString(4, gender);             -------------------
			//			
			int count = stmt.executeUpdate(sql);

			//step 4:- read the result
			System.out.println(count + "Rows inserted");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//step 5:- close all JDBC Objects (costly resources)
			try {
				if(conn != null) {
					conn.close();
				}if(stmt != null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}//end of main()
}//end of executeinsertquery
