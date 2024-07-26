package com.db;

import java.sql.*;
import java.util.Scanner;

public class SQLBrowser {
	private Scanner scan;
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private ResultSetMetaData rsmd;

	public SQLBrowser() {
		try {
			scan = new Scanner(System.in);
			System.out.println("Enter SQL: ");
			String sql = scan.nextLine();

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java3rdsem", "root", "root");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			rsmd = rs.getMetaData();

			line();
			System.out.print("|");
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				System.out.print(padC(rsmd.getColumnLabel(i), rsmd.getColumnDisplaySize(i))+"|");
			}
			System.out.println();
			line();

			while(rs.next()) {
				System.out.print("|");
				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					System.out.print(padC(rs.getString(i),rsmd.getColumnDisplaySize(i))+"|");
				}
				System.out.println();
			}
			line();
		} catch(Exception e) {
		} finally {
			try {
				rs.close(); stmt.close(); conn.close();
			} catch(Exception ee) {
			}
		}
	}

	private String padC(String label, int width) {
		StringBuffer buf = new StringBuffer(label);
		for(int i=label.length(); i<width; i++) {
			if(i%2==0) {
				buf.append(" ");
			} else {
				buf.insert(0, " ");
			}
		}
		return buf.toString();
	}
	
	private void line() throws SQLException {
		System.out.print("+");
		for(int i=1; i<=rsmd.getColumnCount(); i++) {
			System.out.print(replicate("-",rsmd.getColumnDisplaySize(i))+"+");
		}
		System.out.println();
	}
	
	private String replicate(String text, int length) {
		StringBuffer buf = new StringBuffer();
		for(int i=0; i<length; i++) {
			buf.append(text);
		}
		return buf.toString();
	}
	public static void main(String[] args) {
		new SQLBrowser();
	}

}
