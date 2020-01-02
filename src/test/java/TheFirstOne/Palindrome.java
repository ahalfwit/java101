package TheFirstOne;

public class Palindrome {

	// TheThirdOne.Technical.A palindrome is a word, number, phrase, or other sequence of characters
	// which reads the same backward as forward, such as madam or the number 10801. 
	// Write a program that will verify if word is palindrome.
	
	public static void main(String[] args) {
		
		String str = "hannahr";
		String reversed = "";
		
		char[] charArr = str.toCharArray();
		for (int i = charArr.length-1 ; i >= 0 ; i--) {
			reversed += charArr[i];
			System.out.println(reversed);
		}
		if(str.equals(reversed)) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is NOT a palindrome.");
		}
	}

}
