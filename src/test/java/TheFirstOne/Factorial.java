package TheFirstOne;

public class Factorial {

	public static void main(String[] args) {
		
		// TheThirdOne.Technical.A factorial is a function that multiplies a number by every number below it.
		// It is the product of all positive integers less than or equal to n.  
		// For example 5!= 5*4*3*2*1=120. 
		
		// The function is used, among other things, to find the number of way “n” objects can be arranged. 
		// There are n! ways of arranging n distinct objects into an ordered sequence.
		// Write a method that calculates factorial and output result to the console. 
		
		System.out.println(factorial(4));

	}
	
	public static int factorial(int num) {
		
		int result = 1;
		
		if(num <=1)
			return result;
		
		for(int i = num ; i >= 1 ; i --) {
			result *= i;
		}
		
		return result;
		
//		if(num <= 1)
//			return 1;
//		else
//			return num * factorial(num -1);
	}

}
