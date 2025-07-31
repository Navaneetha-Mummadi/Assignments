package myassignment;
import java.util.Scanner;
public class Assingment8 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of classes held: ");
	        int totalClasses = sc.nextInt();
	        System.out.print("Enter number of classes attended: ");
	        int attendedClasses = sc.nextInt();
	        double percentage = ((double) attendedClasses / totalClasses) * 100;
	        System.out.printf("Attendance Percentage: %.2f%%\n", percentage);
	        System.out.print("Do you have a medical cause? (Y/N): ");
	        char medicalCause = sc.next().charAt(0);
	        if (percentage >= 70 || medicalCause == 'Y' || medicalCause == 'y') {
	            System.out.println("Student is allowed to sit in the exam.");
	        } else {
	            System.out.println("Student is NOT allowed to sit in the exam.");
	        }
	    }
	}
/*
 * Enter number of classes held: 60
Enter number of classes attended: 65
Attendance Percentage: 108.33%
Do you have a medical cause? (Y/N): y
Student is allowed to sit in the exam.

 */

