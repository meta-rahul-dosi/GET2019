import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
			System.out.println(empID);
			
			String query = "insert into emp_details (fullName, email, password, contact, organization) values (?,?,?,?,?) where empID='"
					+ empID + "';";

			PreparedStatement st = conn.prepareStatement(query);

			st.setString(1, request.getParameter("fullName"));
			st.setString(3, request.getParameter("email"));
			st.setString(4, request.getParameter("password"));
			st.setString(5, request.getParameter("contact"));
			st.setString(6, request.getParameter("organization"));

			// putting input data into database
			try {
				st.execute();
			} catch (Exception e) {
				System.out.println("data cannot be put into db   " + e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}