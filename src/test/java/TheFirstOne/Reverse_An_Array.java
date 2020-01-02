package TheFirstOne;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse_An_Array {

	// Write methods to reverse an array in two different ways.
	
	public static void main(String[] args) {

		int[] intArr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Length:" + intArr.length);
		reverseArray1(intArr);

		reverseArray1(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		
		reverseArray2(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		
		printDaysBackwords(new ArrayList<String> (Arrays.asList("mONDAY","tUESDAY","Wednesday","Thursday","Friday","Saturday","Sunday")));
	}

	public static void reverseArray1(int[] intArr) {

		int[] newArray = new int[intArr.length];
		for (int i = 0, j = 1; i < newArray.length; i++, j++) {
			newArray[i] = intArr[intArr.length - j];
			// System.out.println(Arrays.toString(newArray));
		}
		System.out.println(Arrays.toString(newArray));
	}

	public static void reverseArray2(int[] intArr) {

		for (int i = 0, j = 1; i < intArr.length / 2; i++, j++) {
			
			int temp = intArr[i];// 
			intArr[i] = intArr[intArr.length - j];
			intArr[intArr.length - j] = temp;
		}
		System.out.println(Arrays.toString(intArr));
	}
	
	public static void printDaysBackwords(ArrayList<String> al) {
		
		for(int i = al.size() - 1; i >= 0; i--) {
			System.out.print(al.get(i) + " ");
		}
	}

}
