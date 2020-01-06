package TheFirstOne;

public class Remainder {

	public static void main(String[] args) {

		// Write a method which finds remainder of 2 numbers without using the % operator?
		
		int dividend = 18;
		int divisor = 5;
		int remainder = 0;
		
		remainder = (dividend - divisor * (dividend / divisor));
		
		System.out.println(remainder);	
	}
}
