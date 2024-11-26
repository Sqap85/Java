// Cat.java
public class Cat extends Animal implements Swimmable, Movable {

    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming!");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving!");
    }
}
