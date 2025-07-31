package myassignment;
import java.util.NoSuchElementException;
import java.util.Scanner;
//aas-29
public class Assingment29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Register Number: ");
            String regNo = scanner.nextLine();

            if (regNo.length() != 9) {
                throw new IllegalArgumentException("Register number must be 9 characters.");
            }

            if (!regNo.matches("[a-zA-Z0-9]+")) {
                throw new NoSuchElementException("Register number must contain only letters and digits.");
            }

            System.out.print("Enter Mobile Number: ");
            String mobileNo = scanner.nextLine();

            if (mobileNo.length() != 10) {
                throw new IllegalArgumentException("Mobile number must be 10 digits.");
            }

            if (!mobileNo.matches("\\d+")) {
                throw new NumberFormatException("Mobile number must contain only digits.");
            }

            System.out.println("valid");

        } catch (NoSuchElementException e) {
            System.out.println("invalid");
        } catch (NumberFormatException e) {
            System.out.println("invalid");
        } catch (IllegalArgumentException e) {
            System.out.println("invalid");
        } finally {
            scanner.close();
        }
    }
}
/*
 * Enter Register Number: 207010203
Enter Mobile Number: 9876547654
valid
*/
