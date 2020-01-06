package TheFirstOne;

public class Largest_Number_in_two_Dimentional_Array {

	public static void main(String[] args) {
		
		int[][] twoDimArray = {{1,2,3},{4,5,6,7},{77,88,99,12345}};
		System.out.println(findLargestNumber(twoDimArray));
	}
	
	public static int findLargestNumber(int[][] twoDimArray) {
		
		int max = Integer.MIN_VALUE;
		
		for (int[] intArr : twoDimArray) {
			for (int each : intArr) {
				if(each > max)
					max = each;
			}
		}
		return max;
	}
}
