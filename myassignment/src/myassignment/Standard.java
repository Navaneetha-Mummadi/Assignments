package myassignment; //Assignment 12
import java.util.*;

public class Standard {
    private List<Student> students;

    public Standard() {
        students = new ArrayList<>();
        students.add(new Student("Anu", 85, 90, 80));
        students.add(new Student("Bala", 75, 88, 92));
        students.add(new Student("Chitra", 91, 93, 89));
        students.add(new Student("Dinesh", 68, 74, 70));
        students.add(new Student("Esha", 82, 79, 85));
        students.add(new Student("Farhan", 70, 60, 67));
        students.add(new Student("Gita", 90, 95, 96));
        students.add(new Student("Hari", 88, 85, 84));
    }

    public void displayByRollNo() {
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRollNo))
                .forEach(s -> System.out.println(s.getRollNo() + " - " + s.getStudName()));
    }

    public void displayTopPercentage() {
        Student top = Collections.max(students, Comparator.comparingDouble(Student::getPercentage));
        System.out.println("Top %: " + top.getRollNo() + " - " + top.getStudName());
    }

    public void displayTopMaths() {
        Student topMaths = Collections.max(students, Comparator.comparingInt(Student::getMarksInMaths));
        System.out.println("Top Maths: " + topMaths.getRollNo() + " - " + topMaths.getStudName());
    }

    public void displayByMathsScienceTotal() {
        students.stream()
                .sorted(Comparator.comparingInt(s -> s.getMarksInMaths() + s.getMarksInScience()))
                .forEach(s -> System.out.println(s.getRollNo() + " - " + s.getStudName()));
    }

    public void displayRanks() {
        List<Student> sorted = new ArrayList<>(students);
        sorted.sort((a, b) -> Double.compare(b.getPercentage(), a.getPercentage()));

        int rank = 1;
        for (Student s : sorted) {
            System.out.printf("Rank %d: %d - %s | Total: %d | %%: %.2f\n",
                    rank++, s.getRollNo(), s.getStudName(), s.getTotalMarks(), s.getPercentage());
        }
    }

    public static void main(String[] args) {
        Standard std = new Standard();

        System.out.println("\n1. Roll No Ascending:");
        std.displayByRollNo();

        System.out.println("\n2. Highest Percentage:");
        std.displayTopPercentage();

        System.out.println("\n3. Highest in Mathematics:");
        std.displayTopMaths();

        System.out.println("\n4. Ascending by Maths + Science:");
        std.displayByMathsScienceTotal();

        System.out.println("\n5. Rank List:");
        std.displayRanks();
    }
}
