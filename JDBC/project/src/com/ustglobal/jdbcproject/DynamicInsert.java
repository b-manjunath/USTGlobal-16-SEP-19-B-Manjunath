package com.ustglobal.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DynamicInsert {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			String urll="jdbc:mysql://localhost:3307/manju?user=root&password=root";

			conn=DriverManager.getConnection(urll);

			String sql = "insert into project values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, 1);
			pstmt.setString(2, "manju");
			pstmt.setInt(3, 5678);
			pstmt.setString(4, "atp");
			int count =pstmt.executeUpdate();
			System.out.println(count+"rows inserted");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
