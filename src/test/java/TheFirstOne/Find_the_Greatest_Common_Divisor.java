package TheFirstOne;

public class Find_the_Greatest_Common_Divisor {

	public static void main(String[] args) {
		
		// In mathematics, the greatest common divisor (gcd), also known as the greatest common denominator, 
		// greatest common factor (gcf), or highest common factor (hcf), of two or more non-zero integers, 
		// is the largest positive integer that divides the numbers without a remainder. 
		// For example, the GCD of 8 and 12 is 4.

		System.out.println(find_GCD(15, 25));
	}
	
	public static int find_GCD(int num1, int num2) {
		
		int gcd = 0;
		int max = Math.max(num1, num2);
	
		for (int i = 1; i < max; i++) {
		
			if(num1 % i == 0 && num2 % i == 0 && i > gcd)
				gcd = i;
		}
		return gcd;
	}

}
