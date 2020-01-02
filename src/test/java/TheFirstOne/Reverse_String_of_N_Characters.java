package TheFirstOne;

public class Reverse_String_of_N_Characters {

	public static void main(String[] args) {
		
		// Write a method that will reverse a string. 
		//Your should reverse a string only 5 characters long. 
		// If word is shorter, display message: "Too short!". 
		// If word is longer, display message: "Too long!". 
		// Otherwise, reverse this word and print out result into the console.
		
		String str = "Leyla";
		System.out.println(reverse_String_of_N_Characters(str));
	
	}
	
	public static String reverse_String_of_N_Characters(String str) {
		
		String reversed = "";
		
		if(str.length() > 5)
			return "Too long";
		if(str.length() < 5)
			return "Too short";
		
		for (int i = str.length()-1; i >= 0 ; i--) {
			reversed += str.charAt(i);
		}
		System.out.println(reversed);
		return reversed;
	}

}
