package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * It is a class for Assignment2
 * 
 * @author Vertika
 *
 */
public class Query2 {

	/**
	 * It is a method used for batch Insert.
	 * 
	 * @param imageList
	 *            List of images to be inserted
	 * @param product_id
	 *            product id
	 * @throws SQLException
	 */
	public static void insertImage(List<String> imageList, String product_id)
			throws SQLException {

		JDBC jdbcObj = new JDBC();
		Queries queryObj = new Queries();

		try (Connection connection = jdbcObj.connectDB();
				PreparedStatement stmt = connection.prepareStatement(queryObj
						.query2());) {

			for (int i = 0; i < imageList.size(); i++) {
				String columnValues[] = imageList.get(i).split(",");
				stmt.setString(1, columnValues[0]);
				stmt.setString(2, product_id);
				stmt.addBatch();
			}
			int[] result = stmt.executeBatch();
			System.out.println("The number of rows inserted  : "
					+ result.length);
		}
	}

	/**
	 * It is a main method.
	 * 
	 * @param args
	 *            unused.
	 * @throws SQLException
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {
			List<String> url = new ArrayList<String>();
			System.out
					.print("Enter the id of product for which u want to insert images  : ");
			String product_id = sc.next();
			System.out.println("Enter the no of images you want to add : ");
			int noOfImages = sc.nextInt();
			for (int i = 0; i < noOfImages; i++) {
				System.out.println("Enter the image id : ");
				String image_id = sc.next();
				String tuple = image_id ;
				url.add(tuple);
			}
			insertImage(url, product_id);
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			sc.close();
		}
	}
}
