// Eagle.java
public class Eagle extends Animal implements Flyable, Movable {

    public Eagle(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Screech!");
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
