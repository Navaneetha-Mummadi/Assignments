package myassignment;//assignment11
class Calculator {

 public void add(double a, double b) {
     double result = a + b;
     System.out.println("Addition: " + result);
 }

 public void diff(double a, double b) {
     double result = a - b;
     System.out.println("Subtraction: " + result);
 }

 
 public void mul(double a, double b) {
     double result = a * b;
     System.out.println("Multiplication: " + result);
 }

 public void div(double a, double b) {
     if (b != 0) {
         double result = a / b;
         System.out.println("Division: " + result);
     } else {
         System.out.println("Cannot divide by zero.");
     }
 }
}

public class Assignment11 {
 public static void main(String[] args) {
     Calculator calc = new Calculator();
     double num1 = 10;
     double num2 = 5;
     calc.add(num1, num2);
     calc.diff(num1, num2);
     calc.mul(num1, num2);
     calc.div(num1, num2);
 }
}

/*
 * Addition: 15.0
Subtraction: 5.0
Multiplication: 50.0
Division: 2.0

 * */
