package com.fssa.specsee.servicelayer;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fssa.specsee.exceptions.ServiceException;
import com.fssa.specsee.modelobjects.User;

public class TestUserService {
	
	public static User validUser() {
		
		User user = new User(1,"jaleela","jaleela123@gmail.com","jaleelA@123","9876512340","Blue and black color computer");
		return user;
	}

	/**
	 * Test method for adding a valid user
	 */
	@Test
	void testUserSignUp() throws ServiceException {

		Assertions.assertTrue(UserService.userSignUp(validUser()));

	}
	
	/**
	 * Test method for deleting a user 
	 */
	@Test
	void testDeleteUser() throws ServiceException{
		Assertions.assertTrue(UserService.deleteUser("jaleela123@gmail.com"));
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
