import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return rollno + " " + name + " " + age;
    }
}

// Yaşa göre sıralama
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age; // Yaşları karşılaştırma
    }
}

// İsme göre sıralama
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // İsimleri karşılaştırma
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "Vijay", 23));
        students.add(new Student(106, "Ajay", 27));
        students.add(new Student(105, "Jai", 21));

        System.out.println("Isme Göre Sıralama:");
        Collections.sort(students, new NameComparator()); // İsme göre sıralama
        for (Student st : students) {
            System.out.println(st);
        }

        System.out.println("\nYaşa Göre Sıralama:");
        Collections.sort(students, new AgeComparator()); // Yaşa göre sıralama
        for (Student st : students) {
            System.out.println(st);
        }
    }
}
