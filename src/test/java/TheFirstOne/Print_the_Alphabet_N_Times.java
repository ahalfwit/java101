package TheFirstOne;

public class Print_the_Alphabet_N_Times {

	public static void main(String[] args) {
		
		printAlphabet_N_Times();
		
	}
	
	public static void printAlphabet_N_Times() {
		
		// char j = 65; j <= 90; for Capital Letters
		// char j = 97; j <= 122; for small letters
		for (int i = 1; i <= 5; i++) {
			for (char j = 65; j <= 90; j++) {
				System.out.print(j+" ");
			}
				System.out.println();
		}
	}

}
