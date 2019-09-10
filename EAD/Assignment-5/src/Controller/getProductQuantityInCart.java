package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Facade.CartFacade;

@SuppressWarnings("serial")
public class getProductQuantityInCart extends HttpServlet{
	/**
	 * @param HttpServletRequest
	 * @param HttpServletResponse
	 * @return null
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("Hi here");
		String productCode = req.getParameter("Product");
		HttpSession session = req.getSession();
		CartFacade cart = new CartFacade();
		session.setAttribute("ProductCode",productCode);
		session.setAttribute("Quantity", cart.getProductQuantity(productCode));
		session.setAttribute("Name",cart.getProductName(productCode));
		RequestDispatcher rd = req.getRequestDispatcher("updateProductQuantity.jsp");
		rd.forward(req, res);
	}
}