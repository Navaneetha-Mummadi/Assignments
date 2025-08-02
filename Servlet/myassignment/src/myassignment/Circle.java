package myassignment;

public class Circle implements Drawable, Fillable {

    @Override
    public void drawingColor() {
        System.out.println("Circle Drawing Color: Red");
    }

    @Override
    public void thickness() {
        System.out.println("Circle Thickness: 2px");
    }

    @Override
    public void fillingColor() {
        System.out.println("Circle Fill Color: Blue");
    }

    @Override
    public void size() {
        System.out.println("Circle Size: Radius 50 units");
    }
}
