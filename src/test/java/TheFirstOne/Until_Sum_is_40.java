package TheFirstOne;

import java.util.Scanner;

public class Until_Sum_is_40 {

	public static void main(String[] args) {
		
		// Write a method where you enter numbers until the sum is 40.
		until_Sum_is_40();
	}
	
	public static void until_Sum_is_40() {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		for(System.out.println("Enter a number") ; sum < 40 ; System.out.println("Keep Entering")) {
			int num = scan.nextInt();
			sum += num;
			if(sum >= 40)
				break;
		}
		System.out.println("Total is now >= 40 which is = " + sum);
	}

}
