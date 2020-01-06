package TheFirstOne;

import java.util.Arrays;

public class Shortest_Word_and_MinVowels {

	public static void main(String[] args) {

		// Write a program that will print the shortest word in the given array.

		String[] sArray = new String[] { "flafla", "123679894", "afjdhkafklafsahflkalka", "Ali", "fasfasdf" };
		System.out.println(find_Shortest_Word(sArray));
	
		System.out.println(find_Longest_Word(sArray));

		String[][] strArray = new String[][] { { "turgut", "hill", "aysel" }, { "eslem", "ali", "hA" } };
		System.out.println(Arrays.deepToString(strArray));
		System.out.println(minVowels(strArray));

	}

	//================== SHORTEST WORD ====================
	
	public static String find_Shortest_Word(String[] sArray) {

		String shortestWord = sArray[0];

		for (int i = 0; i < sArray.length; i++) {
			if (sArray[i].length() < shortestWord.length())
				shortestWord = sArray[i];
		}
		return shortestWord;
	}
	
	//================== LONGEST WORD =====================
	
	public static String find_Longest_Word(String[] words) {
		
		String longest = "";
		
		for(int i = 0; i < words.length; i++) {
				if(words[i].length() > longest.length())
					longest = words[i];
		}
		return longest;
	}
	
	//=============== SHORTEST MINVOWEL WORD =================

	// Complete the minVowels method so that given the array words,
	// it will return the word with the least number of vowels.
	// If there are two or more words with the same number of vowels,
	// it should return the shortest word.
	// You may find it helpful to write a helper method called countVowels
	// that uses an accumulator algorithm to count the vowels.
	// TheThirdOne: String[] arr = {"hey","hello","hi","this is long"};
	// System.out.println(minVowels(arr)); // should print "hi"

	public static String minVowels(String[][] strArr) {

		int min = Integer.MAX_VALUE;
		String word = "";

		for (int i = 0; i < strArr.length; i++) {

			for (int j = 0; j < strArr[i].length; j++) {
				int vowelCount = countVowels(strArr[i][j]);
				if (vowelCount < min) {
					min = vowelCount;
					word = strArr[i][j];

					if (strArr[i][j].length() < word.length())
						word = strArr[i][j];
					continue;
				}
			}
		}
		return word;
	}

	// Helper method for counting the vowels.
	public static int countVowels(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			switch (str.charAt(i)) {
			case 'a':
				break;
			case 'e':
				break;
			case 'i':
				break;
			case 'u':
				break;
			case 'o':
				break;
			case 'A':
				break;
			case 'E':
				break;
			case 'I':
				break;
			case 'U':
				break;
			case 'O':
				break;
			}

			count++;
		}
		return count;
	}

}
