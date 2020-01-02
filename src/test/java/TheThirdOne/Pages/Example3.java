package TheThirdOne.Pages;

public class Example3 {

    public static void main(String[] args) {


        String[] strs = new String[2];
        int idx = 0;
        for(int i = 0; i<strs.length;i++){
            strs[idx] = strs[idx].concat("element " + idx);
            idx++;
        }
        System.out.println(strs[idx]);


    }


}
