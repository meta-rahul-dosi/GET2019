package jdbc;

import java.util.*;
import java.sql.*;

public class Queries {

	/**
	 * It is a method to return query which get details of order from the database.
	 * @param user_Id id of user
	 * @return sql query
	 */
	public String query1(int user_id) {
		String query1 = "SELECT o.order_id, b.order_date, SUM((p.product_price*(100-oi.discount)/100)*oi.ordered_quantity) AS Order_Total FROM shopping_order so"
				+ " INNER JOIN order_item oi ON so.order_id = oi.order_id "
				+ " INNER JOIN stock s ON s.stock_id = oi.stock_id "
				+ " INNER JOIN product p ON p.product_id = s.product_id "
				+ " WHERE u.user_id = '" + user_id + "' AND o.status = 'shipped' "
				+ " GROUP BY order_id "
				+ " ORDER BY order_date" ;
		return query1;
	}

}
