package myassignment;
import java.util.Scanner;
public class Assignment9 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double totalAmount = 0.0;
	        char choice;
	        do {
	            System.out.print("Enter product number (1, 2, or 3): ");
	            int productNumber = sc.nextInt();
	            System.out.print("Enter quantity sold: ");
	            int quantity = sc.nextInt();
	            double price = 0.0;
	            switch (productNumber) {
	                case 1:
	                    price = 22.50;
	                    break;
	                case 2:
	                    price = 44.50;
	                    break;
	                case 3:
	                    price = 9.98;
	                    break;
	                default:
	                    System.out.println("Invalid product number!");
	                    price = 0.0;
	            }

	            totalAmount += price * quantity;
	            System.out.print("Do you want to enter another product? (Y/N): ");
	            choice = sc.next().charAt(0);
	        } while (choice == 'Y' || choice == 'y');
	        System.out.printf("Total retail value of all products sold: Rs. %.2f\n", totalAmount);

	    }
	}
/*
Enter product number (1, 2, or 3): 1
Enter quantity sold: 3
Do you want to enter another product? (Y/N): y
Enter product number (1, 2, or 3): 2
Enter quantity sold: 5
Do you want to enter another product? (Y/N): n
Total retail value of all products sold: Rs. 290.00
*/