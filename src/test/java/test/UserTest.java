package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import entity.User;
import implementation.UserImplementation;

public class UserTest {

	UserImplementation userService;
	
	@Before
	public void setUp() {
		userService = new UserImplementation();
	}
	
	@Test
	public void addUserTest() {
		User user = new User("101","Ashok","7396382672","koda@gmail.com","Vizag");
		int res = userService.add(user);
		Assert.assertEquals(1, res);
	}
}
