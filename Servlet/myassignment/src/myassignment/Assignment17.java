package myassignment;


class Vehicle {
 String color;
 int wheels;
 String model;

 Vehicle(String color, int wheels, String model) {
     this.color = color;
     this.wheels = wheels;
     this.model = model;
 }

 void displayInfo() {
     System.out.println("Vehicle Model: " + model);
     System.out.println("Color: " + color);
     System.out.println("No of wheels: " + wheels);
 }

 void start() {
     System.out.println("Vehicle is starting...");
 }

 void stop() {
     System.out.println("Vehicle is stopping...");
 }
}

//Subclass: Truck
class Truck extends Vehicle {
 Truck(String color, String model) {
     super(color, 6, model); // Trucks usually have 6 wheels
 }

 void loadGoods() {
     System.out.println("Truck is loading goods.");
 }
}

//Subclass: Bus
class Bus extends Vehicle {
 Bus(String color, String model) {
     super(color, 4, model);
 }

 void pickPassengers() {
     System.out.println("Bus is picking up passengers.");
 }
}

class Car extends Vehicle {
 Car(String color, String model) {
     super(color, 4, model);
 }

 void playMusic() {
     System.out.println("Car is playing music.");
 }
}

public class Assignment17 {
 public static void main(String[] args) {
     Truck truck = new Truck("Red", "TATA 407");
     Bus bus = new Bus("Blue", "Volvo B9R");
     Car car = new Car("Black", "Hyundai i20");

     System.out.println("\n--- Truck Details ---");
     truck.displayInfo();
     truck.start();
     truck.loadGoods();
     truck.stop();

     System.out.println("\n--- Bus Details ---");
     bus.displayInfo();
     bus.start();
     bus.pickPassengers();
     bus.stop();

     System.out.println("\n--- Car Details ---");
     car.displayInfo();
     car.start();
     car.playMusic();
     car.stop();
 }
}
/*
--- Truck Details ---
Vehicle Model: TATA 407
Color: Red
No of wheels: 6
Vehicle is starting...
Truck is loading goods.
Vehicle is stopping...

--- Bus Details ---
Vehicle Model: Volvo B9R
Color: Blue
No of wheels: 4
Vehicle is starting...
Bus is picking up passengers.
Vehicle is stopping...

--- Car Details ---
Vehicle Model: Hyundai i20
Color: Black
No of wheels: 4
Vehicle is starting...
Car is playing music.
Vehicle is stopping...

 * 
 */
