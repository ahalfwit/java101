package TheFirstOne;

import java.util.Arrays;

public class Appears_Twice {

    public static void main(String[] args) {

        // Write a method that returns int if target appears more than one in the string.
        // TheThirdOne: appearsTwice("java", "java is fun!") ==> returns false

        //boolean b = appears_Twice("Java is good. Java is popular.", "Java");
        //System.out.println(b);
        System.out.println(appears_Twice("Java is good. Java Java is popular.", "Java"));
    }

    public static int appears_Twice(String sentence, String target) {

//		int len = target.length();
//		int counter = 0;
//		
//		for(int i = 0; i < str.length() - len; i++) {
//			if(str.substring(i, i + len).equals(target))
//				counter ++;
//		}
//		return counter == 2;

        int count = 0;

        String[] strArr = sentence.split(" ");
        System.out.println("-------------strArr-----------------");
        System.out.println(Arrays.toString(strArr));
        for (String each : strArr) {
            if (each.equals(target))
                count++;
        }
        return count;
    }

}
