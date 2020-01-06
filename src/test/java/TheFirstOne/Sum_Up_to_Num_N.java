package TheFirstOne;

public class Sum_Up_to_Num_N {

	public static void main(String[] args) {
		
		// Create a method where you find the sum of the numbers up to number.
		
		System.out.println(sum_Up_to_Number_N(10));
	}
	
	public static int sum_Up_to_Number_N(int num) {
		
		int sum = 0;
		for(int i = 0; i <= num; i++) {
			sum+= i;
		}	
		return sum;
	}

}
