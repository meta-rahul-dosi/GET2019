package jdbc;

import java.sql.*;
import java.util.*;

/**
 * Main Class
 */

public class MainClass {

	public static void main(String[] args) throws SQLException {

		JDBC jdbc = new JDBC();
		Queries queries = new Queries();
		jdbc.getConnection();
		queries.orderDetails(1);

	}
}
