package Facade;

import java.sql.SQLException;
import java.util.ArrayList;

import Dao.ProductDao;

public class productFacade {

	public ArrayList<String> getProductList(){
		ProductDao query = new ProductDao();		
		ArrayList<String> list = null;
		try {
			 list = query.executeGetAllProducts();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}