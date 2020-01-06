package TheFirstOne;

public class Count_of_A_Word_in_String {

	public static void main(String[] args) {
		
		// Write a method that returns the number of times 
		// that the string "java" appears anywhere in the given string word.
		String str = "I love Java. Java is number one language. Java is popular.";
		System.out.println(countOfWordInAString(str));
	}
	
	public static int countOfWordInAString(String str) {
		
		int count = 0;
		
		for(int i = 0 ; i < str.length()-3 ; i++) {
			if(str.substring(i, i + 4).equalsIgnoreCase("java"))
				count ++;
		}
		
		return count;
	}

}
