package pract;



// Tortoise.java Assume the below code is a separate Tortoise.java file

 class Hare {

	public void init() {

		System.out.println("init-");

	}

	protected void race() {

		System.out.println("hare-");

	}

}
 
public class Tortoise extends Hare {

protected void race(Hare hare) {

hare.init(); // x1

hare.race(); // x2

System.out.print("tortoise-");

}

public static void main(String[] args) {

Tortoise tortoise = new Tortoise();

Hare hare = new Hare();

tortoise.race(hare);

}

}