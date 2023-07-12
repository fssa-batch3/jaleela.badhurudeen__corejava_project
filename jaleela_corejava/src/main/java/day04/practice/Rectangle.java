
/*
 * Rectangle Class from solved example
 */



package day04.practice;

 class Rectangle extends PolygonShp {
	
	protected double length;
	protected double breadth;
	
	public Rectangle(double length, double breadth) throws Exception {
		super(4);
		if(length <= 0 || breadth <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double circumstance() {
		// TODO Auto-generated method stub
		return 2*(this.length + this.breadth);  // formula: C = 2 * (l + W) 
	}
	
	public int getNumberOfSides() {
		return super.numberOfSides;
	}

	
}