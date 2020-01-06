package TheFirstOne;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        // Write a method where u check to see if the word u pass is Anagram
        // Anagram is a word, phrase, or name formed by rearranging the letters of another.
        // Examples: cinema => iceman, dear ==> read

        String str1 = "cinema";
        String str2 = "iceman";

        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        System.out.println(Arrays.toString(ch1));

        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch2));

        boolean isAnagram = Arrays.equals(ch1, ch2);
        System.out.println("Is cinema Anagram?: " + isAnagram);

    }
}
