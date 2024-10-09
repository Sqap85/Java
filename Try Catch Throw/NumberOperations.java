public class NumberOperations {

    // Sayı bölme metodu
    public double divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Hata: Sıfıra bölme yapılamaz."); // Sıfıra bölme hatası
        }
        return (double) numerator / denominator; // Bölme işlemi
    }
}