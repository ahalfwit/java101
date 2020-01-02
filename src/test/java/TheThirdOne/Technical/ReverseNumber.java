package TheThirdOne.Technical;

import java.util.Arrays;

public class ReverseNumber {

    public static void main(String[] args) {



        int[] num1 = new int[]{1, 2, 3, 4, 5, 6};

        for (int i = 0; i < (num1.length) / 2; i++) {
            int temp = 0;
            temp = num1[i];
            num1[i] = num1[num1.length - 1 - i];
            num1[num1.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(num1));

    }
}
