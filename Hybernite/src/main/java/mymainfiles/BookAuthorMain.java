package mymainfiles;

import mydaofiles.BookAuthorDAO;
import java.util.Scanner;

public class BookAuthorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookAuthorDAO dao = new BookAuthorDAO();

        while (true) {
            System.out.println("1. Add Book with Author");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                System.out.print("Enter book title: ");
                String title = sc.nextLine();
                System.out.print("Enter author name: ");
                String name = sc.nextLine();

                dao.addBookWithAuthor(title, name);
                System.out.println("Added successfully.\n");
            } else if (option == 0) {
                break;
            }
        }

        sc.close();
    }
}
