//package TheThirdOne.Technical;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Example {
//
//
//    public static void main(String[] args) {
//
//
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        try{
//            List <WebElement> mylinks	= driver.findElements(By.linkText("abc"));
//            for( int idx = 0 ; idx<mylinks.size(); idx++){
//                if(!(mylinks.get(idx).isDisplayed() )){
//                    mylinks.get(idx).click();
//                }
//            }
//
//
//        }catch(Exception e){
//            System.out.print("a");
//        }
//        secondPrint(3,3);
//        int x = 5;
//
//        if (x < 5) {
//            x--;
//        }
//        if (x >= 5) {
//            x++;
//        }
//        System.out.println(x);
//        String y = "Twenty Two";
//        System.out.println(y + 1);
//        String str = "Hello";
//        for (int idx = 0; idx < str.length(); idx++) {
//            System.out.println(str.charAt(idx) + "\n");
//        }
//    }
//
//
//    public static void print(int x, int y) {
//
//        x = x + 1;
//        y = y + 1;
//        System.out.println("this is " + x + " this is "+ y);
//
//    }
//
//    public static void secondPrint(int a, int b) {
//        a = 5;
//        b = 5;
//        print(a, b);
//    }
//
//    public static class Preserve {
//
//
//        static void reverseEachWordOfString(String inputString) {
//            String[] words = inputString.split(" ");
//            String reverseString = "";
//
//            for (int i = 0; i < words.length; i++) {
//                String word = words[i];
//
//                String reverseWord = "";
//
//                for (int j = word.length() - 1; j >= 0; j--) {
//                    reverseWord = reverseWord + word.charAt(j);
//                }
//
//                reverseString = reverseString + reverseWord + " ";
//            }
//
//            System.out.println(inputString);
//
//            System.out.println(reverseString);
//
//            System.out.println("-------------------------");
//        }
//
//
//        public static void main(String[] args) {
//
//            reverseEachWordOfString("Suleyman  & Nurdan");
//
//        }
//
//
//      public static int weird(int number){
//            int remainder = 0;
//          int reverse =0;
//          do {
//              remainder = number % 10;
//              reverse  = reverse * 10 + remainder ;
//              number = number /10;
//
//          }while (number >0);
//
//          return reverse ;
//      }
//    }
//
//    public static class removeDublicate {
//
//
//        public static void main(String[] args) {
//
//            List<Integer> as = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 8, 9, 10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 12, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 22, 2, 2));
//            List<Integer> myList = new ArrayList<>(Arrays.asList(1, 1, 56, 1, 1, 1, 1, 1, 1, 1, 1, 1, 12, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 22, 2, 2));
//
//            // System.out.println( remove(myList));
//            // System.out.println(remove(as));
//
//            List<Integer> mysecond = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//
//    //        System.out.println(removeDublicate2(mysecond));
//    //        System.out.println(removeDublicate2(mysecond));
//
//    //        divideBy(10, 3);
//    //        divisionveersion2(1234567801, 321);
//    //        withoutDivision123(321, 321);
//            /// div1212div(12, 3);
//           // firstDivide(23, 12);
//            firstDivide(10, 2);
//
//
//        }
//
//        public static List<Integer> remove(List<Integer> list) {
//
//            List<Integer> second = new ArrayList<>();
//            for (int i = 0; i < list.size(); i++)
//                if (!second.contains(list.get(i)))
//                    second.add(list.get(i));
//
//
//            return second;
//
//        }
//
//        public static List<Integer> removeDublicate2(List<Integer> list) {
//            List<Integer> my = new ArrayList<>();
//
//            for (int idx = 0; idx < list.size(); idx++)
//                if (!my.contains(list.get(idx)))
//                    my.add(list.get(idx));
//
//            return my;
//        }
//
//
//        /*
//        Write a method that method doesn't include mod operator
//         */
//
//        public static int withoutDivision(int num, int num2) {
//            return (num - num2 * (num / num2));
//        }
//
//        public static int withoutDivision2(int num, int num2) {
//            return (num - num * (num * num2));
//        }
//
//
//        public static void devide(int num1, int num2) {
//
//            if (num2 == 0) {
//                System.out.println("invalid number");
//                return;
//            }
//            int count = 0;
//            while (num1 >= num2) {
//                num1 -= num2;
//                count++;
//            }
//            System.out.println(count + " " + num1);
//        }
//
//
//        public static void divideBy(int a, int b) {
//
//            if (b == 0) {
//                System.out.println("THis is not a valid operation");
//            }
//
//
//            int count = 0;
//            while (a >= b) {
//                a -= b;
//                count++;
//            }
//            System.out.println(count + "   this is the result --> " + a);
//
//        }
//
//        public static void divisionveersion2(int a, int b) {
//
//            if (b == 0) {
//                System.out.println("this is not valid entry");
//                return;
//            }
//
//            int count = 0;
//            while (a >= b) {
//                a -= b;
//                count++;
//
//            }
//            System.out.println(count + " this is result --> " + a);
//        }
//
//        public static void withoutDivision123(int a, int b) {
//            if (b == 0) {
//                System.out.println("This is not a valid entry: " + b);
//                return;
//            }
//            int count = 0;
//            while (a >= b) {
//                a -= b;
//                count++;
//            }
//            System.out.println(count + " " + a);
//        }
//
//
//        public static void div1212div(int a, int b) {
//
//            if (b == 0) {
//                System.out.println("This is not a result --> " + a);
//                return;
//            }
//            int count = 0;
//            while (a >= b) {
//                a -= b;
//                count++;
//            }
//
//            System.out.println(count + " This is the expected result " + a);
//        }
//
//        public static void firstDivide(int a, int b) {
//
//            if (b == 0) {
//                System.out.println("This is not a valid entry  : " + b);
//                return;
//            }
//
//            int count = 0;
//            while (a >= b) {
//                a -= b;
//                count++;
//            }
//            System.out.println(a + " a : " + " count is : " + count);
//        }
//    }
//
//    public static class Reverse {
//
//        public static void main(String[] args) {
//
//            int[] a = {1, 2, 3, 4, 5};
//            //           3 4 5 1 2
//
//            for (int i = 0; i < a.length - 2; i++) {
//                int temp = a[i];
//                int temp2 = a[i + 1];
//                a[i] = a[i + 2];
//                a[i + 1] = temp;
//                a[i + 2] = temp2;
//            }
//
//            for (int i : a) {
//                System.out.print(i + " ");
//            }
//
//            System.out.println("\n");
//
//            int[] array = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
//            int temp;
//            for (int idx = 1; idx < array.length; idx++) {
//                for (int k = idx; k > 0; k--) {
//                    if (array[k] < array[k - 1]) {
//                        temp = array[k];
//                        array[k] = array[k - 1];
//                        array[k - 1] = temp;
//                    }
//                }
//            }
//            for (int i = 0; i < array.length; i++) {
//                System.out.print(array[i] + " ");
//            }
//        }
//    }
//}
