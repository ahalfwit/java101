package TheThirdOne.Pages;

public class Asas {


    public static void main(String[] args) {

        int x = 5;

        while(isAvailable(x)){
            System.out.print(x-- + " ");

        }
    }
    public static boolean isAvailable(int x) {
        return x-- > 0 ? true : false;
    }
}