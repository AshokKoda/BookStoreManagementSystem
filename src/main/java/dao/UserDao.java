package dao;

import java.util.ArrayList;
import java.util.List;

import entity.User;
import interfaces.IUserDao;
import utility.FileHandling;

public class UserDao implements IUserDao {
	
	private FileHandling<User> filehandling;
	
	

	public UserDao() {
		this.filehandling = new FileHandling<User>(new ArrayList<User>());
	}

	public int add(User user) {
		List<User> users = new ArrayList<User>();
		users.add(user);
		filehandling.writeUser(users);
		return users.size();
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	public void searchById(int id) {
		// TODO Auto-generated method stub
		
	}

	public void updateById(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		//return filehandling.readUser();
		return null;
	}

}
