package TheThirdOne.Technical;

import java.util.Arrays;

public class reverseArray2 {


    public static void main(String[] args) {


        int[] my = {1, 2, 3, 4, 5, 6, 7};
        //7,6,5,4,3,2,1
        int temp = 0;
        for (int idx = 0; idx < (my.length) / 2; idx++) {
            temp = my[idx];
            my[idx] = my[my.length - 1 - idx];
            my[my.length - 1 - idx] = temp;

        }

        //System.out.println(Arrays.toString(my));


        int[] myArr = new int[]{1, 2, 3, 34, 4, 4, 4, 45, 6, 7, 8, 9, 0};
        for (int idx = 0; idx < (myArr.length)/2;idx++){
            int temp2 = 0;

            temp2 =myArr[idx];
            myArr[idx]=myArr[myArr.length-1-idx];
            myArr[myArr.length-1-idx]=temp2;

        }
        System.out.println(Arrays.toString(myArr));

    }


}
