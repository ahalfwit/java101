package TheThirdOne.Pages;

public class NumberofPrime {


    public static void main(String[] args) {

        int idx;
        int maxOfBoundry = 100;
        boolean isPrime = true;
        String primeNumberFound = "";
        for (idx = 1; idx < maxOfBoundry; idx++) {
            isPrime = isPrimeCheck(idx);
            if (isPrime) {
                primeNumberFound += idx + "-";

            }
        }

        System.out.println("Number of Prime Number found : " + primeNumberFound);
    }
    public static boolean isPrimeCheck(int numberToCheck) {

        int remainder = 0;
        for (int idx = 2; idx < numberToCheck; idx++) {
            remainder = numberToCheck % idx;

            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}
