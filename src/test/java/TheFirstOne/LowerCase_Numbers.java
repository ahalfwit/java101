package TheFirstOne;

public class LowerCase_Numbers {

	public static void main(String[] args) {
		
		// Write a method to extract lower case letters and numbers separately from given String 
		// TheThirdOne: a1b2c3 ==> abc and ==> 123

		System.out.println(lowerCase_and_Numbers(new String("a1b2c3AZ")));
	}
	
	public static String lowerCase_and_Numbers(String str) {
		
		String letters = "";
		String numbers = "";
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
				letters += str.charAt(i);
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57)
				numbers += str.charAt(i);
		}
		return "Letters: " + letters + "\nNumbers: " + numbers;
	}

}
