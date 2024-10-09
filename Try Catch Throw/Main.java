import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberOperations operations = new NumberOperations();

        int numerator = 0;
        int denominator = 0;

        // Kullanıcıdan pay ve payda alma
        try {
            System.out.print("Bölmek için payı girin: ");
            numerator = scanner.nextInt(); // Payı al
            System.out.print("Bölmek için paydası girin: ");
            denominator = scanner.nextInt(); // Paydayı al

            // Bölme işlemi
            double result = operations.divide(numerator, denominator);
            System.out.println("Sonuç: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Hata: Lütfen geçerli bir tamsayı girin."); // Geçersiz giriş hatası
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // Sıfıra bölme hatası
        } catch (Exception e) {
            System.out.println("Bir hata oluştu: " + e.getMessage()); // Diğer hatalar
        } finally {
            scanner.close(); // Kaynakları kapatma
            System.out.println("Program sona erdi.");
        }
    }
}