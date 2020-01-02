package TheThirdOne.Pages;

public class ArrayUniqueInteger {

    public static void main(String[] args) {

        int[] unique = {1, 2, 2, 2, 2, 2, 4, 4, 4, 4, 5, 5, 5, 56, 6, 6};

        for (int idx = 0; idx < unique.length-1; idx++) {

            for (int k = idx + 1; k < unique.length; k++) {

                if ((unique[idx] == unique[k]) && (idx != k)) {
                    System.out.println("This is  dublicate : " + unique[idx]);
                }

            }


        }
    }


}
