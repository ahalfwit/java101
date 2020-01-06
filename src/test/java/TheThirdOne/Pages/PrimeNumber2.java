package TheThirdOne.Pages;

public class PrimeNumber2 {

    public static void main(String[] args) {

        isPrime(11);
    }

    public static void isPrime(int n) {

        if (n <= 1) {
            System.out.println("not a prime : " + n);
        }
        for (int idx = 2; idx < Math.sqrt(n); idx++) {
            if (n % idx == 0) {
                System.out.println("Not a prime number : " + n);
            }
        }

        System.out.println("prime number : " + n);

    }


}
