package myassignment;
import java.util.Scanner;
public class Assignment7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of classes held:");
        int totalClasses = sc.nextInt();
        System.out.print("Enter number of classes attended:");
        int attendedClasses = sc.nextInt();
        double percentage = ((double) attendedClasses / totalClasses) * 100;
        System.out.printf("Attendance Percentage: %.2f%%\n", percentage);
        if (percentage >= 70) {
            System.out.println("Student is allowed to sit in the exam.");
        } else {
            System.out.println("Student is NOT allowed to sit in the exam.");
        }
        sc.close();
    }
	
}
/*
 * Enter no of classes held:50
Enter number of classes attended:35
Attendance Percentage: 70.00%
Student is allowed to sit in the exam.
*/