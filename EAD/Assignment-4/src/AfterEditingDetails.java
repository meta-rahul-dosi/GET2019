import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import temp.DBConnection;

/**
 * Servlet implementation class AfterEditingDetails
 */
public class AfterEditingDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AfterEditingDetails() {
		super();
		// TODO Auto-generated constructor stub
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
		PrintWriter out = response.getWriter();

		try {
			DBConnection dbConn = new DBConnection();
			Connection conn = dbConn.connectDB();

			HttpSession session = request.getSession();
			String fullName = request.getParameter("fullName");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String contact = request.getParameter("contact");
			String organization = request.getParameter("organization");

			int empID = (int) session.getAttribute("empID");

			String query = "UPDATE emp_details	SET fullName = ?, email = ?, password = ?,  contact = ?, organization = ?"
					+ "WHERE empID =" + empID;

			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, request.getParameter("fullName"));
			st.setString(2, request.getParameter("email"));
			st.setString(3, request.getParameter("password"));
			st.setString(4, request.getParameter("contact"));
			st.setString(5, request.getParameter("organization"));

			// putting input data into database
			try {
				st.execute();
				out.print("<html><h2>successfully updated !!</h2></html>");
			} catch (Exception e) {
				System.out.println("data cannot be put into db   " + e);
			}

			// showing friends list

			Statement statement = conn.createStatement();
			String friendsList = "SELECT fullName, empID FROM emp_details WHERE empID != "
					+ empID + " AND organization = '" + organization + "'";
			ResultSet resultSet1 = statement.executeQuery(friendsList);
			ResultSetMetaData rsmd = resultSet1.getMetaData();
			String columnName1 = rsmd.getColumnName(1);
			String columnName2 = rsmd.getColumnName(2);

			out.print("<html><h2><a href='#friend'>Friends</a></h2><html>");

			// numberOfFriends
			while (resultSet1.next()) {
				String friendName = resultSet1.getString(columnName1);
				int friendID = resultSet1.getInt(columnName2);
				session.setAttribute("friendName", friendName);
				session.setAttribute("friendID", friendID);
				System.out.println(friendName  + "        fdgeg  reg   " + friendID);
				out.print("<html><a name='friend' href='showFriendProfile.jsp'>"
						+ friendName + "</a></html>");
				out.print("<html><br><br></html>");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
