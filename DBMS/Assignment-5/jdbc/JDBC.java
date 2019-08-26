package jdbc;

import java.sql.*;
import java.util.*;

public class JDBC {
	/**
	 * It is a method used to open a connection with the database
	 * 
	 * @return connection object
	 * @throws SQLException
	 */
	public Connection connectDB() throws SQLException {

		// defining the connection
		String host = "jdbc:mysql://localhost:3306/";
		String dbName = "store_front";
		String mysqlURL = host + dbName;
		String userId = "root";
		String password = "root";
		Connection connection;

		try {

			// loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

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
