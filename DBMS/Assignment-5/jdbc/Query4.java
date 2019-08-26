package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * It is a class for assignment 4
 * 
 * @author Vertika
 *
 */
public class Query4 {

	/**
	 * It is a main method used to get category and number of there child
	 * categories.
	 * 
	 * @param args
	 *            unused
	 * @throws SQLException
	 */
	public static void main(String args[]) throws SQLException {
		JDBC jdbcObj = new JDBC();
		Queries queryObj = new Queries();

		try (Connection con = jdbcObj.connectDB();
				PreparedStatement stmt = con
						.prepareStatement(queryObj.query4())) {
			ResultSet rs = stmt.executeQuery();
			System.out.println("Category_Name  SubCategories");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getInt(2));
			}
		}
	}
}

