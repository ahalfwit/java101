package TheThirdOne.Technical;

public class UniqueElementRemove {


    public static void main(String[] args) {

        System.out.println(removeDublicate("SOLOMONOV"));

        String my = "Daglar";

        String temp = "";
        for (int idx = 0; idx < my.length(); idx++) {
            char c = my.charAt(idx);
            if (temp.indexOf(c) == -1) {
                temp = temp + c;
            } else {
                temp.replace(String.valueOf(c), "");
            }
        }
        System.out.println(temp + " ");
    }


    public static String removeDublicate(String str) {

        String temp = "";
        for (int idx = 0; idx < str.length(); idx++) {
            char c = str.charAt(idx);
            if (temp.indexOf(c) == -1) {
                temp += c;
            } else {
                temp.replace(String.valueOf(c), "");
            }
        }
        return temp;
    }

}
