package TheFirstOne;

public class Count_of_Code {

	public static void main(String[] args) {

		// Print the number of times that the string "code" appears anywhere in the
		// string.
		// We'll accept any letter for the 'd', so "cope", "core" and "cooe" count.
		
		System.out.println(count_of_Code("codecooecopecoee"));
	}

	public static int count_of_Code(String str) {
		
		int count = 0;

		for (int i = 0; i < str.length() - 3; i++) {
			if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e')
				count++;
		}
		return count;
	}

}
