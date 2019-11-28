package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;

public class SelectWithTryResources {
	public static void main(String[] args) {
		try(FileReader reader = new FileReader("db.properties")){
			Properties prop = new Properties();
			prop.load(reader);

			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			String sql = prop.getProperty("select_query");
			try(Connection conn = DriverManager.getConnection(url,prop);
					java.sql.Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql)){ 
				while(rs.next()) {

					System.out.println("Id : "+rs.getInt("id"));
					System.out.println("Name : "+rs.getString("string"));
					System.out.println("Salary : "+rs.getInt("id"));
					System.out.println("Gender : "+rs.getString("string"));
					System.out.println("***********************");


				}
			}

		}catch(Exception e) {
          e.printStackTrace();
		}
	}
}
