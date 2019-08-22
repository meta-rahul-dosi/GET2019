package jdbc;

import java.util.*;
import java.sql.*;

public class Queries {

	public void orderDetails(int user_id) throws SQLException {
		// statement creation
		Statement statement = JDBC.connection.createStatement();

		// query execution
		ResultSet rs = statement.executeQuery("SELECT * FROM products");
		ResultSetMetaData resultSet = rs.getMetaData();

		int columnsNumber = resultSet.getColumnCount();

		while (rs.next()) {
			for (int i = 1; i <= columnsNumber; i++) {
				String columnValue = rs.getString(i);
				System.out.print(resultSet.getColumnName(i) + "   "
						+ columnValue + "\n");

			}
			System.out.println("\n");
		}
	}

}
