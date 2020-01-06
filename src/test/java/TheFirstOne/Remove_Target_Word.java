package TheFirstOne;

import java.util.ArrayList;

public class Remove_Target_Word {

	public static void main(String[] args) {
		// an ArrayList of Strings called wordList,
		// and a String called targetWord.
		// So remove the targetWord from ArrayList.

		// removeAll7(new ArrayList<String>(List.of("h","h","a","y")),"h");

		// Write a that will remove the targetWord from ArrayList.
		// TheThirdOne: ("hi","hey","hi","you"); remove (wordList,"hi"); ==> ["hey","you"]

		ArrayList<String> words = new ArrayList<>();
		words.add("hi");
		words.add("hey");
		words.add("hi");
		words.add("you");
		System.out.println(words);
		
		String target = "hi";
		
		removeAll(words, target);
		
	}

	public static void removeAll(ArrayList<String> words, String target) {
	
		for(int i = 0;i<words.size();i++) {
			if (words.get(i).equals(target)) {
				words.remove(i);
			}
		}
		
		System.out.println(words);
	}

}
