package activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    Car(){
        tyres=4;
        doors=4;
    }

    public void displayCharacteristics(){
        System.out.println("Color of car is:" + color );
        System.out.println("Transmission of car is:" + transmission );
        System.out.println("Make of car is:" + make );
        System.out.println("Tyres of car are:" + tyres );
        System.out.println("Doors of car are:" + doors );
    }

    public void accelerate(){
        System.out.println("Car is moving forward");
    }

    public void brake(){
        System.out.println("Car has stopped");
    }
}
