import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        icecekFiyatHesaplayici hesaplayici = new icecekFiyatHesaplayici();
        ArrayList<Icecek> icecekler = new ArrayList<>();  // İçecekleri saklayacağımız liste
        int iceceksayisi = 0;

        while (true) {
            try {
                System.out.println("Hangi icecegi istiyorsunuz? (CAY/KAHVE) (cikmak icin -1 gir): ");
                String tipInput = input.next().toUpperCase();  // Kullanıcıdan tip al

                if (tipInput.equals("-1")) {  // Çıkış kontrolü
                    break;
                }

                // Enum türüne çevirme
                icecekTipi tip = icecekTipi.valueOf(tipInput);

                System.out.println("Hangi boy istiyorsunuz? (KUCUK/ORTA/BUYUK): ");
                String boyutInput = input.next().toUpperCase();  // Kullanıcıdan boyut al

                // Enum türüne çevirme
                icecekBoyut boyut = icecekBoyut.valueOf(boyutInput);

                // Yeni içeceği listeye ekle
                Icecek icecek = new Icecek(boyut, tip);
                icecekler.add(icecek);
                System.out.println("İcecek Sayisi:" + (++iceceksayisi));

            } catch (IllegalArgumentException e) {
                System.out.println("Girdiniz hatali, lutfen tekrar deneyin.");
            }
        }

        if (icecekler.isEmpty()) {// liste bos  ise
            System.out.println("Hic Siparis yok!");
            return;
        }

// Tüm siparişlerin listesi
        int count = 1;
        System.out.println("\n   Sipariş Listesi");
        System.out.println("-----------------------------");

        for (Icecek i : icecekler) {
            System.out.printf("%d. İçecek: %s | Boyut: %s%n", count, i.getTipIsim(), i.getBoyutISim());
            System.out.println("-----------------------------");
            count++;
        }

            // Tüm içeceklerin fiyatlarını hesapla ve yazdır
            double toplamFiyat = hesaplayici.fiyatHesapla(icecekler);
            System.out.println("Toplam fiyat: " + toplamFiyat + " TL");

    }
}
