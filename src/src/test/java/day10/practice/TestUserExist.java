package day10.practice;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestUserExist {
	
	User user1=new User(1, "sandeep", "sandeepsan@gmail.com");
	User user2=new User(1, "sandeep", "sandeepsand@gmail.com");
	User user3=new User(1, "sandeep", "sandeepsan@gmail.com");
 
	
	@Test

	public void testRegisterUser() {
		
	
		
	   Assertions.assertTrue(UserValidator.register(user1));
	}
	
	@Test
	public void testAlreadyRegisterUser() {
		try {
			UserValidator.register(null);
		
			
			Assertions.fail("User Already added failed");
			
		}
		catch(UserAlreadyExistsException e) {
		   Assertions.assertEquals("object cannot null", e.getMessage());
		}
		

	
	try {
		UserValidator.register(user3);
		UserValidator.register(user2);
		UserValidator.register(user3);
		
		Assertions.fail("User Already added failed");
		
	}
	catch(UserAlreadyExistsException e) {
	   Assertions.assertEquals("User Already added", e.getMessage());
	}
	}
	
}


