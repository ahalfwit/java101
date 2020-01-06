package TheThirdOne.Pages;

public class Array {


    public static void main(String[] args) {

        System.out.println(test());
    }


    public static int test() {

        int[] myInteger = {1, 2, 3, 4, 4, 4, 4, 4, 33, 3, 3, 3, 3, 2, 2, 2, 2, 11, 1, 1, 1, 1,};

        int temp;
        for (int i = 0; i < myInteger.length; i++) {
            for (int j = i + 1; j < myInteger.length; j++) {
                if (myInteger[i] > myInteger[j]) {
                    temp = myInteger[i];
                    myInteger[i] = myInteger[j];
                    myInteger[j] = temp;
                }
            }
        }
        return myInteger[myInteger.length - 1];
    }


}

