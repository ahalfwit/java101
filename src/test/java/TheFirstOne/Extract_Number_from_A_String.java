package TheFirstOne;

public class Extract_Number_from_A_String {

	public static void main(String[] args) {
		
		// Write a method that gets any number from a string.
		// TheThirdOne: "aa2aa3" ==> 23
		
		String str = "1abc2def3";
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				result += str.charAt(i) + " ";
			}
		}
		System.out.println("Result: " + result);
	}

}
