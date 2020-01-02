package TheFirstOne;

import java.util.ArrayList;
import java.util.Arrays;

public class Get_Positives_and_Add_Sum_as_Last_Item {

	public static void main(String[] args) {
		
		// This method returns an ArrayList<Integer> and accepts a parameter as an ArrayList<Integer>.		
		// This method should Create a new ArrayList of positives Integers only. 
		// Sum the positive Integers in the new ArrayList and add the Sum as the last element.
		// TheThirdOne: ArrayList contains (5,-6,4,-8,0,6,-3) ==> ArrayList returned (5,4,6,15) with 15 being the sum.
		// The original ArrayList should remain unchanged.
		
		System.out.println(Get_Positives_and_Add_Sum(new ArrayList<Integer>(Arrays.asList(5,-6,4,-8,0,6,-3))));

	}
	
	public static ArrayList<Integer> Get_Positives_and_Add_Sum(ArrayList<Integer> al) {
		
		ArrayList<Integer> newAll = new ArrayList<>();
		
		int sum = 0;
		
		for (Integer each : al) {
			if(each > 0) {
				newAll.add(each);
				sum += each;
			}
		}
		
		newAll.add(sum);
		
		System.out.println("Original ArrayList: " + al);
		return newAll;
	}

}
