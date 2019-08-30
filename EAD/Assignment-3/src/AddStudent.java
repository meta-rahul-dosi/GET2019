import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class AddStudent
 */
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public AddStudent() {

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		JDBC jdbc = new JDBC();
		Connection connection = null;

		try {
			connection = jdbc.connectDB();
			Statement stmt = connection.createStatement();

			// getting data from user
			String first_name = request.getParameter("first_name");
			String last_name = request.getParameter("last_name");
			String father_name = request.getParameter("father_name");
			String email = request.getParameter("email");
			int class1 = Integer.parseInt(request.getParameter("class"));
			int age = Integer.parseInt(request.getParameter("age"));

			int rows  = stmt.executeUpdate("insert into student_details(first_name, last_name, father_name, email, class, age)"
					+ "values("
					+ "'"
					+ first_name
					+ "',"
					+ "'"
					+ last_name
					+ "',"
					+ "'"
					+ father_name
					+ "',"
					+ "'"
					+ email
					+ "'," + "'" + class1 + "'," + "'" + age + "')");
			
		  System.out.println("no of rows affected : " + rows);
			
			// sending response to the user
			PrintWriter out = response.getWriter();
			out.print("<h1>Student is successfully added!</h1>");
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
