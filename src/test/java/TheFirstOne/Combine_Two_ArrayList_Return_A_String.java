package TheFirstOne;

import java.util.ArrayList;
import java.util.Arrays;

public class Combine_Two_ArrayList_Return_A_String {

	public static void main(String[] args) {
		
		// This method accepts an ArrayList of ArrayLists and returns it as a string.
		// Method concatenates all values from each ArrayList and returns it as one String. 
		// TheThirdOne: printList([["a","b","c","d"],["1","2","3","4"]]) ==> "abcd1234"
		
		ArrayList<ArrayList<String>> al = new ArrayList<ArrayList<String>>();
		al.add(new ArrayList<String> (Arrays.asList("a","b","c","d")));
		al.add(new ArrayList<String> (Arrays.asList("1","2","3","4")));
		
		System.out.println(printList(al));
	}

	public static String printList(ArrayList<ArrayList<String>> al) {
		
		String result = "";
		
		for(ArrayList<String> eachAl : al) {
			for(String each : eachAl) {
				result += each;
			}
		}
		return result;
	}
	
}
