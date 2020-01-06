package TheThirdOne.Pages;

import java.util.Arrays;

public class CheckEquality {


    public static void main(String[] args) {

        System.out.println( checkSame("asad", "bessad"));

    }


    public static boolean checkSame(String a, String b) {

        char[] my1 = a.toCharArray();
        char[] my2 = b.toCharArray();

        Arrays.sort(my1);
        Arrays.sort(my2);

        String temp1 = "", temp2 = "";

        for (char each : my1) {
            temp1 += each;
        }

        for (char each : my2) {
            temp2 += each;
        }


        if (temp1.equals(temp2))
            return true;


        return false;
    }
}
