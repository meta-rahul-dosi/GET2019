package com.metacube.REST1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * factory class used to creating the connection and returns the connection
 * object
 * 
 * @author Rahul
 */
public class ConnectionFactory {

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
			Class.forName("com.mysql.jdbc.Driver");

			// connection creation
			connection = (Connection) DriverManager.getConnection(mysqlURL,
					userId, password);
			return connection;

		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return null;
	}

}
