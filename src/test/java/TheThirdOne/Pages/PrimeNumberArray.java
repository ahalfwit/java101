package TheThirdOne.Pages;

public class PrimeNumberArray {


    public static void main(String[] args) {
        int a[] = {1111, 12122, 2343, 444, 555, 566566, 7564327, 348, 20049, 121210}; //int n=0 or n=values
        int num = 0;
        String primeNumbers = "";
        for (int i = 0; i <= a.length; i++)  /*change a.length to n*/ {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primeNumbers += i + " ";
            }
        }
        System.out.println("Prime numbers from given array : " + primeNumbers);

    }
}
