package com.example.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static DBConnection dbConnection;
	private Connection connection;

	public DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			System.out.println("JDBC Driver class is not found");
			e1.printStackTrace();
		}
	}

	public static DBConnection init() {
		if (dbConnection == null) {
			dbConnection = new DBConnection();
		}
		return dbConnection;
	}

	public Connection getConnection() {

		try {
			connection = DriverManager.getConnection(Common.DBURL, Common.USERNAME, Common.PASSWORD);
			System.out.println("Connection is established.");
		} catch (SQLException e) {
			System.out.println("Connection can not established.");
		}
		return connection;
	}

	public void close() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
