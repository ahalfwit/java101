package TheFirstOne;

import java.util.Arrays;

public class Sum_EachArrayItems_of_2D_Array {

	public static void main(String[] args) {
		
		// Complete the method so that it takes in a 2-D array and returns the sums of the rows 
		// as an integer array.
		// TheThirdOne: {{1,1,2} => 4 {3,1,2} => 6 {3,5,3} => 11  {0,1,2} => 3 }
		// Then you get array back as this: {4,6,11,3}
		
		System.out.println(Arrays.toString(sum_of_Rows(new int[][] {{1,2,3}, {4,5,6},{7,8,9}})));

	}
	
	public static int[] sum_of_Rows(int[][] twoDimArr) {
		
		int[] sums = new int[twoDimArr.length];
		int i = 0; // for index of sums array
		
		for (int[] eachArray : twoDimArr) {
			int sum = 0; // initialized for sum of the first array items
			for (int eachInt : eachArray) {
				sum += eachInt;
			}
			sums[i] = sum;
			i++;
		}
		return sums;
		}

}
