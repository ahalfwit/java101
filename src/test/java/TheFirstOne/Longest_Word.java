package TheFirstOne;

import java.util.ArrayList;
import java.util.Arrays;

public class Longest_Word {

	public static void main(String[] args) {
		
		String[] strArr = {"aaa","bbbb","whasstupp","longg","jaaaavaaaa"};
		System.out.println(findLongestWord(strArr));
		
		System.out.println(longestDayOfWeek(new ArrayList<String> (Arrays.asList("mONDAY","tUESDAY","Wednesday","Thursday","Friday","Saturday","Sunday"))));
		
	}
	
	public static String findLongestWord(String[] strArr) {
		
		String result = "";
		
		for (String each : strArr) {
			int length = each.length();
			if(length > result.length())
				result = each;
		}
		return result;
	}
	
	// Create a string ArrayList with days of the week.
	// Then find the day with most number of letters in it (longest String).
	
	public static String longestDayOfWeek(ArrayList<String> al) {
		String longestDay = "";
		
		for(String each : al) {
			if(each.length() > longestDay.length())
				longestDay = each;
		}
		return longestDay;
	}

}
