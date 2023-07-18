package day04.practice;

public abstract class PolygonShp {
	protected int numberOfSides;
	
	public PolygonShp (int numberOfSides) throws Exception {
		if (numberOfSides < 3) {
			throw new Exception("Invalid number of sides to create a polygon ");
		}
		else {
			this.numberOfSides = numberOfSides;
		}
	}
	
	
	public abstract double circumstance();
}