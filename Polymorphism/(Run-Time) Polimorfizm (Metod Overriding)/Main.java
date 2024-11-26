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
    
    void bark(){
        System.out.println("Hav! Hav!");
    }
    
}

public class Main {
    public static void main(String[] args) {
      //Dog dog = new Animal(); Yapilamaz soldaki ust sinif olmak zorunda!
        Animal animal = new Dog(); // Polimorfizm
        animal.eat();// Dog sınıfındaki eat metodu çağrılır
     // animal.bark Yapilamaz cunku animal classinda bark yok downcasting gerek
        ((Dog) animal).bark();
    }
}
