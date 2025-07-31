package myassignment;
public class Assignment34 {
    private String employeeId;
    private String name;
    private int yearOfBirth;
    private String fullYear;
    private String designation;
    private String number;

 
    public Assignment34(String employeeId, String name, int yearOfBirth) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearOfBirth = yearOfBirth;

        parseEmployeeId(); 
    }

    
    private void parseEmployeeId() {
        try {
            String[] parts = employeeId.split("-");

            if (parts.length != 3) {
                throw new IllegalArgumentException("Invalid Employee ID format. Must be YY-D-XXX.");
            }

            String yy = parts[0];
            designation = parts[1];
            number = parts[2];

            if (!(designation.equalsIgnoreCase("F") || designation.equalsIgnoreCase("S"))) {
                throw new IllegalArgumentException("Invalid designation code. Use 'F' for Faculty or 'S' for Staff.");
            }

            int yearInt = Integer.parseInt(yy);
            fullYear = (yearInt >= 0 && yearInt <= 24) ? "20" + yy : "19" + yy;

        } catch (Exception e) {
            System.out.println("Error parsing employee ID: " + e.getMessage());
        }
    }

   
    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name           : " + name);
        System.out.println("Year of Birth  : " + yearOfBirth);
        System.out.println("Employee ID    : " + employeeId);
        System.out.println("Parsed Year    : " + fullYear);
        System.out.println("Designation    : " + (designation.equalsIgnoreCase("F") ? "Faculty" : "Staff"));
        System.out.println("ID Number      : " + number);
    }

    
    public static void main(String[] args) {
       
        Assignment34 emp1 = new Assignment34("81-F-112", "Alice", 1960);
        emp1.printDetails();

        System.out.println();

        Assignment34 emp2 = new Assignment34("79-S-254", "Bob", 1955);
        emp2.printDetails();

        System.out.println();

        Assignment34 emp3 = new Assignment34("22-X-001", "Invalid User", 2001);
        emp3.printDetails();
    }
}
/*Employee Details:
Name           : Alice
Year of Birth  : 1960
Employee ID    : 81-F-112
Parsed Year    : 1981
Designation    : Faculty
ID Number      : 112

Employee Details:
Name           : Bob
Year of Birth  : 1955
Employee ID    : 79-S-254
Parsed Year    : 1979
Designation    : Staff
ID Number      : 254

Error parsing employee ID: Invalid designation code. Use 'F' for Faculty or 'S' for Staff.
Employee Details:
Name           : Invalid User
Year of Birth  : 2001
Employee ID    : 22-X-001
Parsed Year    : null
Designation    : Staff
ID Number      : 001
*/
