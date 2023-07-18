
/*
 *  Create a User class with 2 constructors.
 *   the second overloaded constructor User(name, password, emailId)
 */

package day03.practice;
class UserDetails{
	
	public String name;

	public String password;
	public String emailId;
	
	// default constructor
	public UserDetails(){
		
	}
	
	// overloaded constructor 
	
	public UserDetails(String name, String password, String emailId) {
		this.name = name;
		this.password = password;
		this.emailId = emailId;
	}
	
	
}




public class User {
public static void main(String[] args) {
	// calling the constructor with initialize value
	UserDetails user = new UserDetails("jaleela","jaleela21","jaleela@gmail.com");
	System.out.println(user.name+" - "+user.password+" - "+user.emailId);
	
	 
}
}
