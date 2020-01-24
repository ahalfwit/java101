package SinanJava;

public class Bisiklet {

    Insan binmisInsan;

    public Bisiklet(){
        binmisInsan = null;
    }
    public Bisiklet(Insan gelenInsan){
        binmisInsan = gelenInsan;
    }
    public void bin(Insan gelenInsan){
        if(binmisInsan == null) {
            binmisInsan = gelenInsan;
            System.out.println(binmisInsan.getIsim() + " basariyla bindi ");
        }else{
            System.out.println("Zaten bisiklet dolu !");
        }
    }
    public void in() {
        if (binmisInsan == null) {
            System.out.println(" Zaten bisiklet bos ! ");
        } else {
            String isim = binmisInsan.getIsim();
            binmisInsan = null;
            System.out.println(isim + " indi ");
        }
    }
}
