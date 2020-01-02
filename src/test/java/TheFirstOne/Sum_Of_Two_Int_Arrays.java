package TheFirstOne;

import java.util.Arrays;

public class Sum_Of_Two_Int_Arrays {

	public static void main(String[] args) {

		// This method accepts 2 int arrays and adds each element value of two arrays
		// and returns a new array.
		// You can assume that each array has 5 elements.
		// TheThirdOne: addElements(new int[][10,40,50,3], new int[][11,0,500,44]); ==>
		// [21,40,550,47]

		System.out.println(Arrays.toString(sum_Of_Two_Int_Arrays(new int[] { 10, 40, 50, 3 }, new int[] { 11, 0, 500, 44 })));

	}

	public static int[] sum_Of_Two_Int_Arrays(int[] intArr1, int[] intArr2) {

		int[] newArr = new int[intArr1.length];

		for (int i = 0; i < intArr1.length; i++)
			newArr[i] = intArr1[i] + intArr2[i];

		return newArr;
	}

}