import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Cars> carList = new ArrayList<>(); // Araba nesnelerini saklamak için ArrayList

        while (true) {
            try {
                System.out.println("Özellikleri giriniz (Çıkmak için -1)");

                System.out.println("Year:");
                int year = input.nextInt(); // Kullanıcıdan yıl bilgisi al
                if (year == -1) // Çıkış koşulu
                    break;

                System.out.println("Brand:");
                String brand = input.next(); // Kullanıcıdan marka bilgisi al
                if (brand.equals("-1")) // Çıkış koşulu
                    break;

                // Yeni bir araba oluştur ve listeye ekle
                Cars car = new Cars(year, brand);
                carList.add(car);

            } catch (Exception e) {
                System.out.println("Hata:" + e.getMessage());
                input.nextLine(); // Hatalı girişi temizlemek için kullanılır

            }
        }
        if (!carList.isEmpty()) {
            // Girilen tüm arabaları ekrana yazdırma
            System.out.println("\nGirilen arabalar:");
            for (Cars car : carList) {
                System.out.println(car.getCars()); // Araba bilgilerini yazdır
            }
        } else {
            System.out.println("Hic araba yok!");
        }
    }
}




