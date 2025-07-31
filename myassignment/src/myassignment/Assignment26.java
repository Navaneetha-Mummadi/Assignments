package myassignment;

import java.util.*;

public class Assignment26 {
    public static void main(String[] args) {
        int[] input = {2, 3, 54, 1, 6, 7, 7};

        // Use Set to remove duplicates
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : input) {
            uniqueNumbers.add(num);
        }

        // Sum even numbers
        int sum = 0;
        for (int num : uniqueNumbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of even numbers (after removing duplicates): " + sum);
    }
}
//Sum of even numbers (after removing duplicates): 62
