package myassignment;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter salary:");
        double salary = scanner.nextDouble();
        System.out.print("Enter no.of years:");
        int years = scanner.nextInt();
        if (years>6) {
            double bonus=0.10*salary;
            System.out.println("bonus amount is:"+bonus);
        } else {
            System.out.println("no bonus");
        }
	}
}


/*
 Enter salary:9000
Enter no.of years:9
bonus amount is:900.0

Enter salary:9000
Enter no.of years:2
no bonus

 */