package TheThirdOne.Technical;

import java.util.HashMap;
import java.util.Map;

public class InterviewOne {


    /**
     * @param args
     */
    public static void main(String[] args) {

        // System.out.println(countChar("abbc"));
        // System.out.println(same("abcd", "dbaa"));
        // System.out.println(removeDup("abccdeee"));
        // printUnique("aabbc");
        // printNumbers();
        fibonacci(3);
        identify(7);
    }

    /*
     * Write a method that will count number of each char in a String
     * countChar("abbc"); -> {a=1, b=2, c=1}
     */
    public static String countChar(String chars) {

        if (chars.length() == 0)
            return "";

        String unique = "";
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length(); i++) {
            if (!unique.contains(chars.charAt(i) + ""))
                unique += chars.charAt(i);
        }
        System.out.println(unique);

        for (int i = 0; i < unique.length(); i++) {
            count = 0;
            for (int j = 0; j < chars.length(); j++) {
                if (unique.charAt(i) == chars.charAt(j))
                    count++;
            }
            map.put(unique.charAt(i), count);
        }

        return map.toString();
    }

    /*
     * Write a method that check if a string is build out of the same letters as
     * another string same("abc","cab"); -> true same("abc","abb"); -> false
     */
    public static boolean same(String str1, String str2) {

        if (str1.length() == 0 || str2.length() == 0)
            return false;

        if (str1.length() != str2.length())
            return false;

        boolean isSame = true;

        for (int j = 0; j < str2.length(); j++) {
            if (!str2.contains(str1.charAt(j) + "") || !str1.contains(str2.charAt(j) + "")) {
                isSame = false;
            }
        }

        return isSame;
    }

    /*
     * Write a method that will remove all dupplicates from string
     * removeDup("abcc"); -> "abc"
     */
    public static String removeDup(String str) {

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains(str.charAt(i) + ""))
                unique += str.charAt(i);
        }

        return unique;
    }

    /*
     * Write a method that will print only unique letters of given string
     * printUnique("aabbc") -> "c" printUnique("aabc") -> "bc"
     */
    public static void printUnique(String str) {

        String newStr = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (newStr.indexOf(current) < 0) { // If not found return -1
                newStr += current;
            } else {
                newStr = newStr.replace(String.valueOf(current), "");
            }
        }

        System.out.println(newStr);
    }

    /*
     * Write a method which prints out the numbers from 1 to 30 but for numbers
     * which are a multiple of 3, print "FIN" instead of the number and for numbers
     * which are a multiple of 5, print "RA" instead of the number for numbers which
     * are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */
    public static void printNumbers() {

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }

    /*
     * Method that prints numbers in fibonacci sequence in java. In fibonacci
     * series, next number is the sum of previous two numbers for example 0, 1, 1,
     * 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are
     * 0 and 1. Method will accepts one int as arg. fibonacci(5); -> 0, 1, 1, 2, 3
     * fibonacci(8); -> 0, 1, 1, 2, 3, 5, 8, 13,
     */
    public static void fibonacci(int target) {

        if (target <= 0)
            return;

        int first = 0;
        int second = 1;
        int sum = 0;
        String result = "";

        // 3 -> 0, 1, 1, 2, 3,
        for (int i = sum; sum <= target; i++) {
            result += first + ", ";

            first = first + second;
            second = first - second;
            sum = first + second;
        }

        System.out.println(result + target);
    }

    /*
     * Write me a method which can identifies given number is even or odd
     * identify(5) -> print "Odd"
     * identify(6) -> print "Even"
     */
    public static void identify(int number) {

        if (number == 0)
            return;

        if (number % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }


}

