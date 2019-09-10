package Controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Facade.userFacade;

@SuppressWarnings("serial")
public class Login extends HttpServlet{
	/**
	 * @param HttpServletRequest
	 * @param HttpServletResponse
	 * @return null
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		userFacade user = new userFacade();
		HttpSession session = req.getSession();
		if(user.authenticatedLogin(userName, password)){
			session.setAttribute("userId",user.getUserId(userName));
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			rd.forward(req, res);
		}
		else{
			session.setAttribute("Error","Invalid Login");
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, res);
		}
	}
}