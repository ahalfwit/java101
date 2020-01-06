package javaCoding;

import java.util.Arrays;

public class SortingBUbleSort {

    public static void main(String[] args) {
        int[] my = {1, 2, 1, 2, 3, 4, 3, 4, 5, 6, 7, 89, 7};
        bubleSortAndThenCount(my);
    }


    public static void bubleSortAndThenCount(int[] arr) {

        // this can also be done Arrays.sort();
        int temp = 0;
        for (int idk = 0; idk < arr.length; idk++) {
            for (int klm = 1; klm < (arr.length - idk); klm++) {
                if (arr[klm - 1] > arr[klm]) {
                    temp = arr[klm - 1];
                    arr[klm - 1] = arr[klm];
                    arr[klm] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int ndublicateElement = 0, dublicateCount = 0, previousElement = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == previousElement) {
                ++ndublicateElement;
                if (ndublicateElement == 1) {
                    ++dublicateCount;
                    if (dublicateCount == 1) {
                        System.out.print(arr[i]);
                    } else {
                        System.out.print(", " + arr[i]);
                    }
                }
            } else {
                previousElement = arr[i];
                ndublicateElement = 0;
            }
        }

        System.out.println("\nNumber of duplicates values: " + dublicateCount);

    }
}