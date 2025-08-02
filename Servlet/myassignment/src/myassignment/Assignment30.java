package myassignment;
import java.util.Scanner;
//ass 30, Minimum.java
public class Assignment30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float x = scanner.nextFloat();

        System.out.print("Enter second number: ");
        float y = scanner.nextFloat();

        System.out.print("Enter third number: ");
        float z = scanner.nextFloat();

        Minimum minRef = (a, b, c) -> Math.min(Math.min(a, b), c);

        float result = minRef.minimum3(x, y, z);

        System.out.println("The smallest number is: " + result);

        scanner.close();
    }
}
/*
 * Enter first number: 2
Enter second number: 3
Enter third number: 4
The smallest number is: 2.0
*/
