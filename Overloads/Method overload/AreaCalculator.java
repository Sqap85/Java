public class AreaCalculator {

    // Metot 1: Karenin alanını hesaplar
    public double calculateArea(int side) {
        return side * side; // Karenin alanı: kenar * kenar
    }

    // Metot 2: Dairenin alanını hesaplar
    public double calculateArea(double radius) {
        return Math.PI * radius * radius; // Dairenin alanı: π * r^2
    }

    // Metot 3: Dikdörtgenin alanını hesaplar
    public double calculateArea(int length, int width) {
        return length * width; // Dikdörtgenin alanı: uzunluk * genişlik
    }
}
