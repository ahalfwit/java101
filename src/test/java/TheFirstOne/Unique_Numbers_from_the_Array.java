package TheFirstOne;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Unique_Numbers_from_the_Array {

	// Write a method that will print all unique integers from an array of numbers.
	// Every single unique number should be printed from the new line.

	public static void main(String[] args) {

		Integer intArr[] = {1, 8, 8, 8, 2, 3, 3, 4, 5, 2, 2, 2, 5};

//		Map<Integer, Integer> map = new HashMap<>();
//		
//		for (Integer each : intArr) {
//			if( ! map.containsKey(each)) {
//				map.put(each, 1);
//			} else { 
//				map.put(each, map.get(each) + 1);
//			}
//		}
//		System.out.println(map.keySet());
		
		//============== ANOTHER WAY ================
		
		Set<Integer> uniqueKeys = new TreeSet<Integer>();
		//uniqueKeys.addAll(Arrays.asList(intArr));
	
		for (Integer each : intArr) {
			if( ! uniqueKeys.contains(each)) {
				uniqueKeys.add(each);
			} 
		}
		System.out.println(uniqueKeys);
		
		
		printIntOnce(new int[] {1,1,2,2,3,3,4,4,5,5});
		
		// Given an array of numbers with 7 integers every element is repeated twice.
		// Find the elements that are not repeated twice and print them on the console.

		int[] intArray = { 1, 1, 2, 3, 3, 3, 4, 4, 5, 66, 66 };
		find_NonRepeated_Number(intArray);
	}
		
		//============== ANOTHER WAY ================
		
		public static void printIntOnce(int[] intArr) {
			
			ArrayList<Integer> al = new ArrayList<>();
			
			for(int i = 0; i < intArr.length; i++) {
				
				if( ! al.contains(intArr[i])) {
					al.add(intArr[i]);
					System.out.println(intArr[i]);
				}
			}
			System.out.println(al);
		}
		
		public static void find_NonRepeated_Number(int[] intArr) {
			
			int count;
			
			for (int each : intArr) {
				count = 0;
				
				for(int i = 0 ; i < intArr.length ; i++) {
					if(each == intArr[i])
						count ++;
				}
				if(count == 1)
					System.out.println(each);
			}
		}
		
}
