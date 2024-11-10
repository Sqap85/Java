class Person {
    String name;
    int age;
    public Person(int age) {
        this("", age);
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class EncapsulatedPerson {
    private String name;
    private int age;

    public EncapsulatedPerson(int age) {
        this("Unknown", age);
    }

    public EncapsulatedPerson(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 20 || age > 60) {
            throw new IllegalArgumentException("Invalid age! Age must be between 20 and 60.");
        }
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            EncapsulatedPerson encapsulatedPerson = new EncapsulatedPerson("Jack", 65); // This will throw an exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            EncapsulatedPerson validPerson = new EncapsulatedPerson("Alice", 30);
            System.out.println("Name: " + validPerson.getName());
            System.out.println("Age: " + validPerson.getAge());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}