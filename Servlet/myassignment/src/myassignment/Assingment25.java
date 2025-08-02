package myassignment;
import java.util.Scanner;
//ass 25
public class Assingment25 {

    // Method to calculate perimeter
    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    // Method to calculate area using Heron's formula
    public static double area(double a, double b, double c) {
        double s = perimeter(a, b, c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Method to validate if triangle sides are valid
    public static boolean isValid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Get input
            System.out.print("Enter side a (-1 to exit): ");
            double a = scanner.nextDouble();

            if (a == -1) {
                System.out.println("Bye~");
                break;
            }

            System.out.print("Enter side b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter side c: ");
            double c = scanner.nextDouble();

            // Validate
            if (isValid(a, b, c)) {
                double peri = perimeter(a, b, c);
                double ar = area(a, b, c);

                System.out.println("Perimeter: " + peri);
                System.out.println("Area: " + ar);
            } else {
                System.out.println("The input is invalid.");
            }

            System.out.println(); // extra line for clarity
        }

        scanner.close();
    }
}

/*
Enter side a (-1 to exit): 3
Enter side b: 3
Enter side c: 3
Perimeter: 9.0
Area: 3.897114317029974

Enter side a (-1 to exit): -1
Bye~
*/