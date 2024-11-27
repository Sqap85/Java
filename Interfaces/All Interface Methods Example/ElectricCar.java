// Elektrikli araç sınıfı (Vehicle interface'ini implement eder)
class ElectricCar implements Vehicle {

    // 1. Abstract Method'u implement ediyoruz, elektrikli araç hızlanması farklıdır
    @Override
    public void accelerate() {
        System.out.println("The electric car is accelerating silently.");
    }

//    // 2. Default Method'u kullanmak (isteğe bağlı)
//    public void honk() {
//        System.out.println("The electric car is honking softly.");
//    }
}
