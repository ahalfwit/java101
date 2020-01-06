package TheThirdOne.Pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElement {


    public static void main(String[] args) {
        System.out.println(    CheckEquality("AAAAA1q1q1q","asdfgh"));

        List<Integer> checkDublicate = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4));

        // System.out.println(removeDublicate(checkDublicate));
        // System.out.println(RemoveElement(checkDublicate));
        // devides(10, 2);
        DivisionByMinus(10, 2);
        DivisionByMinus(1, 2);
        DivisionByMinus(17, 2);
        DivisionByMinus(17, 13);
    }


    public static List<Integer> removeDublicate(List<Integer> list) {

        List<Integer> my = new ArrayList<>();

        for (int idx = 0; idx < list.size(); idx++) {
            if (!my.contains(list.get(idx))) {
                my.add(list.get(idx));
            }
        }


        return my;
    }


    public static List<Integer> RemoveElement(List<Integer> all) {

        List<Integer> listSecond = new ArrayList<>();
        for (int idx = 0; idx < all.size(); idx++) {
            if (!listSecond.contains(all.get(idx))) {
                listSecond.add(all.get(idx));
            }
        }

        return listSecond;
    }


    public static void devides(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Invalid Number");
            return;
        }

        System.out.print(num1 + " devid by " + num2 + " is: ");
        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count + " and remainder is " + num1);

    }

    public static void DivisionByMinus(int num1, int num2) {

        if (num2 == 0) {
            System.out.println("invalid entry");
            return;
        }


        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;

        }

        System.out.println(" number is divided by " + " " + num2 + " result :   " + count);


    }

    /*
	 3. Write a method that check if a string is build out of the same letters
	 as another string.
	 same("abc","cab"); -> true same("abc","abb"); -> false:
	*/


    public static boolean CheckEquality(String str1, String str2) {

        char[] myChar1 = str1.toCharArray();
        char[] myChar2 = str2.toCharArray();

        Arrays.sort(myChar1);
        Arrays.sort(myChar2);

        String a = "";
        for (char each : myChar1) {
            a += each;
        }

        String b = "";
        for (char each : myChar1) {
            b += each;
        }
        if (a.equals(b))
            return true;

        return false;
    }
}
