// Benzinli araç sınıfı (Vehicle interface'ini implement eder)
class Car implements Vehicle {

    // 1. Abstract Method'u implement ediyoruz, her aracın hızlanma yöntemi farklıdır
    @Override
    public void accelerate() {
        System.out.println("The car is accelerating using gasoline.");
    }

    // 2. Default Method'u kullanmak (isteğe bağlı)
    @Override
    public void honk() {
        System.out.println("The car is honking the horn loudly.");
    }

}
