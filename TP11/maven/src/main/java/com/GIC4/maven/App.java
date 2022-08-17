package com.GIC4.maven;
import java.sql.*;
/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp10?" +
                    "user=phanit&password=phanit123");
			System.out.println("Connected successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
