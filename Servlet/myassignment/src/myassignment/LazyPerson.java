package myassignment;

public class LazyPerson extends Person {
    @Override
    void eat() {
        System.out.println("Lazy person eats junk food and snacks often.");
    }

    @Override
    void exercise() {
        System.out.println("Lazy person rarely exercises and prefers resting.");
    }
}
