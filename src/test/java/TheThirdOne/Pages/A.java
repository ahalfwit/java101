package TheThirdOne.Pages;

public class A {


    public A() {
        System.out.println("TheThirdOne.Technical.A");

    }
}

class B extends A {

    public B() {
        System.out.println("B");
    }

}

class C extends B {
    public C() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        C c = new C();

    }

    /*


     */







}