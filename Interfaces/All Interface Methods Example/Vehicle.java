// Araç interface'i
interface Vehicle {

    // 1. Abstract Method (Gövdesiz, her aracın hızlanma yöntemi farklı olabilir)
    void accelerate();

    // 2. Default Method (Her araç için aynı olan bir işlev)
    default void honk() {
        System.out.println("The vehicle is honking.(default method)");
    }

    // 3. Static Method (Araçların ortak bir sınıf özelliği)
    // Static methodlar Java'da override edilemez
    static void checkEngine() {
        System.out.println("Checking the engine of the vehicle.");
    }

    // 4. Private Method (Yardımcı bir işlev, sadece interface içinde kullanılabilir)
    // Override edilemez!
    private void startEngine() {
        System.out.println("The engine is starting.");
    }

    // 5. Private Static Method (Sadece interface içinde, sınıf seviyesinde bir işlev)
    // Override edilemez!
    private static void performMaintenance() {
        System.out.println("Performing routine maintenance on the vehicle.");
    }
}
