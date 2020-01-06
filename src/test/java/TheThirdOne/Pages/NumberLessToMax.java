package TheThirdOne.Pages;

public class NumberLessToMax {


    public static void main(String[] args) {

        int idx;
        int maxOfBoundary = 100;
        boolean isPrime = true;
        String primeNumberFound = "";

        for (idx = 1; idx <= maxOfBoundary; idx++) {
            isPrime = isPrimeCheck(idx);
            if (isPrime) {
                primeNumberFound += idx + " ";
            }

        }
        System.out.println("Prime numbers from 1 to " + maxOfBoundary + " are: \n" + primeNumberFound);

    }

    public static boolean isPrimeCheck(int num) {

        int remainder = 0;
        for (int k = 2; k < num; k++) {
            remainder = num % k;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }

}

