package TheFirstOne;

public class Print_Word_N_Times {

	public static void main(String[] args) {
		
		// Given two strings, word and a separator as sep.
		// return a big string made of count occurrences of the word, separated by the sep string. 
		// All the variables in the questions will be passed into the method as (word, sep, count)

		System.out.println(countOfWord("Ozkan",5,"/"));
		print_Message_N_Times(new String("Hello!"));
		
	}

	public static String countOfWord(String str, int count, String sep) {
		
		String result = "";
		
		for (int i = 1; i <= count; i++) {
			if(i == count) {
				result += str;
			} else {
				result += str + sep;				
			}			
		}
		return result;
	}
	
	//========== ANOTHER DIFFERENT METHOD ===========
	
	// Print a String 5 times in one row. Then print total of 5 rows of the same message.
	public static void print_Message_N_Times(String word) {
		
		for(int i = 1; i <= 5; i ++) {
			for(int j = 1; j <= 5; j ++) {
				System.out.print(word + " ");
			}
			System.out.println();
		}
		
	}
	
}
