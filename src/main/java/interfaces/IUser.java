package interfaces;

import java.util.List;

import entity.User;
import exception.BSMSException;

public interface IUser {

	
	int add(User user) throws BSMSException;
	void deleteById();
	void searchById();
	void UpdateById();
	List<User> getAllUsers();
}
