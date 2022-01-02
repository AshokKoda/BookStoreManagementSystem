package implementation;

import java.util.List;

import dao.UserDao;
import entity.User;
import interfaces.IUser;
import interfaces.IUserDao;

public class UserImplementation implements IUser {

	private IUserDao userDao;
	
	public UserImplementation() {
		userDao = new UserDao();
	}
	
	public int add(User user) {
		int res = userDao.add(user);
		return res;
	}

	public void deleteById() {
		// TODO Auto-generated method stub
		
	}

	public void searchById() {
		// TODO Auto-generated method stub
		
	}

	public void UpdateById() {
		// TODO Auto-generated method stub
		
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
