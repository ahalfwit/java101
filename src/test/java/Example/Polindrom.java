package Example;

public class Polindrom {

    public static void main(String[] args) {

        String reversedString = "";
        String str = "solomon";

        for (int idx = str.length() - 1; idx >= 0; idx--) {
            reversedString += str.charAt(idx);
        }
        System.out.println(reversedString);


        if (reversedString.equals(str)) {
            System.out.println("This is palindrome " + reversedString);
        } else {
            System.out.println("This is not  palindrome " + reversedString);
        }

    }


}
