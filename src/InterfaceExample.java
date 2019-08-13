import java.io.*;

public class InterfaceExample {
    public static void main(String[] args){
        // create an instance of Bicycle
        Bicycle bicycle = new Bicycle();

        // perform some operations
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBreak(1);

        System.out.println("Bicycle present state :");
        bicycle.printStates();

    }
}

interface Vehicle{
    // declare methods, they are all abstract methods
    void changeGear(int a);
    void speedUp(int a);
    void applyBreak(int a);
}

class Bicycle implements Vehicle{
    int speed;
    int gear;

    // to change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    @Override
    public void applyBreak(int decrement){
        speed = speed - decrement;
    }

    public void printStates(){
        System.out.println("speed: " + speed + " gear: " + gear);
    }
}

/*
class Bike implements Vehicle {

    int speed;
    int gear;

    // to change gear
    @Override
    public void changeGear(int newGear){

        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment){

        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement){

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }

}

 */

