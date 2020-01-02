package TheFirstOne;

public class Permutation {

	public static void main(String[] args) {

		// Write a method to print all the combination of the String.
		// TheThirdOne: String = "GH" --> GH AND HG

		permutation("MAN", "");
		letters_Combination();
	}

	public static void permutation(String str, String ans) {

		if (str.length() == 0)
			System.out.println(ans);

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			
			String ros = str.substring(0, i) + str.substring(i + 1);
		
			permutation(ros, ans + ch);
			
		}
	}
	
	public static void letters_Combination() {
		
		String[] letters = {"G","O","D"};
		
		for (String each1 : letters) {
			for (String each2 : letters) {
				for (String each3 : letters) {
					System.out.println(each1 + each2 + each3);
				}
			}
		}
		
		
	}

}
