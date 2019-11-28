package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJDBCWithProperties {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			//step1:- load the driver
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName(prop.getProperty("driver-class-name"));

			//step2:- get the connection
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);

			//Step 3:- Issue SQL Query
			String sql = prop.getProperty("select-query");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			//Step 4:- Read The Results
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int salary = rs.getInt("salary");
				String gender = rs.getString("gender");

				System.out.println("Id : "+id);
				System.out.println("Name : "+name);
				System.out.println("Salary : "+salary);
				System.out.println("Gender : "+gender);
				System.out.println("***********************");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//Step 5:- Close All Costly Resources
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					conn.close();
				}
				if(rs!=null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
}
