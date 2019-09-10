package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Facade.CartFacade;

@SuppressWarnings("serial")
public class viewCart extends HttpServlet{
	/**
	 * @param HttpServletRequest
	 * @param HttpServletResponse
	 * @return null
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		CartFacade cart = new CartFacade();
		ArrayList<String> list = cart.viewCart();
		HttpSession session = req.getSession();
		session.setAttribute("Cart", list);
		RequestDispatcher rd = req.getRequestDispatcher("displayCart.jsp");
		rd.forward(req, res);
	}
}