package TheFirstOne;

public class Letters_Combination {

	public static void main(String[] args) {
		
		// Write a loop that displays all possible combinations of two letters 
		// where the letters are 'z', or 'y', or 'x', or 'w', or 'v'. 
		// The combinations should be displayed in descending alphabetical order:
		// TheThirdOne: zz zy zx zw zv yz .... vv
		
		//String[] letters = {"z","y","x","w","v"};
		//letters_Combination(letters);
		letters_Combination(new String[] {"a","b","c"});
	}
	
	public static void letters_Combination(String[] letters) {
		
		for (String each1 : letters) {
			for (String each2 : letters) {
				System.out.println(each1 + each2);
			}
		}
	}

}
