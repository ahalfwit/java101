package TheThirdOne.Technical;

import java.util.HashMap;
import java.util.Map;

public class Collection2 {

    public static void main(String[] args) {
        System.out.println("<><><><><><><><><><><><>");

        int [] my2 = {1,2,3,4,5};
        reverseWeird(my2);

        System.out.println("<><><><><><><><><><><><>");


        System.out.println("------ Counting elements ----");
        int[] countelement = {1, 2, 3, 4, 5};
        System.out.println(sumOfArray(countelement));
        System.out.println("------ Number ----");

        System.out.println(  weird(1234567));


        System.out.println("------ Counting words by word ----");

        String myCounting = "my name is solomon, solomon is my name";
        System.out.println(myCounting);
        System.out.println(countWords(myCounting));
        System.out.println("---------------------------------------------");
        int[] charsInt = {1, 2, 3, 4, 5, 6, 7, 8, 91, 212, 3, 434, 43, 444, 4, 43, 34, 434, 4, 334, 4, 34, 3, 43};
        System.out.println("------second largest element----");
        System.out.println(findSecondLargest(charsInt));
        System.out.println("------largest element----");
        System.out.println(largestNumber1(charsInt));

        bubbleSort(charsInt);
        for (int i = 0; i < charsInt.length; i++) {

            System.out.print(charsInt[i] + " ");

        }
        // System.out.println(largestNumber(charsInt));


        String[] chars = {"TheThirdOne.Technical.A", "TheThirdOne.Technical.A", "B", "C", "TheThirdOne.Technical.A", "C", "TheThirdOne.Technical.A", "1", "1", "1", "2", "2"};

        System.out.println("------duplicate elements----");
        System.out.println(counting(chars));

        System.out.println("Counting Dublicates");
        System.out.println(countDublications(chars));

        System.out.println("Swapping elements a & b ");
        swapElements(10, 20);

        System.out.println("String reverse  without changing location");
        reverseWithoutChangingLocation("I love java.");


        System.out.println("------0----");
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(secondLargest2(arr2) + " This is second max ");
        System.out.println("------1----");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(secondLargest(arr));
        System.out.println("------1.1----");
        merdiven();
        System.out.println("-----2-----");
        fibonacci(10);
        System.out.println(primeNumber(12));
        System.out.println(primeNumber2(11));
        factoriyelSum(5);
        System.out.println(sumOftheNumber33(115));

        System.out.println(sumOfDigit2(121) + " this is the sum of digit");

        String str = "Hello World";
        char[] charArr = str.toCharArray();

        String reversed = "";
        for (int i = charArr.length - 1; i >= 0; i--)
            reversed += charArr[i];
        System.out.println(reversed);

        System.out.println("------------3--------------");

        String[] myChar = str.split("\\s");
        String temp = "";
        for (String each : myChar) {
            StringBuilder sb = new StringBuilder(each);
            sb.reverse();
            temp += sb.toString() + " ";
        }

        System.out.println(temp);

        System.out.println("--------------4------------");
        for (int i = charArr.length - 1; i >= 0; i--)
            System.out.print(charArr[i]);

        System.out.println("--------------5------------");

    }

    public static boolean primeNumber(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean primeNumber2(int n) {

        if (n <= 1) {
            return false;
        }
        for (int idx = 2; idx < Math.sqrt(n); idx++) {
            if (n % idx == 0) {
                return false;
            }
        }
        return true;
    }


    public static void factoriyelSum(int num) {
        int factoriyelSUm = 1;
        for (int idx = 1; idx <= num; idx++) {
            factoriyelSUm *= idx;
        }

        System.out.println(factoriyelSUm);


    }


    public static int sumOfDigit(int number) {

        int sum = 1;

        while (number > 0) {

            sum += number % 10;
            number = number / 10;

        }
        return sum;
    }


    public static int sumOfDigit2(int number2) {
        int sum = 0;
        while (number2 > 0) {
            sum += number2 % 10;
            number2 = number2 / 10;
        }
        return sum;
    }


    public static int sumOftheNumber33(int number2) {
        int sum = 0;
        while (number2 > 0) {
            sum += number2 % 10;
            number2 = number2 / 10;

        }
        return sum;
    }


    public static void fibonacci(int number) {
        int a = 0;
        int b = 1;


        for (int idx = 2; idx < number; idx++) {

            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " this is fibonumber ");
        }
    }


