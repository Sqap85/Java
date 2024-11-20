// Aynı isimli metodların, farklı parametreler veya dönüş türleri ile tanımlanmasıdır.
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));         // int version
        System.out.println(calc.add(2.5, 3.5));    // double version
    }
}