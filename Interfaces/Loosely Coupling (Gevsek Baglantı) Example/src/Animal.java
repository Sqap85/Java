// Animal.java
public abstract class Animal {
    String name;

    // Constructor to set name
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by all animals
    abstract void makeSound();
}
