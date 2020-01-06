package TheThirdOne.Pages;

public class arrayLoop {


    public static void main(String[] args) {

//        int arr[] = {1, 2, 3, 4};
//        int i = 0;
//        do {
//
//            System.out.println(arr[i] + " ");
//
//        } while (i++ < arr.length - 1);

//        System.out.println("-----------------------------");
//        int x = 100;
//        int a = x++;
//        System.out.println("this is a : " + a);
//        int b = ++x;
//        System.out.println("this is b : " + b);
//        int c = x++;
//        System.out.println("this is c : " + c);
//        int d = (a < b) ? 0 : (a < c) ? 101 : 20000;
//        System.out.println(d);

        System.out.println("-----------------------------");


        String[][] chs = new String[4][];
        chs[0] = new String[4];
        chs[1] = new String[4];
        chs[2] = new String[21];
        chs[3] = new String[21];


        int i = 97;
        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {
                chs[a][b] = "" + i;
                i++;
            }
        }

        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }

}

