package TheThirdOne.Pages;

public class Example2 {


    public static void main(String[] args) {

        String myStr = "Suleyman";
        String reversed = "";
        for (int idx = myStr.length() - 1; idx >= 0; idx--) {
            reversed += myStr.charAt(idx);

        }
        System.out.println(reversed);

        //String myName2 = "Suleymnan";
        System.out.println("----------------------------");
        StringBuilder strSB = new StringBuilder("I am in the interview");
        StringBuilder reverse = strSB.reverse();
        System.out.println("this is string builder version : "+ reverse);
        System.out.println("----------------------------");
        String name = new StringBuilder("My name is Suleyman").reverse().toString();
        System.out.println(name);



    }


}
