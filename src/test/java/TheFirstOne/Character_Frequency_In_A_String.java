package TheFirstOne;

import java.util.HashMap;
import java.util.Map;

public class Character_Frequency_In_A_String {

	public static void main(String[] args) {
		
		String str = "A8aroimZZZZ65ZH28UHU9999Hhiioam8288";
		System.out.println(counts_Of_Character_in_A_String(str));
		System.out.println(frequency_of_Characters(new String("AAABBCCCCDDD")));
	}
	
	// Write a method which returns how many times each letter is repeated.
	public static Map<String, Integer> counts_Of_Character_in_A_String(String str) {
		
		Map<String, Integer> map = new HashMap<>();
		
		String[] strArray = str.split("");
		
		int count = 0;
		
		for (String each : strArray) {
			count = 0;
			for (int i = 0; i < strArray.length; i++) {
				if(each.equals(strArray[i])) {
					count ++;
				}	
			}
			map.put(each, count);
		}
		
//		for (String each : strArray) {
//			if( ! map.containsKey(each)) {
//				map.put(each, 1);
//			} else { 
//				//map.put(each, map.get(each) + 1);
//				map.put(each, each.length() + 1);
//			}
//		}
		
		return map;
		
	}
	
	// This method finds the frequencies of the characters in a String: 
	// TheThirdOne: ("AAABBCCCCDDD") ==>  A3-> B2-> C4-> D3
	public static String frequency_of_Characters(String str) {
		
		String result = "";
		int count;
		
		for(int i = 0; i < str.length(); i++) {
			count = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j))
				count ++;
			}
			if( ! result.contains(str.charAt(i) + ""))
				result += str.charAt(i) + "->" + count+ " ";
		}
		return result;
	}
	
	

}
