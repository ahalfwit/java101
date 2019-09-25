package Pages;

public class Test1 {


    public static int stVar = 100;
    public int var = 200;

    @Override
    public String toString() {
        return var + " : " + stVar;
    }

    public static void main(String[] args) {

        Test1 t1 = new Test1();
        t1.var = 300;
        System.out.println("This is t1 : "+t1 );

        Test1 t2 = new Test1();
        t2.stVar = 300;
        System.out.println( "This is t2 :  "+t2);

    }
}
