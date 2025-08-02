package myassignment;
//ass 22, Square.java, Circle.java,Line.java,Fillable.java,Drawable.java		
public class Assingment22 {
    public static void main(String[] args) {
        Drawable d;
        Fillable f;

        System.out.println("=== Line ===");
        Line line = new Line();
        d = line;
        f = line;
        d.drawingColor();
        d.thickness();
        f.fillingColor();
        f.size();

        System.out.println("\n=== Circle ===");
        Circle circle = new Circle();
        d = circle;
        f = circle;
        d.drawingColor();
        d.thickness();
        f.fillingColor();
        f.size();

        System.out.println("\n=== Square ===");
        Square square = new Square();
        d = square;
        f = square;
        d.drawingColor();
        d.thickness();
        f.fillingColor();
        f.size();
    }
}
/*
=== Line ===
Line Drawing Color: Black
Line Thickness: 1px
Line Fill Color: Not Applicable
Line Size: Length 100 units

=== Circle ===
Circle Drawing Color: Red
Circle Thickness: 2px
Circle Fill Color: Blue
Circle Size: Radius 50 units

=== Square ===
Square Drawing Color: Green
Square Thickness: 3px
Square Fill Color: Yellow
Square Size: Side 40 units
*/
