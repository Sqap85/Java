// Duck.java
public class Duck extends Animal implements Swimmable, Flyable, Movable {

    public Duck(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Quack!");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying!");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving!");
    }
}
