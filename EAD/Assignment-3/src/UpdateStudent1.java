import java.io.PrintWriter;
import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateStudent1
 */

public class UpdateStudent1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateStudent1() {
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

				JDBC jdbc = new JDBC();
				Connection connection = jdbc.connectDB(); 				
				
				int id = Integer.parseInt(request.getParameter("id")),
						class1 = Integer.parseInt(request.getParameter("class")),
						age = Integer.parseInt(request.getParameter("age"));
				String first_name = request.getParameter("firstName"),
						last_name = request.getParameter("lastName"),
						father_name = request.getParameter("fatherName"),
						email = request.getParameter("email");
				
				String query = "UPDATE student_details"
						+ " SET first_name=\""+first_name+"\", last_name=\""+last_name+"\", father_name=\""+father_name
						+"\", email=\""+email+"\", class="+class1+", age="+age
						+" WHERE id="+id;
				PreparedStatement st = connection.prepareStatement(query);


				int flag=0;
				try{
					st.executeUpdate(query);
				} catch(java.sql.SQLIntegrityConstraintViolationException e){
					flag = 1;
					PrintWriter out = response.getWriter();
					out.println("<html><body><b>Duplicate entry for email"
							+ "</b><br><br>"
							+ "<button type=button onclick=\"window.location.href='ShowStudents'\";>"
							+ "show students</button></body></html>");
				}
				

				// Close all the connections
				st.close();
				connection.close();
				// Get a writer pointer
				// to display the successful result
				PrintWriter out = response.getWriter();
				if(flag==0)
				out.println("<html><body><b>Successfully Updated"
						+ "</b><br><br>"
						+ "<button type=button onclick=\"window.location.href='ShowStudents'\";>"
						+ "show students</button></body></html>");
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}

}
