/*
 * Cat 1:
Age: 4
Color: White
Speaks: Meow!
Cat 2:
Age: 3
Color: Black
Speaks: Meow!
 */

package day01.practice;

public class Cat {
	private static int age;
	private static String color;

	// Constructor
	public Cat(int age, String color) {
		this.age = age;
		this.color = color;
	}

	// Getters and setters

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String speak() {
		return "Meow!";
	}

	// Main method to create Dog objects
	public static void main(String[] args) {
		// Create two Dog objects
		Cat cat1 = new Cat(3, "White");
		Cat cat2 = new Cat(4, "Black");

		// Print the attributes of each Dog
		System.out.println("Cat 1:");
		System.out.println("Age: " + cat1.getAge());
		System.out.println("Color: " + cat1.getColor());
		System.out.println("Speaks: "+ cat1.speak());

		System.out.println("Cat 2:");
		System.out.println("Age: " + cat1.getAge());
		System.out.println("Color: " + cat2.getColor());
		System.out.println("Speaks: "+ cat2.speak());
	}
}
