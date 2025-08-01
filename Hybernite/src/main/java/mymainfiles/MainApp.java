package mymainfiles;

import mydaofiles.ItemDAO;
import mypojos.Item;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemDAO dao = new ItemDAO();

        while (true) {
            System.out.println("HIBERNATE:\n 1. Add\n 2. View All\n 3. Update\n 4. Delete\n 5. Get by ID\n 0. Exit");
            System.out.print(" Choose option: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    dao.addItem(name, price);
                    break;

                case 2:
                    List<Item> items = dao.viewAllItems();
                    for (Item item : items) {
                        System.out.println(item.getId() + " " + item.getName() + " " + item.getPrice());
                    }
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}
