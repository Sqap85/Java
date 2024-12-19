import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // Creating an ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Adding students to the list
        students.add(new Student(101, "Vijay", 23));
        students.add(new Student(106, "Ajay", 27));
        students.add(new Student(105, "Jai", 21));

        // Display the list before sorting
        System.out.println("BEFORE COMPARABLE");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting the list using Comparable (by age)
        Collections.sort(students);
        System.out.println("\nAFTER COMPARABLE (BY AGE)");
        for (Student student : students) {
            System.out.println(student);
        }

        // Using a Comparator to sort by name (alphabetical order)
        Comparator<Student> nameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        };

        // Sorting the list using the name Comparator
        Collections.sort(students, nameComparator);
        System.out.println("\nAFTER COMPARATOR (BY NAME)");
        for (Student student : students) {
            System.out.println(student);
        }

        // Using an external Comparator class to sort by roll number
        RollNumberComparator rollnoComparator = new RollNumberComparator();

        // Sorting the list using the roll number Comparator
        Collections.sort(students, rollnoComparator);
        System.out.println("\nAFTER COMPARATOR (BY ROLL NUMBER)");
        for (Student student : students) {
            System.out.println(student);
        }

        // Demonstrating the use of equals method
        Student student1 = new Student(85, "Engin", 23);
        Student student2 = new Student(85, "Engin", 23);
        Student student3 = new Student(105, "Jai", 21);

        System.out.println("\nEQUALS METHOD DEMONSTRATION");
        System.out.println("student1.equals(student2): " + student2.equals(student2)); // true
        System.out.println("student1.equals(student3): " + student2.equals(student3)); // false

    }
}
