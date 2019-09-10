package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Factory.ConnectionFactory;
import Factory.QueryFactory;

public class UserDao {
		private QueryFactory query;

		public UserDao () {
	    	query = new QueryFactory();
		}
		
		/**
		 * @param employee Employee type
		 * @return boolean true after successful insertion
		 * @throws SQLException
		 * @throws Exception
		 */
		public boolean authenticatePassword(String userName , String password) throws SQLException , Exception{
			Connection connect = null;
			PreparedStatement statement = null;
			ResultSet result = null;
			boolean flag = false;
			try {
				connect = ConnectionFactory.getConnection();
				statement = connect.prepareStatement(query.getPassword());
				statement.setString(1,userName);
				result = statement.executeQuery();
				result.next();
				String pass = result.getString(1);
				if(pass.equals(password)){
					flag = true;
				}
				return flag;
			}catch(SQLException e) {
				throw e;
			}catch (Exception e) {
				throw e;
			}
			finally{
				result.close();
				statement.close();
				connect.close();
			}
		}
		public String executeGetUserId(String userName) throws SQLException , Exception{
			Connection connect = null;
			PreparedStatement statement = null;
			ResultSet result = null;
			try {
				connect = ConnectionFactory.getConnection();
				statement = connect.prepareStatement(query.getUserId());
				statement.setString(1,userName);
				result = statement.executeQuery();
				result.next();
				return result.getString(1);
			}catch(SQLException e) {
				throw e;
			}catch (Exception e) {
				throw e;
			}
			finally{
				result.close();
				statement.close();
				connect.close();
			}
		}
}