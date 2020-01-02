package TheFirstOne;

public class Remove_First_and_Last_X_from_the_String {

	public static void main(String[] args) {
		
		// Given a string, if the first or last chars are 'x' or 'X', 
		// return the string without those 'x' or 'X' chars.
		// Otherwise return the string unchanged.
		
		String str = "XMaximus";
		System.out.println(remove_X_from_the_String(str));

	}
	
	public static String remove_X_from_the_String(String str) {
		
		if(str.length() > 1 && str.substring(0,1).equalsIgnoreCase("x") 
				&& str.substring(str.length()-1).equalsIgnoreCase("x"))
			return str.substring(1, str.length() - 1);
		
		if(str.substring(0, 1).equalsIgnoreCase("x"))
			return str.substring(1);
		
		if(str.substring(str.length() - 1).equalsIgnoreCase("x"))
			return str.substring(0, str.length()-1);
		
		return str;
	}

}
