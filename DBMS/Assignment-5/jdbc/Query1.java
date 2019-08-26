package jdbc;

import java.util.*;
import java.sql.*;

public class Query1 {

	/**
	 * It is a main method to get order details.
	 * 
	 * @param args
	 *            unused
	 * @throws SQLException
	 */
	public static void main(String args[]) throws SQLException {

		Queries queryObj = new Queries();
		JDBC jdbcObj = new JDBC();

		try (Connection connection = jdbcObj.connectDB();) {

			try (PreparedStatement stmt = connection.prepareStatement(queryObj
					.query1(2));) {

				ResultSet rs = stmt.executeQuery(queryObj.query1(201));

				System.out.println("order_id  order_date  amount");

				while (rs.next()) {
					System.out.println(rs.getInt("order_id") + "\t"
							+ rs.getDate("order_date") + "\t"
							+ rs.getInt("amount"));
				}
			} catch (Exception e) {
				System.out.println("inner catch says " + e);
			}
		} catch (Exception e) {
			System.out.println("outer catch says  " + e);
		}
	}

}
