package TheFirstOne;

import java.util.Scanner;

public class Until_3_Trials_Or_Sum_is_100 {

	public static void main(String[] args) {

		// Write a method where u enter numbers until 3 trials or sum up to 100.
		until_3_Trials_Or_100();
	}

	public static void until_3_Trials_Or_100() {

		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int trials = 0;

		for (System.out.println("Enter a number") ; trials <= 2 && sum < 100 ; System.out.println("Keep Entering")) {

			int num = scan.nextInt();
			trials++;
			sum += num;
			if (sum >= 100)
				break;

		}
		System.out.println("Okay, this is the end of the game.\nYour number of trials = " 
						   + trials + " and your sum is " + sum);

	}

}
