/*
 * (For Encapsulation): Create a User class with attribute id, name, password, emailId and 
 * create setters and getters for the same. Please note no attribute should be available publicly
 *  they should be only be accessible via the access modifiers.
 */



package day02.practice;

public class User {

	private static int id;
	private static String name;
	private static String password;
	private static String email;
	
	
	public  void setid(int id){
		User.id=id;
		 
	}
	public int getid() {
		return id;
		
		
	}
	public void setName(String name) {
		
		User.name=name;
		
	} 
	
	public String getName() {
		
		return name;
	}
	
public void setPassword(String password) {
		
		User.password=password;
		
	} 

public String getPassword() {
	
	return password;
}

public void setEmail(String email) {
	
	User.email=email;
	
} 

public String getEmail() {
	
	return email;
}

public static void main(String[] args) {
	
	
	User user = new User();
	
	user.setid(1);
	user.setName("Jaleela");
	user.setPassword("jaleela21");
	user.setEmail("jaleela@gmail.com");
	
System.out.println(user.getid());
System.out.println(user.getName());
System.out.println(user.getPassword());
System.out.println(user.getEmail());

	
}





}

