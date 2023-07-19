package day04.practice;


class RightAngledTriangle extends PolygonShp {
	
	protected double a;
	protected double b;
	protected double c;

	
	public RightAngledTriangle(double a, double b,double c) throws Exception {
		super(3);
		if(a <= 0 || b <= 0|| c <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.a = a;
		this.b = b;
		this.c = c;

	}

	@Override
	public double circumstance() {
		// TODO Auto-generated method stub
		return this.a + this.b+this.c;  // formula: C = 2 * (l + W) 
	}
	
	public int getNumberOfSides() {
		return super.numberOfSides;
	}

	
}