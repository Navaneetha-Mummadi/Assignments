package myassignment;


//Custom Exception Class
class LowSalException extends Exception {
 public LowSalException(String message) {
     super(message);
 }
}

//Main Emp class
class Emp {
 private int empId;
 private String empName;
 private String designation;
 private double basic;
 private double hra; // Read-only: No public setter

 // Constructor
 public Emp(int empId, String empName, String designation, double basic) throws LowSalException {
     this.empId = empId;
     this.empName = empName;
     this.designation = designation;
     this.basic = basic;

     if (basic < 50000) {
         throw new LowSalException("Basic salary should not be less than 50000.");
     }

     calculateHRA(); // calculate HRA in constructor
 }

 // Method to calculate HRA based on designation
 private void calculateHRA() {
     switch (designation.toLowerCase()) {
         case "manager":
             hra = 0.10 * basic;
             break;
         case "teamleader":
             hra = 0.12 * basic;
             break;
         case "hr":
             hra = 0.05 * basic;
             break;
         default:
             hra = 0.0;
             System.out.println("Unknown designation. HRA not calculated.");
     }
 }

 // Method to print employee details
 public void printDET() {
     System.out.println("Employee Details:");
     System.out.println("ID          : " + empId);
     System.out.println("Name        : " + empName);
     System.out.println("Designation : " + designation);
     System.out.println("Basic       : " + basic);
     System.out.println("HRA         : " + hra);
 }
}

//Test class with main method
public class Assignment33  {
 public static void main(String[] args) {
     try {
         // Change the values below to test various cases
         Emp emp1 = new Emp(101, "John Doe", "Manager", 60000);
         emp1.printDET();

         System.out.println();

         Emp emp2 = new Emp(102, "Jane Smith", "HR", 48000); // Should raise exception
         emp2.printDET();
     } catch (LowSalException e) {
         System.out.println("Exception Caught: " + e.getMessage());
     }
 }
}

/*Employee Details:
ID          : 101
Name        : John Doe
Designation : Manager
Basic       : 60000.0
HRA         : 6000.0

Exception Caught: Basic salary should not be less than 50000.
*/