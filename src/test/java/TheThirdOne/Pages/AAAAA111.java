package TheThirdOne.Pages;

public class AAAAA111 {


    public static void main(String[] args) {

        int a = 5;
        for (int i = 1; i < 3; i++) {

            for (int j = 1; j < 3; j++) {
                if (a == 5) {
                    break;
                }
                System.out.println("this is i : " + i);
                System.out.println("this is j : " + j);
                System.out.println(i * j);
            }
        }
    }
}
