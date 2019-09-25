package Pages;

public class Animal {


    String type = "Canine";
    int maxSpeed = 60;

    Animal(){

    }
    Animal(String type,int maxSpeed){
        this.type= type;
        this.maxSpeed = maxSpeed;
    }
}
class wildAnimal extends Animal{
    String bounds;
    wildAnimal(String bounds){

    }

    wildAnimal(String type,int maxSpeed, String bounds){

    }

    public static void main(String[] args) {

        wildAnimal wolf = new wildAnimal("Long");
        wildAnimal tiger = new wildAnimal("Feline",80,"Short");

        System.out.println(wolf.bounds+ " : "+ wolf.type + " : "+ wolf.maxSpeed);
        System.out.println(tiger.bounds+ " : "+ tiger.type + " : "+ tiger.maxSpeed);



    }



}