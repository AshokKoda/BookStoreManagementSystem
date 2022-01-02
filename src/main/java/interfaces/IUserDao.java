package interfaces;

import java.util.List;

import entity.User;

public interface IUserDao {

	int add(User user);
	void deleteById(int id);
	void searchById(int id);
	void updateById(int id);
	List<User> getAllUser();
}
