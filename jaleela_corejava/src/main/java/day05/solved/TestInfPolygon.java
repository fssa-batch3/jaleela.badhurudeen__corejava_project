package day05.solved;

interface Polygon2nd {

	public double area(double a, double b);
}

class RectanglePol implements Polygon2nd {

	@Override
	public double area(double a, double b) {
		System.out.println("Calculating Rectangle area");
		return a*b;
	}

}


class RightAngledTriangle2 implements Polygon2nd {

	@Override
	public double area(double a, double b) {
		System.out.println("Calculating RightAngledTriangle area");
		return (0.5 * a * b);
	}

}
 class TestInfPolygon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polygon2nd p = new RectanglePol();
		double area = p.area(5, 6);
		System.out.println("Calculated Area: " + area);
		
		p = new RightAngledTriangle2();
		
		area = p.area(5,  6);
		
		System.out.println("Newly calculated Area: " + area);

	}

}