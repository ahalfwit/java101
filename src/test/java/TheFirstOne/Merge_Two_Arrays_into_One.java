package TheFirstOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Two_Arrays_into_One {

	public static void main(String[] args) {

		// ====================== MERGE TWO INT ARRAYS =====================

		// Merge two arrays into one. Get two int arrays and return a combined array.
		// TheThirdOne: [1,2,3] [4,5,6] ==> [1,2,3,4,5,6]

		int[] intArr1 = { 1, 2, 3 };
		int[] intArr2 = { 4, 5, 6 };
		System.out.println("The first array is: " + Arrays.toString(intArr1));
		System.out.println("The second array is: " + Arrays.toString(intArr2));

		int resultLength = intArr1.length + intArr2.length;
		int[] result = new int[resultLength];

		for (int i = 0; i < resultLength; i++) {
			if (i < intArr1.length) {
				result[i] = intArr1[i];
			} else {
				result[i] = intArr2[i - intArr1.length];
			}
		}

		System.out.println("Result array is: " + Arrays.toString(result));

		// ===================== TheThirdOne.Technical.A DIFFERENT WAY ========================

		int newArrLength = intArr1.length + intArr2.length;
		int[] newArr = Arrays.copyOf(intArr1, newArrLength);

		for (int i = intArr1.length, j = 0; i < newArrLength; i++, j++) {
			newArr[i] = intArr2[j];
		}
		System.out.println("New array is: " + Arrays.toString(newArr));

		// ================= MERGE TWO STRING ARRAYS ===================

		String[] strArr1 = { "f", "o", "o" };
		String[] strArr2 = { "-", "b", "a", "r" };
		String target1 = "";

		List<String> mergedList = new ArrayList<>();

		for (int i = 0; i < strArr1.length + strArr2.length; i++) {
			if (i < strArr1.length)
				mergedList.add(strArr1[i]);
			else
				mergedList.add(strArr2[i - strArr1.length]);
		}

		for (String each : mergedList) {
			target1 += each;
		}

		System.out.println("Target String 1: " + target1);

		// =================== TheThirdOne.Technical.A DIFFERENT WAY =====================

		String target2 = "";

		List<String> firstStrArr = Arrays.asList(strArr1);

		List<String> combinedArr = new ArrayList<>(firstStrArr);

		for (String each : strArr2) {
			combinedArr.add(each);
		}

		for (String each : combinedArr) {
			target2 += each;
		}

		System.out.println("Target String 2: " + target2);
		System.out.println(combinedArr);

		// Calling a differet method:
		System.out.println("\n" + max_Value_of_Two_DimArray(new int[][] { { 1, 2, 14, 3, 4 }, { 7, 5, 6 } }));
	}

	// ============ MAX VALUE OF TheThirdOne.Technical.A TWO DIMENTIONAL INT ARRAY ===============

	public static int max_Value_of_Two_DimArray(int[][] twoDimIntArr) {

		System.out.println(Arrays.deepToString(twoDimIntArr));
		
		int max = Integer.MIN_VALUE;

//		 for (int[] eachArray : twoDimIntArr) {
//			 for (int each : eachArray) {
//				 if(max < each)
//					 max = each;
//			 }
//		 }

		for (int i = 0; i < twoDimIntArr.length; i++) {
			
			int[] eachArray = twoDimIntArr[i];
			Arrays.sort(eachArray);
			System.out.println("After sorting: " + Arrays.toString(eachArray));
			
			int eachInt = eachArray[eachArray.length - 1];
			if (max < eachInt)
				max = eachInt;
		}
		return max;
	}

}
