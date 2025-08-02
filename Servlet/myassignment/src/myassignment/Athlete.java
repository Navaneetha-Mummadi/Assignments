package myassignment;

public class Athlete extends Person {
    @Override
    void eat() {
        System.out.println("Athlete eats a high-protein and balanced diet.");
    }

    @Override
    void exercise() {
        System.out.println("Athlete exercises daily with intense workouts.");
    }
}
