package TheThirdOne.Pages;

public class StringUniqueElement {


    public static void main(String[] args) {

        notUniquCount("DDAGGLLARR");

    }


    public static char[] notUniquCount(String my) {


        char[] str = my.toCharArray();

        for (int idx = 0; idx < str.length; idx++) {
            for (int j = idx + 1; j < str.length; j++) {
                if (str[idx] == str[j] && (idx != j)) {
                    System.out.println("Duplicate element : " + str[idx]);
                }
            }

        }


        return str;


    }


}
