package TheFirstOne;

import java.util.Arrays;

public class Missing_Number {

	public static void main(String[] args) {
		
		// Write a method that takes an array of integers 
		// between 1 and 10 (excluding one number) and returns the missing number.
		// TheThirdOne: [1, 2, 3, 4, 5, 6, 7, 8, 10] ==> Missing: 5 and 9
		
		int[] intArray = new int[] {1, 2, 3, 4, 6, 7, 8, 10};
		int missing = 0;
		Arrays.sort(intArray);
		
		for (int i = 0; i < intArray.length -1; i++) {
			if(intArray[i] + 1 != intArray[i + 1]) {
				missing = intArray[i] + 1;
				System.out.println("Missing number: " + missing);
			}
		}
		

	}

}
