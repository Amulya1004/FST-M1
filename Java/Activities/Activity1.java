package activities;

public class Activity1 {
    public static void main(String[] args){
        Car SUV = new Car();

        SUV.make=2014;
        SUV.color= "black";
        SUV.transmission ="Manual";

        SUV.displayCharacteristics();
        SUV.accelerate();
        SUV.brake();

    }
}
