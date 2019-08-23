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

		Scanner sc = new Scanner(System.in);
		Queries queryObj = new Queries();
		JDBC jdbcObj = new JDBC();

		try (Connection connection = jdbcObj.connectDB();) {

			System.out.print("Enter the id of user : ");
			String user_Id = sc.next();
			
			try (PreparedStatement stmt = connection.prepareStatement(queryObj.query1(2));) {
				ResultSet rs = stmt.executeQuery("select * from users");
				System.out.println("Order_id  order_date  order_amount");
				
				while (rs.next()) {
					System.out.println(rs.getString("Order_id") + "\t"
							+ rs.getTimestamp("Order_date") + "\t"
							+ rs.getDouble("Order_Total"));
				}
				sc.close();
			}
		}
	}

}
