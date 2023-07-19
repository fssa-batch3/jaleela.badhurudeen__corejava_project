package day10.misc;

public class CheckAndUncheck {
	public static int dividor(int a, int b)throws IllegalArgumentException {
		
		if(b==0) {
			throw new IllegalArgumentException("integer should not be zero");
		}
		
		int c = a/b;
		return c;
		
		
	}

}

class Divisor{
	
	
	public static void main(String[] args) {

		
		System.out.println(CheckAndUncheck.dividor(10, 10));
	}
}