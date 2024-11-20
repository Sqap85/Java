//Üst sınıfta tanımlanan bir metodun, alt sınıfta yeniden tanımlanmasıdır. Bu, bir nesnenin gerçek türüne göre doğru metodun çağrılmasını sağlar.
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

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Polimorfizm
        animal.eat();              // Dog sınıfındaki eat metodu çağrılır
    }
}
