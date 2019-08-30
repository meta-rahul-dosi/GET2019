import java.io.PrintWriter;
import java.sql.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchStudent
 */
public class SearchStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		  PrintWriter out = response.getWriter(); 
			
			try {
				JDBC jdbc = new JDBC();
				Connection conn = jdbc.connectDB();
				// Create a SQL query to insert data into demo table
				// demo table consists of two columns, so two '?' is used
				
				String fName = request.getParameter("firstName"),
						lName = request.getParameter("lastName");
				System.out.println(fName+" "+ lName);
				String query = " SELECT * FROM student_details AS SI "
						+ " WHERE SI.first_name= \" "+fName
						+ "\" AND SI.last_name=\""+lName+"\";";
				PreparedStatement ps = conn.prepareStatement(query);
				
				 out.print("<table width=25% border=1 align=center>");

	            out.print("<center><h1>Result</h1></center>");

	            ResultSet rs=ps.executeQuery(query); 
	            
	            ResultSetMetaData rsmd=rs.getMetaData();

	            out.print("<tr>");
	            out.print("<th>"+rsmd.getColumnName(1)+"</th>");
	            out.print("<th>"+rsmd.getColumnName(2)+"</th>");
	            out.print("<th>"+rsmd.getColumnName(3)+"</th>");
	            out.print("<th>"+rsmd.getColumnName(4)+"</th>");
	            out.print("<th>"+rsmd.getColumnName(5)+"</th>");
	            out.print("<th>"+rsmd.getColumnName(6)+"</th>");
	            out.print("<th>"+rsmd.getColumnName(7)+"</th>");
	            out.print("</tr>");
	            
	            while(rs.next()){
	           	out.print("<tr>");
	               out.print("<td>"+rs.getString(1)+"</td>");
	               out.print("<td>"+rs.getString(2)+"</td>");
	               out.print("<td>"+rs.getString(3)+"</td>");
	               out.print("<td>"+rs.getString(4)+"</td>"); 
	               out.print("<td>"+rs.getString(5)+"</td>");
	               out.print("<td>"+rs.getString(6)+"</td>");
	               out.print("<td>"+rs.getString(7)+"</td>");
	               out.print("<td><button type=button>update</button></td>");
	               out.print("</tr>");
	            }

	            out.print("</table>");

				

				// Close all the connections
				ps.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
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
