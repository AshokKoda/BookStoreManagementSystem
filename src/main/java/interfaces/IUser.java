package interfaces;

import java.util.List;

import entity.User;

public interface IUser {

	
	int add(User user);
	void deleteById();
	void searchById();
	void UpdateById();
	List<User> getAllUsers();
}
