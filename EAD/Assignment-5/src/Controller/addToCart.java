package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Facade.CartFacade;

@SuppressWarnings("serial")
public class addToCart extends HttpServlet{
	/**
	 * @param HttpServletRequest
	 * @param HttpServletResponse
	 * @return null
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		HttpSession session = req.getSession();
		String productCode = (String) session.getAttribute("ProductCode");
		int quantity = Integer.parseInt(req.getParameter("Quantity"));
		session.removeAttribute("ProductCode");
		session.removeAttribute("Quantity");
		CartFacade cart = new CartFacade();
		if(cart.isProductPresentInCart(productCode)){
			System.out.println("Hi i am in");
			session.setAttribute("ProductCode", productCode);
			session.setAttribute("Quantity",quantity);
			res.sendRedirect("updateQuantity");
		}else{
		cart.addProductToCart(productCode, quantity);
		req.setAttribute("Message","Product Successfully Added To Cart");
		res.sendRedirect("home.jsp");
		}
		
		
	}
}