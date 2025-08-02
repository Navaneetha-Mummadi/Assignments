package assignment20;

public class VehicleTest {
    public static void main(String[] args) {
        Vechicle myCar = new Car();
        Vechicle myMotorcycle = new Motorcycle();

        myCar.startEngine();
        myCar.stopEngine();

        myMotorcycle.startEngine();
        myMotorcycle.stopEngine();
    }
}
/*
Car engine started.
Car engine stopped.
Motorcycle engine started.
Motorcycle engine stopped.
*/