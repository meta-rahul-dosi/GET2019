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
public class deleteProduct extends HttpServlet{
	/**
	 * @param HttpServletRequest
	 * @param HttpServletResponse
	 * @return null
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String productCode = "";
		HttpSession session = req.getSession();
		if(req.getParameter("Product")!=null)
			productCode = req.getParameter("Product");
		else
			productCode = (String) session.getAttribute("ProductCode");
		CartFacade cart = new CartFacade();
		cart.deleteProductFromCart(productCode);
		session.setAttribute("Message","Product Deleted From Cart Successfully");
		RequestDispatcher rd = req.getRequestDispatcher("viewCart");
		rd.forward(req, res);
	}
}