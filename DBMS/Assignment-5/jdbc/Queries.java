package jdbc;

import java.util.*;
import java.sql.*;

public class Queries {

	/**
	 * It is a method to return query which get details of order from the
	 * database.
	 * 
	 * @param user_id
	 * @return sql query
	 */
	public String query1(int user_id) {
		String query1 = "SELECT o.order_id, b.order_date, b.amount"
				+ " FROM users as u INNER JOIN orders as o ON u.order_id = o.order_id INNER JOIN bill as b ON o.order_no = b.order_no "
				+ " WHERE u.user_id = " + user_id + " ORDER BY order_date";
		return query1;
	}

	/**
	 * It is a method to return query to insert image of a product into image
	 * table.
	 * 
	 * @return sql query
	 */
	public String query2() {
		String query2 = "INSERT INTO images VALUES (?, ?)";
		return query2;
	}

	/**
	 * It is a method to return query to update details of a product into the
	 * database.
	 * 
	 * @return sql query
	 */
	public ArrayList<String> query3() {

		ArrayList<String> queries = new ArrayList<String>();

		String query5 = "DELETE FROM image i" + " WHERE i.product_id"
				+ " NOT IN (SELECT p.product_id FROM (SELECT p.product_id "
				+ " FROM products p"
				+ " INNER JOIN orders o ON p.product_id = o.product_id"
				+ " INNER JOIN bill b ON b.order_no = o.order_no"
				+ " WHERE DATEDIFF(CURRENT_TIMESTAMP(), b.order_date) < 365 ))";
		queries.add(query5);

		String query3 = "DELETE FROM products p" + " WHERE p.product_id"
				+ " NOT IN (SELECT p.product_id FROM (SELECT p.product_id "
				+ " FROM product p"
				+ " INNER JOIN orders o ON o.product_id = p.product_id"
				+ " INNER JOIN bill ON b.order_no = o.order_no"
				+ " DATEDIFF(CURRENT_TIMESTAMP(), b.order_date) < 365 ))";
		queries.add(query3);

		return queries;
	}
	
	
	
	/**
	 * It is a method to return query used to get parent categories and no of there child categories.
	 * @return sql query
	 */
	public String query4() {
		String query4 = " SELECT category_name, count(category_id) as children"
				+ " FROM categories "
				+ " WHERE parent_id is null "
				+ " GROUP BY category_name"
				+ " ORDER BY category_name ";
		
		return query4;
	}
}
