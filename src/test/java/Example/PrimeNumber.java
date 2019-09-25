package Example;

public class PrimeNumber {

    public static void main(String[] args) {
        primeNumber(11);
    }
    public static void primeNumber(int n) {
        if (n <= 1) {
            System.out.println(" Not a prime number : " + n);
        }
        for (int idx = 2; idx < Math.sqrt(n); idx++) {
            if (n % idx == 0) {

                System.out.println(" Not a prime number : " + n);
            }
        }
        System.out.println("prime number : " + n);
    }
}
