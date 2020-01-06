package TheFirstOne;

public class Largest_Number_And_Second_Largest_Number {

	/*  This example shows you how to find largest or maximum number in an array
	 *  Step 1: Initialize array value
	 *  Step 2: Initialize max value as array's first value: (int max = array[0];)
	 *  Step 3: Iterate array using a for loop (exclude arrays first position 0):
	 *  		(for int i = 1; i < array.length; i++ )
	 *  Step 4: Use if condition to compare current array value with max value. 
	 *  		If current array value is greater than max value then assign array current value as max .
	 *  Step 5: Continue the loop and resign the max value if array current value is greater than max
	 */
	
	/* Step 1: To find the second largest number iterate the given array
	 * Step 2: (first if condition arr[i] > largest):
	 * 			If current array value is greater than largest value then
	 * 			Move the largest value to secondLargest and make current value as largest
	 * Step 3: (second if condition arr[i] > secondLargest )  
	 * 			If the current value is smaller than largest and greater than secondLargest  then
	 * 			the current value becomes secondLargest
	 */
	
	public static void main(String[] args) {
		
		int nums[] = { 5, 34, 78, 2, 45, 100, 99, 23 };
		
		int maxOne = 0;
		int maxTwo = 0;
		
		for (int i = 0 ; i < nums.length ; i++) {
			
			if (maxOne < nums[i]) {
				maxTwo = maxOne;
				maxOne = nums[i];
			}
			else if (maxTwo < nums[i]) {
				maxTwo = nums[i];
			}
		}
		System.out.println("Largest Number: " + maxOne);
		System.out.println("TheSecondOne Largest Number: " + maxTwo);
		
		// My own Try
		
		int numbers[] = { 5, 434, 678, 20, 545, 100, 99, 3 };
		
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			
			if(max1 < numbers[i]) {
				max2 = max1;
				max1 = numbers[i];
			} else if(max2 < numbers[i]) {
				max3 = max2;
				max2 = numbers[i];
			} 	
		}
		System.out.println("The Max 1: " + max1);
		System.out.println("The Max 2: " + max2);
		System.out.println("The Max 3: " + max3);
		
	}

}
