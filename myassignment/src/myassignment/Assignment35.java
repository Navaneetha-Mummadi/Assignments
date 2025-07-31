package myassignment;

import java.util.Scanner;

//Custom exception
class InvalidEmployeeCode extends Exception {
 public InvalidEmployeeCode(String message) {
     super(message);
 }
}

//Employee class
class Employee {
 private String employeeCode;
 private String name;
 private int yearOfBirth;

 public Employee(String employeeCode, String name, int yearOfBirth) {
     this.employeeCode = employeeCode;
     this.name = name;
     this.yearOfBirth = yearOfBirth;
 }

 public void displayDetails() {
     System.out.println("\n--- Employee Details ---");
     System.out.println("Name          : " + name);
     System.out.println("Year of Birth : " + yearOfBirth);
     System.out.println("Employee Code : " + employeeCode);
 }
}

//Main class to test
public class Assignment35 {
 // Method to validate the format of the employee code
 public static void validateEmployeeCode(String code) throws InvalidEmployeeCode {
     // Expected format: YY-D-XXX (e.g., 81-F-112)
     if (!code.matches("\\d{2}-[FS]-\\d{3}")) {
         throw new InvalidEmployeeCode("Invalid Employee Code format. Expected format: YY-F-XXX or YY-S-XXX");
     }
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         // Read input
         System.out.print("Enter employee name: ");
         String name = scanner.nextLine();

         System.out.print("Enter year of birth: ");
         int yob = scanner.nextInt();
         scanner.nextLine(); // clear buffer

         System.out.print("Enter employee code (e.g., 81-F-123): ");
         String code = scanner.nextLine();

         // Validate employee code
         validateEmployeeCode(code);

         // Create and display employee
         Employee emp = new Employee(code, name, yob);
         emp.displayDetails();

     } catch (InvalidEmployeeCode e) {
         System.out.println("Error: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Unexpected Error: " + e.getMessage());
     } finally {
         scanner.close();
     }
 }
}
/*Enter employee name: navaneetha
Enter year of birth: 23/09/2004
Unexpected Error: null
*/