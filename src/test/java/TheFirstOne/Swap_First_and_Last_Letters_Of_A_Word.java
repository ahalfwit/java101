package TheFirstOne;

import java.util.Arrays;

public class Swap_First_and_Last_Letters_Of_A_Word {

	public static void main(String[] args) {
		
		//Write a method that will swap first and last characters in the string. 
		// Print out result into the console. The method will accept a String argument
		
		String str = "Darling";
		swapFirstAndLastCharacters(str);
		
		System.out.println(Arrays.toString(swapFirstAndLastItemsInArray(new int[] {1,2,3,4})));
		
	}	
		
	
	public static void swapFirstAndLastCharacters(String str) {
		
		String result = "";
		
		char first = str.charAt(0);
		char last = str.charAt(str.length()-1);
		String middle = str.substring(1, str.length()-1);
		
		result += last + middle + first;
		System.out.println(result);
	}
	
	// Write a method to switch the last element in an array with the first and return the array. 
	// TheThirdOne: [1,2,3,4] ==> [4,2,3,1]

	public static int[] swapFirstAndLastItemsInArray(int[] intArr) {
		
		int temp = intArr[0];
		intArr[0] = intArr[intArr.length -1];
		intArr[intArr.length -1] = temp;
		
		return intArr;
	}
	
}
