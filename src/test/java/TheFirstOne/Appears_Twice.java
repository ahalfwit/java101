package TheFirstOne;

public class Appears_Twice {

	public static void main(String[] args) {
		
		// Write a method that returns true if target appears only twice in the string, otherwise false.
		// TheThirdOne: appearsTwice("java", "java is fun!") ==> returns false

		//boolean b = appears_Twice("Java is good. Java is popular.", "Java");
		//System.out.println(b);
		System.out.println(appears_Twice("Java is good. Java is popular.", "Java"));
	}
	
	public static boolean appears_Twice(String str, String target) {
		
//		int len = target.length();
//		int counter = 0;
//		
//		for(int i = 0; i < str.length() - len; i++) {
//			if(str.substring(i, i + len).equals(target))
//				counter ++;
//		}
//		return counter == 2;
		
		int count = 0;
		
		String[] strArr = str.split(" ");
		for (String each : strArr) {
			if(each.equals(target))
				count ++;
		}
		return count == 2;
	}

}
