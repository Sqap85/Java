// Main.java
public class Main {
    public static void main(String[] args) {
        // Her bir hayvanın nesnesi oluşturuluyor
        Animal duck = new Duck("Duck");
        Animal cat = new Cat("Cat");
        Animal eagle = new Eagle("Eagle");

        // Duck için metotlar çağrılıyor
        duck.makeSound();
        ((Swimmable) duck).swim();
        ((Flyable) duck).fly();
        ((Movable) duck).move();

        // Cat için metotlar çağrılıyor
        cat.makeSound();
        ((Swimmable) cat).swim();
        ((Movable) cat).move();

        // Eagle için metotlar çağrılıyor
        eagle.makeSound();
        ((Flyable) eagle).fly();
        ((Movable) eagle).move();
    }
}
