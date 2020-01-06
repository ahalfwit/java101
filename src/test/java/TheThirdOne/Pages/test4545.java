package TheThirdOne.Pages;

public class test4545 {

    public static void main(String[] args) {

        int idx = 0;
        String[] my = new String[7];
        my[0] = "solomon";
        my[1] = "Nurdan";
        for (String s : my) {
            my[idx++]= "annem";
            System.out.println(s+" - ");
            System.out.println(my[idx]);
            idx++;
        }
    }
}
