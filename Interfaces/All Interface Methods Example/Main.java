public class Main {
    public static void main(String[] args) {

        // Benzinli araç oluşturuluyor
        Vehicle myCar = new Car();
        myCar.accelerate(); // "The car is accelerating using gasoline."
        myCar.honk();       // "The car is honking the horn loudly."

        // Elektrikli araç oluşturuluyor
        Vehicle myElectricCar = new ElectricCar();
        myElectricCar.accelerate(); // "The electric car is accelerating silently."
        myElectricCar.honk();       // The vehicle is honking.(default method) || "The electric car is honking softly."

        // Static metodu çağırma
        Vehicle.checkEngine(); // "Checking the engine of the vehicle."

        // Private metotları dışarıdan çağırmak mümkün değil
        // myCar.startEngine();  // HATA: private method
        // Vehicle.performMaintenance();  // HATA: private static method
    }
}
