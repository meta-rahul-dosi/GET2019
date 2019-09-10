package Factory;

public class QueryFactory {
	private String query;
	public QueryFactory(){
		this.query="";
	}
	/**
	 * @return query
	 */
	public String getQuery() {
		return this.query;
	}
	
	/*
	 * 
	 * 			** CART QUERIES **
	 * 
	 * 
	 */
	public String getAddProductToCartQuery(){
		this.query="INSERT INTO cart (ProductCode , Quantity) Values (?,?);";	
		return this.query;
	}
	public String getCart(){
		this.query="SELECT ProductCode , Quantity From Cart;";
		return this.query;
	}
	public String getDeleteQuery(){
		this.query="DELETE FROM Cart WHERE Cart.ProductCode = ?;";
		return this.query;
	}
	public String getProductQuantity(){
		this.query="SELECT quantity FROM Cart WHERE Cart.ProductCode = ?;";
		return this.query;
	}
	public String getProductName(){
		this.query="SELECT product.productName FROM product RIGHT JOIN Cart On Product.ProductCode = Cart.ProductCode WHERE Cart.ProductCode = ?;";
		return this.query;
	}
	public String getUpdateQuantityQuery(){
		this.query="UPDATE cart SET cart.quantity = ? WHERE cart.productCode = ? ;";
		return this.query;
	}
	
	/*
	 * 
	 * 			** PRODUCT QUERIES **
	 * 
	 * 
	 */
	public String getAllProducts(){
		this.query="SELECT ProductCode , ProductName , Type , Price FROM Product ;";	
		return this.query;
	}
	public String getProductDetails(){
		this.query="SELECT ProductCode , ProductName , Type , Price FROM Product WHERE ProductCode = ?;";	
		return this.query;
	}
	
	/*
	 * 
	 * 			** USER QUERIES **
	 * 
	 * 
	 */
	public String getPassword(){
		this.query="SELECT Password FROM User WHERE UserName = ? ;";	
		return this.query;
	}
	public String getUserId(){
		this.query="SELECT Id FROM User WHERE UserName = ? ;";	
		return this.query;
	}
}
