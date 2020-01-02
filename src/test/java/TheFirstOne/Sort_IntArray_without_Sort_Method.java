package TheFirstOne;

import java.util.Arrays;

public class Sort_IntArray_without_Sort_Method {

	public static void main(String[] args) {
		
		int[] array = new int[] {2, 86, 72, 8, 99};
		
		// Sort array using sort method. By default it ascending order.
		//Arrays.sort(array);
		//System.out.println(Arrays.toString(array));
		
		// This for loop gives descending order
//		for (int i = array.length-1 ; i >= 0 ; i--) {
//			System.out.print(array[i]+" ");
//		}
		
		System.out.println(Arrays.toString(array));
		
		// Now sort the int array without using sort method
		// int[] arr = {2,86,72,8} ==> {2,8,72,86} or {86,72,8,2}
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array.length-1; j++) {
				
				if(array[j] < array[j+1]) {
				// if current item is smaller than next item	
				// put current item into temp and put next item into the first place,
				// then put the item in temp as the second place.
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		} 

		System.out.println(Arrays.toString(array));
	}
}
