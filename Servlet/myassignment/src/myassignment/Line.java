package myassignment;

public class Line implements Drawable, Fillable {

    @Override
    public void drawingColor() {
        System.out.println("Line Drawing Color: Black");
    }

    @Override
    public void thickness() {
        System.out.println("Line Thickness: 1px");
    }

    @Override
    public void fillingColor() {
        System.out.println("Line Fill Color: Not Applicable");
    }

    @Override
    public void size() {
        System.out.println("Line Size: Length 100 units");
    }
}
