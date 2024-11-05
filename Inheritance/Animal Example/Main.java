// Parent Class: Animal
class Animal {
    public String name;
    protected int age;
    public String type;

    // Constructor of Animal class
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.type = "Generic Animal";
        System.out.println("Animal created: " + this.name);
    }

    // Method to print animal's details
    void printDetails() {
        System.out.println("Animal Details - Name: " + name + ", Age: " + age + ", Type: " + type);
    }

    // Method to demonstrate method overriding
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Intermediate Class: Mammal (Multilevel Inheritance Example)
class Mammal extends Animal {
    private String habitat;

    Mammal(String name, int age, String habitat) {
        super(name, age); // Calling parent class constructor
        this.habitat = habitat;
        this.type = "Mammal";
        System.out.println("Mammal created: " + this.name + " with habitat: " + this.habitat);
    }

    // Mammal-specific method to print habitat
    void printHabitat() {
        System.out.println("Habitat: " + habitat);
    }
}

// Child Class: Dog (Single and Multilevel Inheritance Example)
class Dog extends Mammal {
    String breed;

    Dog(String name, int age, String habitat, String breed) {
        super(name, age, habitat);
        this.breed = breed;
        System.out.println("Dog of breed " + this.breed + " created");
    }

    // Method overriding
    @Override
    void sound() {
        super.sound(); // Calling the parent class method
        System.out.println("Dog barks: Woof Woof!");
    }

    // Display Dog details
    void printDogDetails() {
        printDetails();
        printHabitat();
        System.out.println("Breed: " + breed);
    }
}

// Another Child Class: Cat (Hierarchical Inheritance Example)
class Cat extends Animal {
    String color;

    Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
        this.type = "Cat";
        System.out.println("Cat of color " + this.color + " created");
    }

    // Method overriding
    @Override
    void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }

    // Display Cat details
    void printCatDetails() {
        printDetails();
        System.out.println("Color: " + color);
    }
}

// Main class to test inheritance and other OOP concepts
public class Main {
    public static void main(String[] args) {
        System.out.println("Creating Dog...");
        Dog dog = new Dog("Buddy", 3, "House", "Labrador");
        dog.sound(); // Overridden method
        dog.printDogDetails();

        System.out.println("\nCreating Cat...");
        Cat cat = new Cat("Whiskers", 2, "Gray");
        cat.sound(); // Overridden method
        cat.printCatDetails();
    }
}