package myassignment;

public class Square implements Drawable, Fillable {

    @Override
    public void drawingColor() {
        System.out.println("Square Drawing Color: Green");
    }

    @Override
    public void thickness() {
        System.out.println("Square Thickness: 3px");
    }

    @Override
    public void fillingColor() {
        System.out.println("Square Fill Color: Yellow");
    }

    @Override
    public void size() {
        System.out.println("Square Size: Side 40 units");
    }
}
