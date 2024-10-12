
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan kaç araba gireceğini alalım
        System.out.print("Kaç araba gireceksiniz? ");
        int n = input.nextInt();
        input.nextLine(); // Bu satır, nextInt() sonrası kalan satırı temizler

        // Araba bilgilerini saklamak için bir dizi oluştur
        Cars[] carArray = new Cars[n];

        for (int i = 0; i < n; i++) {
            try {
                System.out.println("\nÖzellikleri giriniz (Araba " + (i + 1) + "):");

                System.out.print("Year: ");
                int year = input.nextInt();

                System.out.print("Brand: ");
                String brand = input.next();

                // Yeni bir araba oluştur ve diziye ekle
                carArray[i] = new Cars(year, brand);


            } catch (Exception e) {
                System.out.println("Beklenmedik bir hata oluştu: " + e.getMessage());
                i--;
                input.nextLine(); // Genel hata için de giriş akışını temizle
            }
        }


        // Girilen tüm arabaları ekrana yazdırma
        System.out.println("\nGirilen arabalar:");
        for (Cars car : carArray) {
            System.out.println(car.getCars()); // Araba bilgilerini yazdır
        }
    }
}
