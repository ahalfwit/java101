package TheThirdOne.Technical;

import java.util.HashMap;
import java.util.Map;

public class EachWordReverse {

    public static void main(String[] args) {

        String input = "The sky is blue";
        System.out.println(reverseWord(input));
    }

    public static String reverseWord(String input) {

        String reserve = "";
        String[] myArray = input.split("\\s");
        for (String sw : myArray) {
            StringBuilder sb = new StringBuilder(sw);
            sb.reverse();
            reserve += sb.toString() + " ";
        }


        return reserve.trim();
    }


    public static class MapOfExample {

        public static void main(String[] args) {

            String[] chars = {"TheThirdOne.Technical.A", "TheThirdOne.Technical.A","B", "C", "TheThirdOne.Technical.A", "C", "TheThirdOne.Technical.A"};

            System.out.println(count(chars));

            System.out.println(count(chars));
    //        Map<String, Integer> freq = new HashMap<>();
    //
    //        for (String s : chars) {
    //            int prev = 0;
    //            // get previous count
    //            if (freq.get(s) != null)
    //                prev = freq.get(s);
    //
    //            freq.put(s, prev + 1);
    //        }
    //
    //        // System.out.println(freq);
        }


        public static Map<String, Integer> count(String[] arr) {

            Map<String, Integer> countNumber = new HashMap<>();
            for (String s : arr) {
                int count = 0;
                if (countNumber.get(s) != null)
                    count = countNumber.get(s);
                countNumber.put(s, count + 1);
            }
            return countNumber;
        }
    }

    public static class Test {

        public static void main(String[] args) {

            int[] arr = {5, 6, 76, 31, 43, 1};
            //System.out.println(largest(arr));
            // System.out.println(largest2(arr));
            // System.out.println(reverse(1234));
            System.out.println(withoutMod(10, 4));

            System.out.println(perfectTriangle(3,4,5));
            // System.out.println(reversed(1234567));
        }

        public static int largest(int[] arr) {
            int temp;
            for (int idx = 0; idx < arr.length; idx++) {
                for (int x = idx + 1; x < arr.length; x++) {
                    if (arr[idx] > arr[x]) {
                        temp = arr[idx];
                        arr[idx] = arr[x];
                        arr[x] = temp;
                    }
                }
            }
            return arr[arr.length - 1];
        }


        public static int largest2(int[] arr) {

            int max = Integer.MIN_VALUE;

            for (int each : arr) {

                if (each > max) {

                    max = each;

                }

            }

            return max;
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

        public static int reversed(int number) {

            int reversed = 0;
            int remainder = 0;
            do {
                remainder = number % 10;
                reversed = reversed * 10 + remainder;
                number = number / 10;

            } while (number > 0);
            return reversed;
        }


        public static int withoutMod(int a, int b) {

            return (a - b * (a / b));
        }


        public static boolean perfectTriangle(int a, int b, int c) {
            if (a * a + b * b == c * c)
                return true;
            else
                return false;

        }


    }
}
