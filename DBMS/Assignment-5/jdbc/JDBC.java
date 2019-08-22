package jdbc;

import java.sql.*;
import java.util.*;

public class JDBC {

	public static Connection connection = null;

	public static Connection getConnection() throws SQLException {

		try {

			// loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// connection creation
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/store_front", "root", "root");

			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}

}