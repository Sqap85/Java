class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat is eating");
    }
}

public class Main {
    public static void main(String[] args) {
    // Animal[] animals = {new Dog(), new Cat()}; // boylede olur
       Animal dog = new Dog();
       Animal cat = new Cat();

       Animal[] animals = {dog,cat};

        for (Animal animal : animals) {
            animal.eat(); // Her alt sınıfın eat() metodu çağrılır
        }
    }
}