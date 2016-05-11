package Vehicle;

/**
 * Created by calm on 5/4/16.
 */
public class Vehicle {

    private int maxSpeed;   //max speed of vehicle
    private int wheels;     // number of wheels
    private String color;  // color
    private double fuelCapacity;    // size of fuel capacitor



    //Getters
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getWheels() {
        return wheels;
    }
    public String getColor() {
        return color;
    }
    public double getFuelCapacity() {
        return fuelCapacity;
    }


    //Setters
    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }




    public void horn() {
        System.out.println("Beep");
    }
}


