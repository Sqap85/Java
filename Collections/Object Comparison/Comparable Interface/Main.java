import java.util.ArrayList;
import java.util.Collections;

//Comparable arayüzü, bir sınıfın öğelerini sıralamak için kullanılır. Sıralama ölçütü sadece bir özellik üzerinden yapılır ve sıralama için compareTo() metodu kullanılır.

class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    // compareTo metodu ile sıralama
    @Override
    public int compareTo(Student other) {
        return this.age - other.age; // Yaşa göre sıralama (pozitif, negatif veya sıfır döner)
    }

    /* // compareTo metodu ile isme göre sıralama
    @Override
    public int compareTo(Student st) {
        return this.name.compareTo(st.name); // İsimlere göre sıralama (alfabetik sıralama)
    }*/

    @Override
    public String toString() {
        return rollno + " " + name + " " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "Vijay", 23));
        students.add(new Student(106, "Ajay", 27));
        students.add(new Student(105, "Jai", 21));

        // Koleksiyonu sıralama
        Collections.sort(students); // compareTo() metodunu kullanarak sıralama

        // Sıralanmış listeyi yazdırma
        for (Student st : students) {
            System.out.println(st);
        }
    }
}
