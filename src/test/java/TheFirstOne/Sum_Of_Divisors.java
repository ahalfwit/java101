package TheFirstOne;

public class Sum_Of_Divisors {

	public static void main(String[] args) {
		
		System.out.println(total_Sum_Of_Divisors(10));

	}
	
	public static int total_Sum_Of_Divisors(int num) {
		
		int sum = 0; 
		
		for(int i = 1; i <= num; i++) {
			if(num%i == 0) { // Numbers that cand divide number without remainders.
				sum+= i;
				System.out.println(i);
			}
			}
			return sum;
		
	}

}
