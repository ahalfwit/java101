package TheThirdOne.Technical;

public class UniqueElement {


    public static void main(String[] args) {

        uniqueCharacters("adaglar");


    }

        public static void uniqueCharacters(String test) {
            String temp = "";
            for (int i = 0; i < test.length(); i++) {
                char ch = test.charAt(i);
                if (temp.indexOf(ch) == -1) {
                    temp = temp + ch;
                } else {
                    temp.replace(String.valueOf(ch),""); // added this to your existing code
                }
            }

            System.out.println(temp + " ");


    }
}
