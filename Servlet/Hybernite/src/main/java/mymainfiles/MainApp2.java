package mymainfiles;



import mypojos.*;
import mydaofiles.*;

import java.util.*;

public class MainApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountDAO dao = new AccountDAO();

        while (true) {
            System.out.println("\nHIBERNATE ONE-TO-MANY DEMO:");
            System.out.println("1. Add Account with Transactions");
            System.out.println("2. View All Accounts");
            System.out.println("3. Delete Account");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    Account acc = new Account();
                    System.out.print("Enter Account Holder Name: ");
                    acc.setHolderName(sc.next());

                    System.out.print("How many transactions? ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        Transaction txn = new Transaction();
                        System.out.print("Enter amount: ");
                        txn.setAmount(sc.nextDouble());
                        acc.addTransaction(txn);
                    }
                    dao.addAccount(acc);
                    System.out.println("Account and Transactions added.");
                    break;

                case 2:
                    List<Account> accounts = dao.getAllAccounts();
                    for (Account a : accounts) {
                        System.out.println(a);
                        for (Transaction t : a.getTransactions()) {
                            System.out.println("    " + t);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Account ID to delete: ");
                    int id = sc.nextInt();
                    dao.deleteAccount(id);
                    System.out.println("Deleted.");
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}

