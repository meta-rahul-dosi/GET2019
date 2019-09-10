package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Factory.ConnectionFactory;
import Factory.QueryFactory;

public class CartDao {
		private QueryFactory query;
		
		public CartDao () {
	    	query = new QueryFactory();
	    }
		
		public boolean executeAddProductToCartQuery(String productCode ,int quantity) throws SQLException , Exception{
			Connection connect = null;
			PreparedStatement statement = null;
			try {
				connect = ConnectionFactory.getConnection();
				statement = connect.prepareStatement(query.getAddProductToCartQuery());
				statement.setString(1,productCode);
				statement.setInt(2,quantity);
				statement.executeUpdate();
				return true;
			}
			catch(SQLException e) {
				throw e;
			}
			catch (Exception e) {
				throw e;
			}
			finally{
				connect.close();
				statement.close();
			}
		}
		public ArrayList<String> executeViewCartQuery() throws SQLException , Exception{
			Connection connect = null;
			PreparedStatement statement = null;
			ResultSet result = null;
			try {
				connect = ConnectionFactory.getConnection();
				statement = connect.prepareStatement(query.getCart());
				result = statement.executeQuery();
				ArrayList<String> list = new ArrayList<String>();
				while(result.next()){
					list.add(result.getString(1));
					list.add(result.getString(2));
				}
				return list;
			}catch(SQLException e) {
				throw e;
			}catch (Exception e) {
				throw e;
			}
			finally{
				connect.close();
				statement.close();
				result.close();
			}
		}
		public boolean executeDeleteProductFromCart(String productCode) throws SQLException , Exception{
			Connection connect = null;
			PreparedStatement statement = null;
			try {
				connect = ConnectionFactory.getConnection();
				statement = connect.prepareStatement(query.getDeleteQuery());
				statement.setString(1,productCode);
				statement.executeUpdate();
				return true;
			}
			catch(SQLException e) {
				throw e;
			}
			catch (Exception e) {
				throw e;
			}
			finally{
				connect.close();
				statement.close();
			}
		}
		public int executeGetProductQuantity(String productCode) throws SQLException , Exception{
			Connection connect = null;
			PreparedStatement statement = null;
			ResultSet result = null;
			try {
				connect = ConnectionFactory.getConnection();
				statement = connect.prepareStatement(query.getProductQuantity());
				statement.setString(1,productCode);
				result=statement.executeQuery();
				result.next();
				return result.getInt(1);
			}
			catch(SQLException e) {
				throw e;
			}
			catch (Exception e) {
				throw e;
			}
			finally{
				connect.close();
				statement.close();
				result.close();
			}
		}
		public String executeGetProductName(String productCode) throws SQLException , Exception{
			Connection connect = null;
			PreparedStatement statement = null;
			ResultSet result = null;
			try {
				connect = ConnectionFactory.getConnection();
				statement = connect.prepareStatement(query.getProductName());
				statement.setString(1,productCode);
				result=statement.executeQuery();
				result.next();
				return result.getString(1);
			}
			catch(SQLException e) {
				throw e;
			}
			catch (Exception e) {
				throw e;
			}
			finally{
				connect.close();
				statement.close();
				result.close();
			}
		}
		public boolean executeUpdateQuantityQuery(String productCode , int quantity) throws SQLException , Exception{
			Connection connect = null;
			PreparedStatement statement = null;
			try {
				connect = ConnectionFactory.getConnection();
				statement = connect.prepareStatement(query.getUpdateQuantityQuery());
				statement.setInt(1,quantity);
				statement.setString(2,productCode);
				statement.executeUpdate();
				return true;
			}
			catch(SQLException e) {
				throw e;
			}
			catch (Exception e) {
				throw e;
			}
			finally{
				connect.close();
				statement.close();
			}
		}
}