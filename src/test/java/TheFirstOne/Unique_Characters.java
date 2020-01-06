package TheFirstOne;

import java.util.HashSet;
import java.util.Set;

public class Unique_Characters {

	public static void main(String[] args) {
		
		// Write a method that you will print unique characters from a String.
				
		String str = "Java";
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			String each = str.substring(i, i+1);
			System.out.print(each);
			if( ! result.contains(each))
				result += each;
		}
		System.out.println("\nResult: " + result);
		
		// ====== TheThirdOne.Technical.A DIFFERENT WAY ========
		
		Set<Character> uniqItem = new HashSet<>();
		
		char[] charArr = str.toCharArray();
		for (char each : charArr) {
			if( ! uniqItem.contains(each)) {
				uniqItem.add(each);
			} 
		}
		System.out.println("Unique items: " + uniqItem);
	
		
		// Calling a method...
		System.out.println(unique_Letters("AAABBBCCCDEFGGG"));
	}
	
	// Create a method that can find the unique characters from the String 
	public static String unique_Letters(String str) {
		
		String result = "";
		int count;
		
		for (int i = 0; i < str.length(); i++) {
			count = 0;
			
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j))
					count ++;
			}
			if(count == 1)
				result += str.charAt(i);
		}
		return result;
	}

}
