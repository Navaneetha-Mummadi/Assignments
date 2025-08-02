package myassignment;
//ass 21
//Person.java
//Athlete.java
//LazyPerson.java
//PersonTest.java
public class Assingment21 {
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazy = new LazyPerson();

        System.out.println("---- Athlete ----");
        athlete.eat();
        athlete.exercise();

        System.out.println("\n---- Lazy Person ----");
        lazy.eat();
        lazy.exercise();
    }
}
/*
---- Athlete ----
Athlete eats a high-protein and balanced diet.
Athlete exercises daily with intense workouts.

---- Lazy Person ----
Lazy person eats junk food and snacks often.
Lazy person rarely exercises and prefers resting.
*/