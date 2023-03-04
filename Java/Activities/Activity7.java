package activities;


 interface BicycleParts{
    public int gears = 0;
    public int speed = 0;
}

interface BicycleOpeartions{
     public void applyBrake(int decrement);
     public void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOpeartions{
     public int gears;
     public int speed;
     public Bicycle(int gears, int speed){
         this.gears=gears;
         this.speed=speed;
     }

    @Override
    public void applyBrake(int decrement) {
        speed-= decrement;
        System.out.println("Current speed is " + speed);
    }

    @Override
    public void speedUp(int increment) {
        speed+= increment;
        System.out.println("Current speed is" + speed);
    }

    public String bicycleDesc(){
         return ("No of gears "+ gears +"and"+ "current speed is" + speed);
    }
}

class MountainBike extends Bicycle{
   public int seatHeight;
    public MountainBike(int gears, int speed, int startHeight) {
        super(gears, speed);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }

}
public class Activity7 {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(30);
        mb.applyBrake(10);
    }
}
