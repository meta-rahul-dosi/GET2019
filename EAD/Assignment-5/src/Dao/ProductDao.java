package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Factory.ConnectionFactory;
import Factory.QueryFactory;

public class ProductDao {

		private QueryFactory query;
		
		public ProductDao(){
			query = new QueryFactory();
		}
		/**
		 * @param employee Employee type
		 * @return boolean true after successful insertion
		 * @throws SQLException
		 * @throws Exception
		 */
		public ArrayList<String> executeGetAllProducts() throws SQLException , Exception{
			Connection connect = null;
			PreparedStatement statement = null;
			ResultSet result = null;
			ArrayList<String> list = new ArrayList<String>();
			try {
				connect = ConnectionFactory.getConnection();
				statement = connect.prepareStatement(query.getAllProducts());
				result = statement.executeQuery();
				while(result.next()){
					for(int index = 1; index<5 ; index++)
						list.add(result.getString(index));
				}
				return list;
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
		
		public ArrayList<String> executeGetProductDetails(String productCode) throws SQLException , Exception{
			Connection connect = null;
			PreparedStatement statement = null;
			ResultSet result = null;
			try {
				ArrayList<String> cart = new ArrayList<String>();
				connect = ConnectionFactory.getConnection();
				statement = connect.prepareStatement(query.getProductDetails());
				statement.setString(1,productCode);
				result = statement.executeQuery();
				while(result.next()){
					cart.add(result.getString(1));
					cart.add(result.getString(2));
					cart.add(result.getString(3));
					cart.add(result.getString(4));
				}
				return cart;
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
}