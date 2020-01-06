package TheThirdOne.Technical;

public class A {

    public void test() {
        System.out.println("TheThirdOne.Technical.A");
    }
}

class B extends A {
    public void test() {
        System.out.println("TheThirdOne.Technical.B");
    }
}

class C extends A {
    public void test() {
        System.out.println("TheThirdOne.Technical.C");
    }

    public static void main(String[] args) {

        A b1 = new A();
        A b2 = new C();

        b1 = (A) b2;

        A b3 = (B) b2;
       // TheThirdOne.Technical.A b3 = b2;

        b1.test();
        b3.test();

        System.out.println();




    }
}
