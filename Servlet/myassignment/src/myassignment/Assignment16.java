package myassignment;



import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark, total = 0;
        int studentCount = 3;

        for (int i = 1; i <= studentCount; i++) {
            while (true) {
                System.out.print("Enter the mark (0-100) for student " + i + ": ");
                mark = sc.nextInt();

                if (mark >= 0 && mark <= 100) {
                    total += mark;
                    break;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            }
        }

        double average = (double) total / studentCount;
        System.out.printf("The average is: %.2f\n", average);
    }
}

/*
 * Enter the mark (0-100) for student 1: 55
Enter the mark (0-100) for student 2: 45
Enter the mark (0-100) for student 3: 66
The average is: 55.33

 */