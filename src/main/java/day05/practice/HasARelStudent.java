/*
 * Complete the below Code snippet similar to the car example
 * class Department {
	String deptName;
	int deptId;
	
}

class Student {
	String name;
	int id;
	Department department;
	
	// Create a constructor and assign depart and respective attributes
	// Add toString method to get the Student details. 
}

// Create a main class to create a Student and Department objects 
// and print the details
 */


package day05.practice;


class Department {
	String deptName;
	int deptId;
	public Department(String deptName, int deptId) {
		this.deptName = deptName;
		this.deptId = deptId;

	}

	public void printDepartmentDetails() {
		System.out.println("Department Name: " + this.deptName);
		System.out.println("Department Id: " + this.deptId);

	}
	
	
}

class Student {
	String name;
	int id;
	Department department;
	
	// Create a constructor and assign depart and respective attributes
	// Add toString method to get the Student details. 
	
	public Student(String name, int id,Department department) {
		this.name = name;
		this.id = id;
		this.department = department;

	}

	public void printStudentDetails() {
		System.out.println("Student Name: " + this.name);
		System.out.println("Student Id: " + this.id);

	}
}

// Create a main class to create a Student and Department objects 
// and print the details
public class HasARelStudent {

	public static void main(String[] args) {
		Department department = new Department("IT",001);
		
		Student student = new Student("Jaleela", 11,department);
		student.printStudentDetails();

	}
}
