import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class EmpRegistration
 */
public class EmpRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmpRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			DBConnection dbconn = new DBConnection();
			Connection conn = dbconn.connectDB();
			String empId = request.getParameter("empID");
			String query = "INSERT INTO emp_details "
					+ " (fullName, gender, email, password, contact, organization, empID)"
					+ " values(?, ?, ?, ?, ?,?, ?)";

			PreparedStatement st = conn.prepareStatement(query);

			st.setString(1, request.getParameter("fullName"));
			st.setString(2, request.getParameter("gender"));
			st.setString(3, request.getParameter("email"));
			st.setString(4, request.getParameter("password"));
			st.setString(5, request.getParameter("contact"));
			st.setString(6, request.getParameter("organization"));
			st.setString(7, request.getParameter("empID"));

			// feeding input data into database
			try {
				st.executeUpdate();
			} catch (Exception e) {
				System.out.println("data cannot be put into db   " + e);
			}

//			// Validation of email for logging in user
//			String email = request.getParameter("email");
//			String queryForValidation = "SELECT empID FROM emp_details ED WHERE ED.email='"
//					+ email +"'";
//			ResultSet rs = st.executeQuery(queryForValidation);
//			rs.next();
//			int empidd = rs.getInt(1);

			// calling AddVehicle servlet
			RequestDispatcher rd = request.getRequestDispatcher("vehicleForm.html");
			rd.forward(request, response); 

		} catch (SQLException e) {
			System.out.println("SQLException is " + e);
		}
	}

}
