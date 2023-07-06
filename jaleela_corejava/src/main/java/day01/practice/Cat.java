package day01.practice;

public class Cat {
    private boolean hasDots;
    private String color;

    // Constructor
    public Cat(boolean hasDots, String color) {
        this.hasDots = hasDots;
        this.color = color;
    }

    // Getters and setters
    public boolean hasDots() {
        return hasDots;
    }

    public void setHasDots(boolean hasDots) {
        this.hasDots = hasDots;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

		public void speak() {
        System.out.println("Meow!");
    }

    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
    	Cat cat1 = new Cat(true, "purple");
    	Cat cat2 = new Cat(true, "blue");

        // Print the attributes of each Dog
        System.out.println("Cat 1:");
        System.out.println("Has Dots: " + cat1.hasDots());
        System.out.println("Color: " + cat1.getColor());
				System.out.println("Speaks: " + cat1.speak());

        System.out.println("Cat 2:");
        System.out.println("Has Dots: " + cat2.hasDots());
        System.out.println("Color: " + cat2.getColor());
				System.out.println("Speaks: " + cat2.speak()
    }
}
}
