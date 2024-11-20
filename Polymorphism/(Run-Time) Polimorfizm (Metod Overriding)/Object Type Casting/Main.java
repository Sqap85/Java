// Abstract sınıf
abstract class Animal {
    // Ortak bir metodun gövdesi olabilir
    void sleep() {
        System.out.println("Animal is sleeping");
    }

    // Soyut metod: Alt sınıflarda override edilmesi zorunlu
    abstract void eat();
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat is eating");
    }

    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Main {
    public static void main(String[] args) {
        // Upcasting: Alt sınıflardan soyut sınıf referansları oluşturma
        Animal dogAsAnimal = new Dog(); // Dog nesnesi Animal türüne dönüştürülüyor (Upcasting)
        Animal catAsAnimal = new Cat(); // Cat nesnesi Animal türüne dönüştürülüyor (Upcasting)

        // Polimorfizm: Üst sınıf referansı üzerinden alt sınıf metotlarını çağırma
        dogAsAnimal.eat(); // Dog is eating
        catAsAnimal.eat(); // Cat is eating

        // Ortak metotları üst sınıf referansı üzerinden çağırma
        dogAsAnimal.sleep(); // Animal is sleeping
        catAsAnimal.sleep(); // Animal is sleeping

        /* 
         instanceof operatörü:
         - Bir nesnenin belirli bir sınıfın örneği olup olmadığını kontrol eder.
         - Bir nesnenin, sınıf hiyerarşisinin parçası olup olmadığını belirler.
         - Sonuç boolean (true/false) döner.
        */

        // Downcasting ve instanceof kontrolü
        if (dogAsAnimal instanceof Dog) {
            Dog dog = (Dog) dogAsAnimal; // Güvenli downcasting
            dog.bark(); // Dog is barking
        }

        if (catAsAnimal instanceof Cat) {
            ((Cat) catAsAnimal).meow(); // Tek satırda downcasting ve metod çağrısı
        }

        // instanceof ile tür kontrolü
        if (dogAsAnimal instanceof Cat) {
            System.out.println("This is a Cat.");
        } else {
            System.out.println("dogAsAnimal is not a Cat."); // Bu çalışacak
        }

        // Türlerin kontrol edilmediği bir yanlış downcasting örneği
        try {
            Dog wrongDog = (Dog) catAsAnimal; // Hatalı downcasting
            wrongDog.bark(); // Bu satır çalışmaz
        } catch (ClassCastException e) {
            System.out.println("Wrong typecasting!: " + e.getMessage());
        }

        // Başka bir doğru senaryo: Downcasting
        if (catAsAnimal instanceof Cat) {
            //(Cat) catAsAnimal; /*(Cat) catAsAnimal; ifadesi bir tür dönüşümünü gerçekleştirir, ancak sonuç bir değişkene atanmadığı sürece, bu dönüşüm hiçbir anlam ifade etmez ve sadece geçici bir işlem olur Bu yüzden, catAsAnimal nesnesi hala Animal türünde kalır ve meow() gibi Cat’e özgü metotlara erişim sağlanamaz.*/
            Cat cat = (Cat) catAsAnimal;
            cat.meow(); // Cat is meowing
        }
    }
}