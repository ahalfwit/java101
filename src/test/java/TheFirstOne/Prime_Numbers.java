package TheFirstOne;

public class Prime_Numbers {

	
	/* TheThirdOne.Technical.A prime number is a whole number greater than 1 whose only factors are 1 and itself.
	 * TheThirdOne.Technical.A factor is a whole numbers that can be divided evenly into another number.
	 * The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.
	 */
	
	public static void main(String[] args) {
		
		int num = 29;
		
//		if(num <= 1)
//			System.out.println(num + " is NOT prime.");
//		
//		for (int i = 2; i < num; i++) {
//			if(num % i == 0)
//				System.out.println(num + " is NOT prime.");	
//		}
//		System.out.println(num + " is prime.");
		
		//============= ANOTHER WAY ==============
		
		if(num <= 1)
			System.out.println(num + " is NOT prime.");
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0)
				System.out.println(num + " is NOT prime.");
		}
		System.out.println(num + " is prime.");
	}
}
