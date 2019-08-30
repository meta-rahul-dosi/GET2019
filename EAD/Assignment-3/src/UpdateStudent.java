import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateStudent
 */
public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateStudent() {
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

		PrintWriter out = response.getWriter();
		try {

			out.println("<h1>Update Student</h1>");

			int id = Integer.parseInt(request.getParameter("id")), class1 = Integer
					.parseInt(request.getParameter("class")), age = Integer
					.parseInt(request.getParameter("age"));
			String first_name = request.getParameter("first_name"), last_name = request
					.getParameter("last_name"), father_name = request
					.getParameter("father_name"), email = request
					.getParameter("email");

			out.println("<html>");
			out.print("<form action='UpdateStudent1' method='post'>");
			out.print("ID:<input type='hidden' name='id' value='" + id
					+ "'/><br><br>");
			out.print("First Name:<input name='first_name' value='"
					+ first_name + "'/><br><br>");
			out.print("Last Name:<input name='last_name' value='" + last_name
					+ "'/><br><br>");
			out.print("Father Name:<input name='father_name' value='"
					+ father_name + "'/><br><br>");
			out.print("Email:<input name='email' value='" + email
					+ "'/><br><br>");
			out.print("Class:<input type='number' name='class' value='"
					+ class1 + "'/><br><br>");
			out.print("Age:<input type='number' name='age' value='" + age
					+ "'/><br><br>");
			out.print("<input type='submit'>");
			out.print("</form></html>");

			out.close();

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
