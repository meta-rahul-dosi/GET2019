package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Facade.productFacade;

@SuppressWarnings("serial")
public class displayProduct extends HttpServlet{
	/**
	 * @param HttpServletRequest
	 * @param HttpServletResponse
	 * @return null
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		productFacade product = new productFacade();
		ArrayList<String> list = product.getProductList();
		req.setAttribute("ProductList", list);
		RequestDispatcher rd = req.getRequestDispatcher("displayProducts.jsp");
		rd.forward(req, res);
	}
}