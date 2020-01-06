package TheFirstOne;

import java.util.Arrays;

public class Print_X_from_A_String_Array {

	public static void main(String[] args) {
		
		String str1 = "Ahmet okula hemen gel";
		System.out.println(str1);
		
		String[] strArr = str1.split(" ");
		System.out.println(Arrays.toString(strArr));
		
		for (int i = 0; i < strArr.length; i++) {
//			if(strArr[i].equals("gel")) {
//				System.out.println(strArr[i]);
//			}
			if(i == 1) {
				System.out.println(strArr[i]);
			}
		}
		
		String str2 = "Laptops out for harambee";
		System.out.println(str2);
		
		char[] charArr = str2.toCharArray();
		System.out.println(Arrays.toString(charArr));
		
		for (int i = 0; i < charArr.length; i++) {
			if(i >= 7 ) {
				System.out.print(charArr[i]);
			}
		}
	}
}

