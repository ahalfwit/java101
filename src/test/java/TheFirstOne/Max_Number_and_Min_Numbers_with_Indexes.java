package TheFirstOne;

public class Max_Number_and_Min_Numbers_with_Indexes {

	public static void main(String[] args) {

		int array[] = new int[] { 23, 34, 13, 64, 72, 99, 10, 15, 7, 27 };

		int max = array[0]; // assume first element as the largest number
		int min = array[0]; // assume first element as the smallest number

		// iterate for loop from arrays 1st index (second element)
		for (int i = 1; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}

			if (array[i] < min) {
				min = array[i];
			}
		}
		
		System.out.println("The largest number in the array is : " + max);
		System.out.println("The smallest number in the array is : " + min);

		// My own Try
//		
//		int array[] = new int[6];
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter first array item: ");
//		array[0] = scan.nextInt();
//
//		int max = array[0];
//		int indexOfMax = 0;
//
//		int min = array[0];
//		int indexOfMin = 0;
//
//		for (int i = 1; i < array.length; i++) {
//			System.out.println("Enter next array item: ");
//			array[i] = scan.nextInt();
//
//			if (array[i] > max) {
//				max = array[i];
//				indexOfMax = i;
//			} else if (array[i] < min) {
//				min = array[i];
//				indexOfMin = i;
//			}
//		}
//
//		System.out.println("Max item: " + max);
//		System.out.println("Max Item index: " + indexOfMax);
//
//		System.out.println("Min item: " + min);
//		System.out.println("Min Item index: " + indexOfMin);

	}
	
	

}
