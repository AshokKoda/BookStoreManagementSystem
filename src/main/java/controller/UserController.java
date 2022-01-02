package controller;

import entity.User;
import exception.BSMSException;
import implementation.UserImplementation;
import interfaces.IUser;
import utility.UtilScanner;

public class UserController {

	public void addUser() throws BSMSException {
		
		User user = new User();
		IUser userService = new UserImplementation();
		
		user.setId(UtilScanner.getString("User Id: "));
		user.setName(UtilScanner.getString("Username: "));
		user.setMobile(UtilScanner.getString("Mobile No: "));
		user.setEmail(UtilScanner.getString("Email Id: "));
		user.setAddress(UtilScanner.getString("Address: "));
		
		int res = userService.add(user);
		System.out.println("size = " + res);
	}
	
	
	public static void main(String[] args) throws BSMSException {
		
		UserController user = new UserController();
		user.addUser();

	}

}
