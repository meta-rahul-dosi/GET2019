package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * It is a class for assignment3
 * 
 * @author Vertika
 *
 */
public class Query3 {

	/**
	 * It is a main method used to return number of product effected on a
	 * particular condition.
	 * 
	 * @param args
	 *            unused
	 * @throws SQLException
	 */
	public static void main(String args[]) throws SQLException {

		JDBC jdbcObj = new JDBC();
		Queries queryObj = new Queries();
		ArrayList<String> queries = queryObj.query3();

		try (Connection connection = jdbcObj.connectDB();
				PreparedStatement stmt = connection.prepareStatement(queries
						.get(0))) {
			stmt.executeUpdate();
		}
		try (Connection con = jdbcObj.connectDB();
				PreparedStatement stmt = con.prepareStatement(queries.get(1))) {
			int rowsAffected = stmt.executeUpdate();
			System.out.println("Number of product effected  : " + rowsAffected);
		}
	}
}
