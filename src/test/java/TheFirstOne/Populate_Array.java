package TheFirstOne;

import java.util.Arrays;

public class Populate_Array {

	public static void main(String[] args) {
		
		// Populate method accepts an empty int array and populates it with numbers counting up.
		// TheThirdOne: new int[3] ==> returns: [1,2,3]
		
		populateArray(10);

	}
	
	public static int[] populateArray(int length) {
		
		int[] intArr = new int[length];
		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = i + 1;
		}
		System.out.println(Arrays.toString(intArr));
		return intArr;
	}

}
