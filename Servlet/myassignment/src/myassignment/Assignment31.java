package myassignment;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // InputMismatchException demo
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();  // May throw InputMismatchException
            System.out.println("You entered: " + number);

            scanner.nextLine(); // Clear buffer

            // StringIndexOutOfBoundsException demo
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            System.out.print("Enter an index to access: ");
            int index = scanner.nextInt();  // Can be valid input

            char ch = input.charAt(index);  // May throw StringIndexOutOfBoundsException
            System.out.println("Character at index " + index + ": " + ch);

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter a valid integer.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(" StringIndexOutOfBoundsException: Invalid string index.");
        } finally {
            scanner.close();
            System.out.println("Program finished.");
        }
    }
}
/*Enter an integer: 6
You entered: 6
Enter a string: navane
Enter an index to access: 3
Character at index 3: a
Program finished.
*/
