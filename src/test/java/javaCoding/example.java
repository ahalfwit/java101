package javaCoding;

import java.sql.SQLOutput;
import java.util.Scanner;

public class example {


    public static void main(String[] args){

        hesapla();
    }
    public static void hesapla(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number, please ");
        int num1 =scan.nextInt();
        System.out.println("Enter a number, please ");
        int  num2 = scan.nextInt();
        int  y =  num1*num2;
        System.out.println("your resul is : " + y);

    }

}
