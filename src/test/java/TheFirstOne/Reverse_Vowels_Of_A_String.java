package TheFirstOne;

public class Reverse_Vowels_Of_A_String {

	public static void main(String[] args) {
		
		// Write a method that will return a string with reversed vowels.
		// Input: str = "apple" ==> Output:  str = "eppla" 
		System.out.println(revese_Vowels("Apple"));

	}
	
	public static String revese_Vowels(String str) {
		
		int j = 0;
		String vowels = "";
		char[] cArr = str.toCharArray();
		
		for(int i = 0; i < cArr.length; i++) {
			if(isVowel(cArr[i])) {
				j++;
				vowels += cArr[i];
			}
		}
		for(int i = 0; i < cArr.length; i++) {
			if(isVowel(cArr[i]))
				cArr[i] = vowels.charAt(--j);
		}
		return String.valueOf(cArr);
	}

	private static boolean isVowel(char str) {
		
		return str == 'a'|| str == 'A'|| str == 'e'|| str == 'E'|| str == 'i'|| 
		str == 'I'|| str == 'o'|| str == 'O'|| str == 'u'|| str == 'U'|| str == 'y'|| str == 'Y';
	}

}
