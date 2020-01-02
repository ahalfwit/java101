package TheFirstOne;

public class Swap_Two_Variable_Values {

public static void main(String[] args) {
		
		// Swap two variables's values without using temp variable.
		
		int x = 10;
		int y = 5;
		int temp;
		
		// Using temp way:
		
		System.out.println("Original Values: " + x + " <==> " + y);

		temp = x;
		x = y;
		y = temp;
		
		System.out.println("Swap using Temp: " + x + " <==> " + y);
		
	    //Without using temp
		
		x = x + y; // x >>> 5 + 10 = 15
		y = x - y; // y >>> 15 - 10 = 5
		x = x - y; // x >>> 15 - 5 = 10
		
		System.out.println("Swap without Temp " + x + " <==> " + y);
		

	}

}