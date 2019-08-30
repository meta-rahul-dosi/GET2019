import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet Name 
@WebServlet("/classFilter")
public class ClassFilter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try {
			JDBC jdbc = new JDBC();
			Connection dbConn = jdbc.connectDB();
			// Create a SQL query to insert data into demo table
			// demo table consists of two columns, so two '?' is used

			int classId = Integer.parseInt(request.getParameter("classList"));
			System.out.println(classId);
			String query = " SELECT * FROM student_information AS SI "
					+ " WHERE SI.class=" + classId + ";";
			PreparedStatement ps = dbConn.prepareStatement(query);

			out.print("<table width=25% border=1 align=center>");

			out.print("<center><h1>Result:</h1></center>");

			ResultSet rs = ps.executeQuery();

			out.print(rs.getRow());
			ResultSetMetaData rsmd = rs.getMetaData();

			out.print("<tr>");
			out.print("<th>" + rsmd.getColumnName(1) + "</th>");
			out.print("<th>" + rsmd.getColumnName(2) + "</th>");
			out.print("<th>" + rsmd.getColumnName(3) + "</th>");
			out.print("<th>" + rsmd.getColumnName(4) + "</th>");
			out.print("<th>" + rsmd.getColumnName(5) + "</th>");
			out.print("<th>" + rsmd.getColumnName(6) + "</th>");
			out.print("<th>" + rsmd.getColumnName(7) + "</th>");

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
				out.print("<td><button type=button>update</button></td>");
				out.print("</tr>");
			}

			out.print("</table>");

			// Close all the connections
			ps.close();
			dbConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}