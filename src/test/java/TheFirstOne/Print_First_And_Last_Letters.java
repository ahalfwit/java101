package TheFirstOne;

public class Print_First_And_Last_Letters {

	public static void main(String[] args) {
		
		printFirstAndLastLettersOfEachWord(new String[] {"Aysel","Emine","Halime","Arif"});

	}
	
	// Given a String array words, iterate through each word 
	// and print first and last letter of each element in separate lines.

	public static void printFirstAndLastLettersOfEachWord(String[] words) {
		
		//String[] words{"hey"} ==> hy
		
		for(int i = 0; i < words.length; i++) {
			String eachWord = words[i];
			System.out.println((i + 1) + " ==> " +eachWord.charAt(0) + eachWord.charAt(eachWord.length() - 1));
			
		}
		
	}

}
