package SinanJava;

public class methods {


    public static void main(String[] args) {
//
//        Insan i1;
//        Insan i2;
//
//        i1 = new Insan();
//        i2 = new Insan();
//        i1.isim = "Ali";
//        i1.yas = 23;
//        i2.yas= 27;
//        i2.isim = "Patron";
//
//        System.out.println(" isim : " + i1.isim + " yas : " + i1.yas);
//        System.out.println(" isim : " + i2.isim + " yas : " + i2.yas);
        Insan insan1 = new Insan("Suleyman",29);
        Insan insan2 = new Insan("Nurdan",43);
        insan1.selamla();
        insan2.selamla();
        insan1.biriniSelamla(insan2);
        insan1.biriniSelamla(insan2);
        Bisiklet b1 = new Bisiklet();

        b1.in();
        b1.bin(insan2);
        b1.bin(insan1);
        b1.bin(insan2);
        b1.in();
        b1.bin(insan2);



    }
}
