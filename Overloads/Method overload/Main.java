public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Kare alanı hesaplama
        System.out.println("Kare Alanı (5): " + calculator.calculateArea(5));

        // Daire alanı hesaplama
        System.out.println("Daire Alanı (3.5): " + calculator.calculateArea(3.5));

        // Dikdörtgen alanı hesaplama
        System.out.println("Dikdörtgen Alanı (4, 6): " + calculator.calculateArea(4, 6));
    }
}