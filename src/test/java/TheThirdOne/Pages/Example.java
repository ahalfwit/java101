package TheThirdOne.Pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {


    public static void main(String[] args) {


//        String myName = "Solomon";
//
//        System.out.println(new StringBuilder(myName).reverse().toString());
//        String temp = "";
//        for (int idx = myName.length() - 1; idx >= 0; idx--) {
//            temp += myName.charAt(idx);
//        }
//        System.out.println(temp + " : This is second one");
        // ChararraySolution();
        //IteatorReverse();

        //  System.out.println(isPolindrome("NAZAN"));

//        System.out.println(checkIsPrimeNumber(11));
//        System.out.println(checkIsPrimeNumber(12));
//        System.out.println(checkIsPrimeNumber(13));
//        factorielSum(5);
//        sumOfDigit(12345);
//        Armstrong();
//        Merdiven();
        //swapTwoNumber();

        //LargestNumber();
        // secondLargest();
        //  secondLargest2();
//        int arr[] = {3, 60, 35, 2, 45, 320, 5};
//        bubbleSort(arr);
//        System.out.println("TheThirdOne.Pages.Array After Bubble Sort");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        System.out.println(reverse(1234556));


    }

    public static void ChararraySolution() {
        String myName = "Solomon";
        char[] myChar = myName.toCharArray();
        String tempMy = "";
        for (int idx = myChar.length - 1; idx >= 0; idx--)
            System.out.print(myChar[idx]);

    }

    public static void IteatorReverse() {
        String myName = "SolomonDAGLAR";
        List<Character> myOwnList = new ArrayList<>();

        char[] arr = myName.toCharArray();
        for (char each : arr) {
            myOwnList.add(each);
        }
        Collections.reverse(myOwnList);
        System.out.println(myOwnList);
    }


    public static boolean isPolindrome(String str) {

        return new StringBuilder(str).reverse().toString().equals(str);
    }


    public static boolean checkIsPrimeNumber(int num) {

        if (num == 1) {
            return false;
        }
        for (int idx = 2; idx < num; idx++) {
            if (num % idx == 0)
                return false;
        }
        return true;
    }


    public static void factorielSum(int num) {
        int sumOfNum = 1;

        for (int idx = 1; idx < num; idx++) {
            sumOfNum *= idx;
        }

        System.out.println(sumOfNum);
    }


    public static void sumOfDigit(int number) {

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }

    public static void Armstrong() {

        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "");
            }
            System.out.println();
        }
    }


    public static void Merdiven() {

        for (int idx = 0; idx <= 20; idx++) {
            for (int a = 1; a <= idx; a++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

    public static void swapTwoNumber() {

        int x = 10, y = 20;
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println(" This is x : " + x + " This is y : " + y);
    }


    public static void LargestNumber() {
        int[] arr = {1, 2, 3, 4, 5, 121, 6, 7, 8, 9};

        int max = Integer.MIN_VALUE;

        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] > max)
                max = arr[idx];
        }
        System.out.println(max);
    }


    public static void secondLargest() {
        int[] arr = {1, 2, 3, 4, 5, 121, 6, 7, 8, 9};
        int largest = arr[0];
        int secondlargest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondlargest) {
                secondlargest = arr[i];
            }
        }
        System.out.println("\nTheSecondOne largest number is:" + secondlargest);

    }

    public static void secondLargest2() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] > largest) {
                secondLargest = largest;
                largest = arr[idx];

            } else if (arr[idx] > largest)
                secondLargest = arr[idx];
        }


        System.out.println(secondLargest);

    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int idx = 0; idx < n; idx++) {
            for (int k = 1; k < (n - idx); k++) {
                if (arr[k - 1] > arr[k]) {
                    temp = arr[k - 1];  //swap elements
                    arr[k - 1] = arr[k];
                    arr[k] = temp;
                }
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int remainder = 0;
        do {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        } while (number > 0);

        return reverse;
    }


}




