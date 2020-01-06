package TheThirdOne.Pages;

public class sumOfDigit {


    public static void main(String[] args) {



        /*
        Sum number of digits
         */
        int number = 1346123;
        int sum = 0;

        while (number > 0) {

            sum += number % 10;
            number = number / 10;
        }
        System.out.println(sum);

    /*
    Fibonacci
     */
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <= 10; i++) {
            int c = a + b;
            a = b;
            b = c;

            System.out.print(c + " ");
        }
    }
}

