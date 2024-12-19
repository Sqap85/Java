import java.util.Objects;

public class Student implements Comparable<Student>  {
    int rollno;
    String name;
    int age;

    public Student(int rollno,String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        return this.age - other.age;
    }

    // Overriding equals method to compare Student objects
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno && age == student.age && Objects.equals(name, student.name);
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
