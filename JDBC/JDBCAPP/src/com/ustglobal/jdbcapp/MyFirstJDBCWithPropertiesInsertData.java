package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class MyFirstJDBCWithPropertiesInsertData {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;

		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			//step1:- load the driver
			//Driver driver = new Driver();
			Class.forName(prop.getProperty("driver-class-name"));

			//step2:-get the connection
			String url =prop.getProperty("url");
			conn = DriverManager.getConnection(url);


			//step3:-issue sql query
			String sql = prop.getProperty("insert-query");
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
			}catch(Exception e) {
				e.printStackTrace();
			}

		}
	}

}
