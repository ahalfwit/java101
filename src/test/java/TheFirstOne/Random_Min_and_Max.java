package TheFirstOne;

import java.util.Arrays;
import java.util.Random;

public class Random_Min_and_Max {

	public static void main(String[] args) {
	
		// Store 10 random numbers into an TheThirdOne.Pages.Array then find the min and max.

		randomMinAndMax(10);
	}

	public static void randomMinAndMax(int length) {
		
		int[] intArr = new int[length];
		
		for (int i = 0; i < intArr.length; i++) {
			//int random = (int) (Math.random() * 100);
			//intArr[i] = random;
			
			intArr[i] = new Random().nextInt(100);
		}
		System.out.println(Arrays.toString(intArr));
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int number : intArr) {
			if(number > max)
				max = number;
			if(number < min)
				min = number;
		}
		
		System.out.println("Min number is: " + min + " and Max number is: " + max);
	}
	
}
