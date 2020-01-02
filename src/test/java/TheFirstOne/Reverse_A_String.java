package TheFirstOne;

public class Reverse_A_String {

	public static void main(String[] args) {

		// Write a method where u reverse a sentence.
		// TheThirdOne: I love you ==> you love I

		String str = "I love you.";
		String result = "";

		System.out.println("Original Sentence: " + str);

		String[] strArray = str.split(" ");

		for (int i = strArray.length - 1; i >= 0; i--) {
			result = result + strArray[i] + " ";
		}

		System.out.println("Reversed Sentence: " + result);
		
		// ===== Reverse a word by traditional hard coded way =====

		String string = "whatever";
		String reversedString = "";
		
		for (int i = string.length() - 1; i >= 0; i--) {
			reversedString = reversedString + string.charAt(i);
		}
		
		System.out.println("Reversed word: " + reversedString);

		// Reverse a word using StringBuffer
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("Reversed word: " + reverse);

		// Reverse a sentence using StringBuilder
		String sentence = "I love Java.";
		StringBuilder sb = new StringBuilder();
		String[] words = sentence.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]).append(" ");
		}
		System.out.println("Reversed Sentence: " + sb.toString());

	}

}
