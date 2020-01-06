package TheFirstOne;

public class Reverse_Words_Of_A_String {

	public static void main(String[] args) {

		// String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		// Turn each word into a char array.
		// Print reverse of each char out with seperated by - output : k-e-t-r-e-b-y-C ...

		printReversedWords("Cybertek Batch Spartan is most hardworking Batch ever");
	}

	public static void printReversedWords(String str) {

		String[] arrOfWords = str.split(" ");

		for (int i = 0; i < arrOfWords.length; i++) {
			char[] arrOfLetters = arrOfWords[i].toCharArray();
			String eachResult = "";
			
			for (int j = arrOfLetters.length - 1; j >= 0; j--) {
				eachResult += arrOfLetters[j] + "-";	
			}

			System.out.println(eachResult);

		}
	}

}
