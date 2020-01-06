package TheThirdOne.Technical;

public class uniqueElementCount {


    public static void main(String[] args) {


        for (int idx = 1; idx <= 1000; idx++) {
            if (idx % 3 == 0 && idx % 7 == 0) {
                System.out.print(idx + " - ");

            }
        }


    }
}
