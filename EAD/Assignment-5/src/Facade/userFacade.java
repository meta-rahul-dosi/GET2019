package Facade;

import java.sql.SQLException;
import Dao.UserDao;

public class userFacade {

	public boolean authenticatedLogin(String userName , String password){
		UserDao driver = new UserDao();
		boolean flag = false;
		try {
			if(driver.authenticatePassword(userName, password)){
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public String getUserId(String userName){
		UserDao driver = new UserDao();
		String userId = "";
		try {
			userId = driver.executeGetUserId(userName);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return userId;
	}
}
