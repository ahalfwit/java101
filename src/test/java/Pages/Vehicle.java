package Pages;

public class Vehicle {


    String type = "4w";
    int maxSpeed = 100;


    Vehicle(String type,int maxSpeed){
        this.type = type;
        this.maxSpeed= maxSpeed;

    }

    Vehicle(){
      //  super();
    }
}

class Car extends Vehicle{

    String trans;



    Car(String trans){
      //  this();
       // super("a",3);
        this.trans= trans;
    }

    Car(String trans,  int maxSpeed,String type){
        super(type, maxSpeed);
        this.trans= trans;
    }

}