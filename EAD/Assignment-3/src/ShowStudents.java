import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowStudents
 */

public class ShowStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowStudents() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		DBConnection DBConnection = new DBConnection();
		Connection connection = null;

		try {
			connection = DBConnection.connectDB();
			Statement statement = connection.createStatement();

			ResultSet rs = statement
					.executeQuery("SELECT * FROM student_details");
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();

			PrintWriter out = response.getWriter();

			out.print("<table width=25% border=1>");
			out.print("<tr>");
			int i = 1;
			while (i <= columnsNumber) {
				out.print("<th>" + rsmd.getColumnName(i++) + "</th>");
			}
			out.print("</tr>");
			while (rs.next()) {

				out.print("<tr>");
				out.print("<td>" + rs.getString(1) + "</td>");
				out.print("<td>" + rs.getString(2) + "</td>");
				out.print("<td>" + rs.getString(3) + "</td>");
				out.print("<td>" + rs.getString(4) + "</td>");
				out.print("<td>" + rs.getString(5) + "</td>");
				out.print("<td>" + rs.getString(6) + "</td>");
				out.print("<td>" + rs.getString(7) + "</td>");
				out.print("<td><button type=button onclick=\"window.location.href = 'UpdateStudent?id="
						+ rs.getInt(1)
						+ "&first_name="
						+ rs.getString(2)
						+ "&last_name="
						+ rs.getString(3)
						+ "&father_name="
						+ rs.getString(4)
						+ "&email="
						+ rs.getString(5)
						+ "&class="
						+ rs.getInt(6)
						+ "&age="
						+ rs.getInt(7)
						+ "';\">update</button></td>");
				out.print("</tr>");
			}

			out.print("</table>");

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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
