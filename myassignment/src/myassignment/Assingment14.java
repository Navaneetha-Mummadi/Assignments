package myassignment;
//assi 14
class Shape {
 public double area(double side) {
     return side * side;
 }
 public double area(double length, double breadth) {
     return length * breadth;
 }

 public double perimeter(double side) {
     return 4 * side;
 }

 public double perimeter(double length, double breadth) {
     return 2 * (length + breadth);
 }
}
public class Assingment14 {
 public static void main(String[] args) {
     Shape shape = new Shape();

     double squareSide = 5.0;
     double rectLength = 8.0;
     double rectBreadth = 4.0;

     System.out.println("=== Square ===");
     System.out.println("Area: " + shape.area(squareSide));
     System.out.println("Perimeter: " + shape.perimeter(squareSide));

     System.out.println("\n=== Rectangle ===");
     System.out.println("Area: " + shape.area(rectLength, rectBreadth));
     System.out.println("Perimeter: " + shape.perimeter(rectLength, rectBreadth));
 }
}

/*
 * === Square ===
Area: 25.0
Perimeter: 20.0

=== Rectangle ===
Area: 32.0
Perimeter: 24.0

 */