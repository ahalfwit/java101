package SinanJava;

public class Insan {
    private int yas;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    private String isim;



    public Insan() {
        this.isim = "Sinan";
        this.yas = 20;
    }

    public Insan(String alinanIsim,int alinanYas) {

        setYas(alinanYas);
        setIsim(alinanIsim);
    }


    public void selamla(){
        System.out.println("Merhaba,benim adim " + isim + " ve yasim "+ yas);
    }

    public void biriniSelamla(Insan gelenInsan ){
        System.out.println("Merhaba, " + gelenInsan.getIsim() +" benim adim " + isim + " ve yasim "+ yas);
    }

    public Insan(int alinanYas, String alinanIsim) {
        this.yas = alinanYas;
        this.isim = alinanIsim;
    }



}
