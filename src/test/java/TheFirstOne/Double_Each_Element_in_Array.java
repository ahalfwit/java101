package TheFirstOne;

import java.util.ArrayList;
import java.util.Arrays;

public class Double_Each_Element_in_Array {

	public static void main(String[] args) {
		
		// This method should create a new ArrayList of Integers. 
		// It will contain every value of the ArrayList parameter repeated twice.
		// TheThirdOne: ArrayList<Integer> (List.of(1,5,3,7)) ==> (1,1,5,5,3,3,7,7)

		System.out.println(douple_Each_Element(new ArrayList <Integer> (Arrays.asList(1,5,3,7))));
	}
	
	public static ArrayList<Integer> douple_Each_Element(ArrayList <Integer> al) {
		
//		ArrayList<Integer> newAl = new ArrayList<>(al);
//		
//		for (int i = 0, j = 0 ; i < al.size(); i++, j += 2) {
//			newAl.add(j, al.get(i));
//		}
//		return newAl;
		
		//============== ANOTHER DIFFERENT WAY ===============
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(Integer each : al) {
			result.add(each);
			result.add(each);
		}
		
		return result;
		
	}
	
}
