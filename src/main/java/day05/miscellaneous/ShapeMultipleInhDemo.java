package day05.miscellaneous;

interface  Shape {
	public  void draw();
}

class Rectangle2 implements Shape {
	
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}

class Square implements Shape {
	public void draw() {
		System.out.println("Drawing a square");
	}
}

public class ShapeMultipleInhDemo {
	public static void main(String[] args) {
		Shape rec = new Rectangle2();
		Shape square = new Square();
		rec.draw();
		square.draw();
	}
}



