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
public class updateQuantity extends HttpServlet{
	/**
	 * @param HttpServletRequest
	 * @param HttpServletResponse
	 * @return null
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		HttpSession session = req.getSession();
		int quantity = 0;
		CartFacade cart = new CartFacade();
		String productCode = (String) session.getAttribute("ProductCode");
		if(req.getParameter("Quantity")!=null){
			quantity = Integer.parseInt(req.getParameter("Quantity"));
			cart.executeUpdateQuantityQuery(productCode, quantity);
		}
		else{
			quantity = (int)session.getAttribute("Quantity");
			session.removeAttribute("Quantity");
			cart.executeIncreaseQuantityQuery(productCode, quantity);
		}
		if(quantity==0){
			session.removeAttribute("Product");
			session.setAttribute("ProductCode",productCode);
			RequestDispatcher rd = req.getRequestDispatcher("deleteProduct");
			rd.forward(req, res);
		}
		session.removeAttribute("Product");
		RequestDispatcher rd = req.getRequestDispatcher("viewCart");
		rd.forward(req, res);
	}
}