package day04.practice;

public class TestPolygonShp {


	public static void main(String[] args) {
		PolygonShp rec;
		try {
			
			rec = new Rectangle (10, 5);
			System.out.println(rec.circumstance());
			RightAngledTriangle ratt = new RightAngledTriangle(1,2,3);
			System.out.println(ratt.circumstance());

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}