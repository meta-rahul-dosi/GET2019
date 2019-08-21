package jdbc;

import java.sql.*;

public class JDBC {

	public static Connection getConnection() throws SQLException {

		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/storefront", "root", "root");

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery("SELECT * FROM products");
			System.out.println(resultSet);

		} catch (ClassNotFoundException e) {
			System.out.println("error loading driver" + e);
		}

		connection.close();
		return connection;
	}

}