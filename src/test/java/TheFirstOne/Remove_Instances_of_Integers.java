package TheFirstOne;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Instances_of_Integers {

	public static void main(String[] args) {
		
		// Write a method accepts an ArrayList of Integers and a number(Integer). 
		// It removes any instance of the number it gets from the Arraylist.
		// TheThirdOne: removeInst([1,1,2,3,1,4],1) ==>  [2,3,4]
		
		//ArrayList<Integer> all = new ArrayList<Integer>({1,1,2,3,1,4});
		
		System.out.println(remove_Instances_of_Integers(new ArrayList<Integer>(Arrays.asList(1,1,2,3,1,4)), 1));
	}
	
	public static ArrayList<Integer> remove_Instances_of_Integers(ArrayList<Integer> al, int num) {
		
		System.out.println("Original TheThirdOne.Pages.Array list: "+al);
		
		for (int i = 0; i < al.size(); i++) {
			//System.out.println(all +" ==> " +all.size() + " ==> " + i );
			if(al.get(i) == num) {
				al.remove(i);
				i--;
			} 
		}
		return al;
	}

}
