
package Assingment23;
import Assingment23.Hall;
import Assingment23.Kitchen;
// ass 23
public class Main {
    public static void main(String[] args) {
        Hall hall = new Hall();
        hall.enterMessage();

        System.out.println(); // spacing

        Kitchen kitchen = new Kitchen();
        kitchen.showAppliances();
    }
}
/*
This is the first room while entering the house

Kitchen Appliances:
Fridge
Microwave
Stove
Toaster

Copied Appliances:
Fridge
Microwave
Stove
Toaster
*/