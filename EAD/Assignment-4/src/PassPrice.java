import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import temp.DBConnection;

/**
 * Servlet implementation class passPrice
 */
public class PassPrice extends HttpServlet {
	private static final long serialVeresultSetionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PassPrice() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {

			DBConnection dbconn = new DBConnection();
			Connection connection = dbconn.connectDB();

			// fetching parameters form request object
			String vehicleType = (String) request.getParameter("vehicleType");
			String currency = (String) request.getParameter("currency");
			String forTime = (String) request.getParameter("forTime");

			// getting time slot choosen for parking vehicle
			String USDPriceForTime = "";
			if (forTime.equals("daily"))
				USDPriceForTime = "dailyPrice";
			else if (forTime.equals("monthly"))
				USDPriceForTime = "monthlyPrice";
			else if (forTime.equals("yearly"))
				USDPriceForTime = "yearlyPrice";

			// query to fetch corresponding price to time slot choosen
			String query = "SELECT " + USDPriceForTime
					+ " FROM pass_prices WHERE vehicleType = '" + vehicleType
					+ "';";

			// Catching incoming DB data into resultset
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			resultSet.next();

			// calculating total cost employee has to pay
			float parkingCost = resultSet.getFloat(1);
			PrintWriter out = response.getWriter();
			if (currency.equals("USD")) {
				parkingCost = parkingCost;
				out.print("<html><h2>Total Price For Parking Your Vehicle is USD "
						+ parkingCost + "</h2></html>");
			} else if (currency.equals("INR")) {
				parkingCost *= 71.69;
				out.print("<html><h2>Total Price For Parking Your Vehicle is INR "
						+ parkingCost + "</h2></html>");
			} else if (currency.equals("YEN")) {
				parkingCost *= 106.97;
				out.print("<html><h2>Total Price For Parking Your Vehicle is YEN "
						+ parkingCost + "</h2></html>");
			}

			out.print("<html><form action='homePage.jsp' method='GET'><input type='submit' value='Proceed'></form></html>");

		} catch (Exception e) {
			System.out.println(e);
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
