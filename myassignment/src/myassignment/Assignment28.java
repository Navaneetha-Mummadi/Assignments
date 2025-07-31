package myassignment;


public class Assignment28 {

    // Functional Interface
    interface PerformOperation {
        boolean check(int a);
    }

    public static PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return (int a) -> {
            if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return (int a) -> {
            String str = String.valueOf(a);
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        };
    }
    public static void main(String[] args) {
        PerformOperation oddOp = isOdd();
        PerformOperation primeOp = isPrime();
        PerformOperation palindromeOp = isPalindrome();

        int[] testNumbers = {3, 4, 5, 11, 121, 123};

        for (int num : testNumbers) {
            System.out.println("Number: " + num);
            System.out.println("Is Odd? " + oddOp.check(num));
            System.out.println("Is Prime? " + primeOp.check(num));
            System.out.println("Is Palindrome? " + palindromeOp.check(num));
            System.out.println();
        }
    }
}
/*
 * Number: 3
Is Odd? true
Is Prime? true
Is Palindrome? true

Number: 4
Is Odd? false
Is Prime? false
Is Palindrome? true

Number: 5
Is Odd? true
Is Prime? true
Is Palindrome? true

Number: 11
Is Odd? true
Is Prime? true
Is Palindrome? true

Number: 121
Is Odd? true
Is Prime? false
Is Palindrome? true

Number: 123
Is Odd? true
Is Prime? false
Is Palindrome? false


 * */

