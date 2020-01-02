package TheFirstOne;

import java.util.Arrays;

public class Left_Shifted_Array {

	// Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}. 
	// You may modify and print the given array, or print a new array.
	
	public static void main(String[] args) {
		
		int intArr[] = {6, 2, 5, 3}; 
		int temp;
		
		for (int i = 0; i < intArr.length-1; i++) {
			temp = intArr[i];
			intArr[i] = intArr[i+1];
			intArr[i+1] = temp;
		}

		System.out.println(Arrays.toString(intArr));

	}

}
