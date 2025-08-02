package myassignment;
import java.util.HashMap;
import java.util.Scanner;

public class Assignment15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 elements in the array:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }

        System.out.println("\nFrequency of each element:");
        for (int key : freqMap.keySet()) {
            System.out.println(key + " occurs " + freqMap.get(key) + " time(s)");
        }
    }
}

/*
 * Enter 10 elements in the array:
2 3 4 3 2 6 9 4 44 3

Frequency of each element:
2 occurs 2 time(s)
3 occurs 3 time(s)
4 occurs 2 time(s)
6 occurs 1 time(s)
9 occurs 1 time(s)
44 occurs 1 time(s)

 */

