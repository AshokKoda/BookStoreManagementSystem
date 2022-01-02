package implementation;

import java.util.List;

import common.ErrorMessages;
import common.UtilRegex;
import dao.UserDao;
import entity.User;
import exception.BSMSException;
import interfaces.IUser;
import interfaces.IUserDao;
import utility.UtilValidation;

public class UserImplementation implements IUser {

	private IUserDao userDao;
	
	public UserImplementation() {
		userDao = new UserDao();
	}
	
	public int add(User user) throws BSMSException {
		
		if (user.getId().trim().isEmpty())
			throw new BSMSException("ID" + ErrorMessages.FIELD_IS_EMPTY.getConstant());
		else if (!UtilValidation.isValid(UtilRegex.ID, user.getId())) 
			throw new BSMSException(ErrorMessages.INVALID_DATA.getConstant() + "ID");
		
		if (user.getName().trim().isEmpty())
			throw new BSMSException("Name" + ErrorMessages.FIELD_IS_EMPTY.getConstant());
		else if (!UtilValidation.isValid(UtilRegex.NAME, user.getName())) 
			throw new BSMSException(ErrorMessages.INVALID_DATA.getConstant() + "Name");
		
		if (user.getMobile().trim().isEmpty())
			throw new BSMSException("Email" + ErrorMessages.FIELD_IS_EMPTY.getConstant());
		else if (!UtilValidation.isValid(UtilRegex.MOBILE, user.getMobile())) 
			throw new BSMSException(ErrorMessages.INVALID_DATA.getConstant() + "Mobile Number");
		
		if (user.getEmail().trim().isEmpty())
			throw new BSMSException("Email" + ErrorMessages.FIELD_IS_EMPTY.getConstant());
		else if (!UtilValidation.isValid(UtilRegex.EMAIL, user.getEmail())) 
			throw new BSMSException(ErrorMessages.INVALID_DATA.getConstant() + "Email");
		
		if (user.getAddress().trim().isEmpty())
			throw new BSMSException("Address" + ErrorMessages.FIELD_IS_EMPTY.getConstant());
		else if (!UtilValidation.isValid(UtilRegex.ADDRESS, user.getAddress())) 
			throw new BSMSException(ErrorMessages.INVALID_DATA.getConstant() + "Address");
		
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
