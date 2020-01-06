package TheFirstOne;

public class Sum_Of_Colum_X_Values {

	public static void main(String[] args) {
		

		// Complete the sumColumnValues method so that given a 2-D int array and 
		// an integer representing the column to sum. 
		// Sum up the all elements in that column in the given array.

		// TheThirdOne :int[][] array = {
		//								{-5, -2, -3, 7},
		//								{ 1, -5, -2, 2},
		//								{ 1, -2,  3,-4}
		//							};
		// System.out.println(sumColumn(a,1)); //should print -9
		
		System.out.println(sumColumnValues(new int[][] {{-5, -2, -3, 7},{1, -5, -2, 2},{1, -2,  3,-4}}, 3)); 
	
	}
	
	
	public static int sumColumnValues(int[][] Array, int column) {
		
		int sum = 0;
		
		for (int[] eachArray : Array) {
			sum += eachArray[column];
		}
		return sum;
	}
	
}
