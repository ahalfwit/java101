package TheThirdOne.Pages;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringOccurHowManyTimes {

    public static void main(String[] args) {

        hashSet();
       // Frequincies("AAAAASSSSDDDQQQWWEEEE");

    }


    public static void Frequincies(String str) {


        String str2 = "", str3 = "";
        for (int i = 0; i < str.length(); i++)
            if (!str2.contains("" + str.charAt(i)))
                str2 += str.charAt(i);

        for (int z = 0; z < str2.length(); z++) {
            int num = 0;
            for (int i = 0; i < str.length(); i++)
                if (str.substring(i, i + 1).equals(str2.substring(z, z + 1)))
                    num++;

            str3 += "" + str2.substring(z, z + 1) + num;
        }
        System.out.println(str3);

    }

    public  static void hashSet() {

        String a[] = {"1111", "1111", "1111", "1111", "1111", "1111", "1111", "1121"};

        Set<String> unique = new HashSet<String>(Arrays.asList(a));
        System.out.println(unique);
    }


}



