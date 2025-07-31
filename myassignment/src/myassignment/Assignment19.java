package myassignment;

import java.util.Scanner;

public class Assignment19 {
    public static void main(String[] args) {
        Bank[] customers = new Bank[4];
        customers[0] = new Saving("A101", "Alice", 2, "Teacher", 5000, 0.04);
        customers[1] = new Current("A102", "Bob", 1, "Engineer", 10000, 0.03, true);
        customers[2] = new Current("A103", "Charlie", 1, "Doctor", 12000, 0.025, false);
        customers[3] = new Saving("A104", "Diana", 2, "Nurse", 8000, 0.035);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number to search: ");
        String accNo = scanner.nextLine();

        boolean found = false;
        int currentCount = 0;
        double totalCurrentBalance = 0;

        for (Bank customer : customers) {
            if (customer instanceof Current) {
                currentCount++;
                totalCurrentBalance += customer.calcBalance();
            }

            if (customer.accNo.equalsIgnoreCase(accNo)) {
                found = true;
                System.out.println("\nCustomer Found:\n" + customer.toString());
                System.out.println("Net Balance: " + customer.calcBalance());
            }
        }

        if (!found) {
            System.out.println("Customer with account number " + accNo + " not found.");
        }

        System.out.println("\nTotal Current Account Holders: " + currentCount);
        System.out.println("Total Balance in Current Accounts: " + totalCurrentBalance);

        scanner.close();
    }
}

// Current.java ,Saving.java , Bank .java files
/*Enter account number to search: A102

Customer Found:
Account No: A102
Name: Bob
Gender: Male
Job: Engineer
Current Balance: 10000.0
Net Balance: 10150.0

Total Current Account Holders: 2
Total Balance in Current Accounts: 22450.0
--------------------------------------------
Enter account number to search: 102
Customer with account number 102 not found.

Total Current Account Holders: 2
Total Balance in Current Accounts: 22450.0

*
*/