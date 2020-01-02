package TheFirstOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Remove_Duplicates {

	public static void main(String[] args) {
		
		// Write a method where you remove the duplicate numbers from an array.
		// TheThirdOne: {1,1,2,2,3,3,3,4,5,5,5} ==> {1,2,3,4,5}
		
		removeDuplicates1(new int[] {1,1,2,2,7,3,3,4,5,5,6});
		removeDuplicates2(new int[] {1,1,2,9,9,9,2,7,3,3,4,5,5,6,8,8,8});
		removeDuplicates3(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5)));
		System.out.println(remove_Duplicates4(new String("ayata")));
	}
	
	// Remove duplicates from an int array using List.
	public static List<Integer> removeDuplicates1(int[] intArr) {
		
		List<Integer> list = new ArrayList<>();
		
		for (int each : intArr) {
			if( ! list.contains(each)) {
				list.add(each);
			}
		}
		System.out.println(list);
		return list;
	}
	
	// Remove duplicates from an int array using Set.
	public static Set<Integer> removeDuplicates2(int[] intArr) {
	
		Set<Integer> uniques = new TreeSet<>();
		
		for (int item : intArr) {
			uniques.add(item);
		}
		
		System.out.println(uniques);
		return uniques;
	}
	
	// Remove duplicates from an ArrayList.
	public static ArrayList<Integer> removeDuplicates3(ArrayList<Integer> al) {
		
		for(int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if(al.get(i) == al.get(j)) {
					al.remove(j);
					j--;
				}
			}
		}
		System.out.println(al);
		return al;
	}
	
	// Remove duplicates from a String. TheThirdOne: ayata --> ayt
	public static String remove_Duplicates4(String str) {
		
		String result = "";
	
//		for (int i = 0; i < str.length(); i++) {
//			if( ! result.contains(str.charAt(i) + ""))
//					result += str.charAt(i);
//		}
		
		String[] strArr = str.split("");
		for (int i = 0; i < strArr.length; i++) {
			if( ! result.contains(strArr[i]))
				result += strArr[i];
		}
		return result;
	}
	

}