    public static void merdiven() {
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "");
            }
            System.out.println(" ");

        }
    }


    public static int secondLargest(int[] arr1) {

        int largestNumber = arr1[0];
        int secondLargesttNumber = arr1[0];
        for (int idx = 0; idx < arr1.length; idx++) {
            if (arr1[idx] > largestNumber) {
                secondLargesttNumber = largestNumber;
                largestNumber = arr1[idx];
            } else if (arr1[idx] > largestNumber) {
                secondLargesttNumber = arr1[idx];
            }
        }
        return secondLargesttNumber;
    }

    public static int secondLargestNumber2(int[] arr) {

        int maxSecond = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int each : arr) {
            if (each > max) {
                maxSecond = max;
                max = each;

            } else if (each > max) {
                maxSecond = each;
            }
        }
        return maxSecond;

    }

    public static int secondLargest2(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int each : arr) {
            if (each > max) {
                secondMax = max;
                max = each;
            } else if (each > max) {
                secondMax = each;
            }
        }
        return secondMax;
    }


    public static Map<String, Integer> countDublications(String[] arr) {
        Map<String, Integer> myMap = new HashMap<>();

        for (String each : arr) {
            int count = 0;
            if (myMap.get(each) != null)
                count = myMap.get(each);

            myMap.put(each, count + 1);
        }

        return myMap;

    }


    public static int largestNumber(int[] arr) {
        int min = Integer.MIN_VALUE;
        for (int each : arr) {
            if (each > min)
                min = each;
        }
        return min;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];  //swap elements
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int each : arr) {
            if (each > max) {
                secondMax = max;
                max = each;
            } else if (each > max) {
                secondMax = each;
            }
        }
        return secondMax;
    }

    public static int largestNumber1(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int each : arr) {
            if (each > max)
                max = each;
        }
        return max;
    }

    public static Map<String, Integer> counting(String[] arr) {

        Map<String, Integer> myMap2 = new HashMap<>();
        for (String each : arr) {
            int count = 0;
            if (myMap2.get(each) != null) {
                count = myMap2.get(each);

                myMap2.put(each, count + 1);
            }
        }
        return myMap2;
    }


    public static void swapElements(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("This is a :  " + a + " This is b : " + b);
    }

    public static void reverseWithoutChangingLocation(String str) {
        String newWord = "";
        String[] arrMy = str.split("\\s");
        for (String each : arrMy) {
            StringBuilder sb = new StringBuilder(each);
            sb.reverse();
            newWord += sb.toString() + " ";

        }
        System.out.println(newWord);
    }

    public static Map<String, Integer> countWords(String str) {
        String[] arr = str.split(" ");
        Map<String, Integer> myMap = new HashMap<>();
        for (String each : arr) {
            if (myMap.containsKey(each)) {
                myMap.put(each, myMap.get(each) + 1);
            } else {
                myMap.put(each, 1);
            }
        }
        return myMap;
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int weird(int number){
        int remainder = 0;
        int reverse =0;
        do {
            remainder = number % 10;
            reverse  = reverse * 10 + remainder ;
            number = number /10;

        }while (number >0);

        return reverse ;
    }


    public static void reverseWeird(int [] a){

        for(int i = 0; i <a.length-2;i++){

            int temp = a[i];
            int temp2 = a[i+1];
            a[i]=a[i+2];
            a[i+1] = temp;
            a[i+2] =temp2;
        }

        for(int i : a){
            System.out.println(a[i]);
        }

    }


    public static class MapSecondExample {


        public static void main(String[] args) {
            String[] chars = {"TheThirdOne.Technical.A", "TheThirdOne.Technical.A","B","B","B","B","B" ,"C", "TheThirdOne.Technical.A", "C", "TheThirdOne.Technical.A"};
            System.out.println(countDuplicate(chars));
        }
        public static Map<String, Integer> countDuplicate(String[] arr) {
            Map<String, Integer> myMap = new HashMap<>();
            for (String each : arr) {
                int count = 0;
                if (myMap.get(each) != null)
                    count = myMap.get(each);
                myMap.put(each, count + 1);
            }
            return myMap;
        }
    }
}
