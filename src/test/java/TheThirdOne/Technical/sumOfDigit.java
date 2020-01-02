package TheThirdOne.Technical;

public class sumOfDigit {


    public static void main(String[] args) {

//        sum(12345);
//        factoriyel(5);
        //fibo();

        merdiven();
    }
    public static void sum(int number) {

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }

    public static void factoriyel(int target) {

        int factTotal = 1;

        for (int idx = 1; idx <= target; idx++) {

            factTotal *= idx;

        }

        System.out.println(factTotal);

    }


    public static void fibo() {

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


    public static void merdiven() {

        for (int x = 0; x <= 5; x++) {
            for (int y = 0; y <= x; y++) {
                System.out.print(y + "");
            }
            System.out.println();
        }

    }


}
