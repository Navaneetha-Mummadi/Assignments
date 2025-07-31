package myassignment;

import java.util.Scanner;

public class Assignment24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] speeds = new int[5];
        int sum = 0;

        // Input speeds
        System.out.println("Enter speeds of 5 bikers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Speed of biker " + (i + 1) + ": ");
            speeds[i] = scanner.nextInt();
            sum += speeds[i];
        }

        double average = sum / 5.0;

        System.out.println("\nAverage speed: " + average);
        System.out.println("Qualifying bikers (speed > average):");

        for (int speed : speeds) {
            if (speed > average) {
                System.out.println(speed);
            }
        }

        scanner.close();
    }
}
/*
Enter speeds of 5 bikers:
Speed of biker 1: 34
Speed of biker 2: 54
Speed of biker 3: 55
Speed of biker 4: 43
Speed of biker 5: 34

Average speed: 44.0
Qualifying bikers (speed > average):
54
55
*/