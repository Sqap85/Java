public class Example {
    // Static variable
    static int staticVar = 10;

    // Non-static variable
    int nonStaticVar = 20;

    // Static method
    public static void staticMethod() {
        // Static method can access static variables
        System.out.println("Static variable: " + staticVar);

        // Static method cannot directly access non-static variables
        // System.out.println("Non-static variable: " + nonStaticVar); // Bu hata verir!

        // Non-static variables can be accessed through an instance of the class
        Example example = new Example();
        System.out.println("Non-static variable through instance: " + example.nonStaticVar);
    }

    // Non-static method
    public void nonStaticMethod() {
        // Non-static method can access both static and non-static variables
        System.out.println("Static variable: " + staticVar);
        System.out.println("Non-static variable: " + nonStaticVar);
    }

    public static void main(String[] args) {

        // Call the static method without creating an instance
        Example.staticMethod();

        // staticMethod(); // Alternatif olarak, doğrudan da çağrılabilir (aynı sınıf içindeyken)

        // Create an instance to call the non-static method
        Example exampleInstance = new Example();
        exampleInstance.nonStaticMethod();
    }
}
