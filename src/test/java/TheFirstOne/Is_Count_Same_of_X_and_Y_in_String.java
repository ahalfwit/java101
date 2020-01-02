package TheFirstOne;

public class Is_Count_Same_of_X_and_Y_in_String {

	public static void main(String[] args) {
		
		// Print true if "cat" and "dog" appear the same number of times in the string. 
		
		//String str = "kadjadoGhkajsfaCATlhsdogDOGcatCat";
		String str = "javaeaklmripythonleieajavamergpythonıliea";
		System.out.println(count_of_X_And_Y(str));

	}

	public static boolean count_of_X_And_Y(String str) {
		
//		int countCat = 0;
//		int countDog = 0;
//		
//		for (int i = 0; i < str.length() - 2; i++) {
//			
//			if(str.substring(i, i+3).equalsIgnoreCase("cat"))
//				countCat ++;
//			
//			if(str.substring(i, i+3).equalsIgnoreCase("dog"))
//				countDog ++;
//		}
//		return countCat == countDog;
		
		int countJava = 0;
		int countPython = 0;
		
		for(int i = 0; i < str.length() - 5; i++) {
			
			if(str.substring(i, i + 4).equalsIgnoreCase("java"))
				countJava ++;
			if(str.substring(i, i + 6).equalsIgnoreCase("python"))
				countPython ++;
		}
		return countJava == countPython;
	}
	
}
