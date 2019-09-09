import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import temp.DBConnection;
/**
 * Servlet implementation class AddVehicle
 */
public class AddVehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddVehicle() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {

			DBConnection dbConn = new DBConnection();
			Connection conn = dbConn.connectDB();
			String query = "INSERT INTO vehicle_details"
					+ " (vehicleName, vehicleType, vehicleNumber, empID, identification)"
					+ " values(?, ?, ?, ?, ?)";

			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, request.getParameter("vehicleName"));
			st.setString(2, request.getParameter("vehicleType"));
			st.setString(3, request.getParameter("vehicleNumber"));
			st.setInt(4, Integer.parseInt(request.getParameter("empID")));
			st.setString(5, request.getParameter("identification"));

			// putting data in database
			try {
				st.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// creating session
			HttpSession session = request.getSession();
			session.setAttribute("empID",
					Integer.parseInt(request.getParameter("empID")));
			session.setAttribute("vehicleType",
					request.getParameter("vehicleType"));
			session.setAttribute("vehicleNumber",
					request.getParameter("vehicleNumber"));
			RequestDispatcher rd = request
					.getRequestDispatcher("passPrice.jsp");
			rd.forward(request, response);

			// Close all the connections
			st.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("exception is " + e);
			;
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
