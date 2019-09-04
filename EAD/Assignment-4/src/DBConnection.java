import java.sql.*;
import java.util.*;

public class DBConnection {
	/**
	 * It is a method used to open a connection with the database
	 * 
	 * @return connection object
	 * @throws SQLException
	 */
	public Connection connectDB() throws SQLException {

		// defining the connection
		String host = "jdbc:mysql://localhost:3306/";
		String dbName = "ead4";
		String mysqlURL = host + dbName;
		String userId = "root";
		String password = "root";
		Connection connection;

		try {

			// loading the driver
			Class.forName("com.mysql.jdbc.Driver");

			// connection creation
			connection = DriverManager
					.getConnection(mysqlURL, userId, password);
			System.out.println("connection successful");
			return connection;

		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		return null;
	}
}
