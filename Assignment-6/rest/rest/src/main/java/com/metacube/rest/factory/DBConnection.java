package com.metacube.rest.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;

public class DBConnection {

	public static Connection connectDB() {

		// variables for connection with database
		String host = "jdbc:mysql://localhost:3306/";
		String dbName = "rest";
		String mysqlURL = host + dbName;
		String userId = "root";
		String password = "root";
		Connection connection;

		try {

			// loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// connection creation
			connection = (Connection) DriverManager.getConnection(mysqlURL, userId, password);
			return connection;

		} catch (ClassNotFoundException e) {
			System.out.println("error in DBConnection " + e);
		} catch (SQLException e) {
			System.out.println("exception in DBConnection" + e);
		}
		return null;
	}
}
