package Vehicle;

/**
 * This is simpe example of getters end setters used in main method
 *
 * Created by calm on 5/4/16.
 */
public class VehicleMain {
    public static void main (String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();

        v1.setColor("Red");
        v2.horn();

        v1.setMaxSpeed(660);
        v2.setWheels(4);

        v1.setFuelCapacity(150);

        System.out.println("First vehicle have "+ v1.getColour() + " colour.");


        System.out.println("First vehicle speed equal "+ v1.getMaxSpeed() + " km/h.");
    }
}
