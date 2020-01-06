package TheFirstOne;

public class Fibonacci {

	// In fibonacci series, next number is the sum of previous two numbers 
	// For example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89, 144, ... 
	// The first two numbers of fibonacci series are 0 and 1. 	
	// Given a number num, print n-th fibonacci Number.

	public static void main(String[] args) {
		
		fibonacci(10);
	}
	
	public static void fibonacci(int max) {
		
		int n1 = 0; 	// first number
		int n2 = 1; 	// second number
		
		for (int i = 1; i <= max; i++) {
			System.out.print(n1 + " ");
			int sum = n1 + n2; // 0+1
			n1 = n2; // n1 = 1
			n2 = sum; // n2 = 1 (sum)
		}
	
	}

}
