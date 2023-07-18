

/*
 * Edit the code below to get the following expected output: 
 * 
 * output :: id=1, name=naresh

id=2, name=suresh
 */







package day03.practice;

 class Employee {
	 
    private int id;
    private String name;
 
    // constructor
    public Employee(int id, String name) {
        this.id = id;
        System.out.print("id="+id+", ");
        this.name = name;
        System.out.println("name="+name);

    }
}
 
 
public class TestEmployee {
	 
    public static void main(String[] args) {
    	
    	// calling the constructor with initialization
        Employee e1 = new Employee(1, "naresh");
        Employee e2 = new Employee(2, "suresh");
    }
}
