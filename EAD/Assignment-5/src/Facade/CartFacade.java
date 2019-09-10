package Facade;

import java.sql.SQLException;
import java.util.ArrayList;

import Dao.CartDao;
import Dao.ProductDao;

public class CartFacade {

	public boolean addProductToCart(String productCode ,int quantity){
		CartDao query = new CartDao();		
		try {
			query.executeAddProductToCartQuery(productCode, quantity);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	public ArrayList<String> viewCart(){
		CartDao query = new CartDao();
		ArrayList<String> list = null;
		ArrayList<String> products = null;
		ArrayList<String> cart = new ArrayList<String>();
		try {
			list = query.executeViewCartQuery();
			for(int index=0; index<list.size(); index++){
				String productCode=list.get(index++);
				ProductDao product = new ProductDao();
				products = product.executeGetProductDetails(productCode);
				cart.add(products.get(0));
				cart.add(products.get(1));
				cart.add(products.get(2));
				cart.add(products.get(3));
				cart.add(list.get(index));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return cart;
	}
	public boolean deleteProductFromCart(String productCode){
		CartDao query = new CartDao();		
		try {
			query.executeDeleteProductFromCart(productCode);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	public int getProductQuantity(String productCode){
		CartDao query = new CartDao();
		int quantity =0;
		try {
			quantity = query.executeGetProductQuantity(productCode);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return quantity;
	}
	public String getProductName(String productCode){
		CartDao query = new CartDao();
		String name ="";
		try {
			name = query.executeGetProductName(productCode);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return name;
	}
	public boolean executeUpdateQuantityQuery(String productCode , int quantity){
		CartDao query = new CartDao();
		try {
			query.executeUpdateQuantityQuery(productCode, quantity);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean executeIncreaseQuantityQuery(String productCode , int quantity){
		CartDao query = new CartDao();
		try {
			int existingQuantity = query.executeGetProductQuantity(productCode);
			query.executeUpdateQuantityQuery(productCode, (quantity+existingQuantity));
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean isProductPresentInCart(String productCode){
		CartDao query = new CartDao();
		boolean flag = false;
		try {
			if(query.executeGetProductQuantity(productCode)>0){
				flag = true;
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
}