package day10.practice;
import java.util.*;

class UserAlreadyExistsException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8105491977357554060L;

	// Calling each super constructors for each of the types
	public UserAlreadyExistsException(String msg) {
		super(msg);
	}

	public UserAlreadyExistsException(Throwable te) {
		super(te);
	}

	public UserAlreadyExistsException(String msg, Throwable te) {
		super(msg, te);
	}
}


class User {
	int id;
	String name;
	String emailId;
	public User(int id,String name,String emailId) {
		this.id=id;
		this.name=name;
		this.emailId=emailId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
	
}
class UserValidator {
	static ArrayList<User> arr = new ArrayList<User>();
	public static boolean register(User user) throws UserAlreadyExistsException {
		if (user == null) {
			throw new UserAlreadyExistsException("object cannot null");
		}
	
		for(User element:arr) {
			if(element.emailId.equals(user.getEmailId())) {
				throw new UserAlreadyExistsException("User Already added");
			}
			
		}
	arr.add(user);
		System.out.println("User added");
		return true;
		}
	
}
public class UserExist {
	
	public static void main(String[] args) {
		User user1=new User(1, "sandeep", "sandeep@gmail.com");
		User user2=new User(2, "sandeep", "sandeepsan@gmail.com");
	boolean data1=UserValidator.register(user1);
	boolean data2=UserValidator.register(user2);
	System.out.println(data1);
	System.out.println(data2);
		
		
	}
	


}