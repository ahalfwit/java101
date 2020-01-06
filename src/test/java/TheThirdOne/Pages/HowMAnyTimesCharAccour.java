package TheThirdOne.Pages;

public class HowMAnyTimesCharAccour {


    public static void main(String[] args) {


        String my = "Slmooooooooooooooooon";
        char[] charMy = my.toCharArray();
        char occur1 = 'o';
        int count = 0;

        for (int idx = 0; idx < charMy.length; idx++) {
            if (charMy[idx] == occur1) {
                count++;
            }

        }
        System.out.println(count);

    }
}
