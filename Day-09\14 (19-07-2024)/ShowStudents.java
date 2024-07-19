package com.db;

// Step-1: Import java.sql package
import java.sql.*;

public class ShowStudents {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public ShowStudents() {
		try {
			// Step-2: Load & Register Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// step-3: Create Connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java3rdsem","root","root");
	
			// Step-4: Create Statement
			stmt = conn.createStatement();
			
			// Step-5: Create ResultSet
			rs = stmt.executeQuery("SELECT * FROM student");

			// Step-6: Manipulate ResultSet
			while(rs.next()) {
				System.out.println(
						rs.getString("id")+"  "+
						rs.getString("name")+"  "+
						rs.getString("father")+"  "+
						rs.getString("email")+"  "+
						rs.getString("mobile")
				);
			}

			// Step-7 Close all
			rs.close();
			stmt.close();
			conn.close();
		} catch(ClassNotFoundException e) {
		} catch(SQLException e) {
		}
	}

	public static void main(String[] args) {
		new ShowStudents();
	}

}
