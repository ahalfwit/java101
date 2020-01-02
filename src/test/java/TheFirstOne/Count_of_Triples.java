package TheFirstOne;

public class Count_of_Triples {

	public static void main(String[] args) {
		
		// We'll say that a "triple" in a string, is a char appearing three times in a row. 
		// Print out the number of triples in the given string. The triples may overlap.
		
		System.out.println(count_of_Triples("aaaibibgbgggckckcddddddd"));
	}
	
	public static int count_of_Triples(String str) {
		
		int count = 0;
		
//		for(int i = 0 ; i < str.length() - 2 ; i++) {
//			if(str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2))
//				count ++;
//		}
		
		char[] chArr = str.toCharArray();
		
		for(int i = 0 ; i < chArr.length -2 ; i++) {
			if(chArr[i] == chArr[i + 1] && chArr[i] == chArr[i + 2])
				count ++;
		}
		
		return count;
	}

}
