import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        icecekFiyatHesaplayici hesaplayici = new icecekFiyatHesaplayici();
        ArrayList<Musteri> musteriler = new ArrayList<>(); // Müşteri listesi

        while (true) {
            try {
                // Müşteri ismini al
                System.out.println("İsminizi giriniz (çıkmak için -1 gir):");
                String isim = input.next();

                if (isim.equals("-1")) {  // Çıkış kontrolü
                    break;
                }

                // Yeni müşteri oluştur
                Musteri musteri = new Musteri(isim);

                // Müşteri için sipariş alma döngüsü
                while (true) {
                    System.out.println("Hangi içeceği istiyorsunuz? (CAY/KAHVE) (çıkmak için -1 gir): ");
                    String tipInput = input.next().toUpperCase();  // Kullanıcıdan tip al

                    if (tipInput.equals("-1")) {  // Sipariş alımını bitir
                        break;
                    }

                    // Enum türüne çevirme
                    icecekTipi tip = icecekTipi.valueOf(tipInput);

                    System.out.println("Hangi boy istiyorsunuz? (KUCUK/ORTA/BUYUK): ");
                    String boyutInput = input.next().toUpperCase();  // Kullanıcıdan boyut al

                    // Enum türüne çevirme
                    icecekBoyut boyut = icecekBoyut.valueOf(boyutInput);

                    // Yeni içeceği müşterinin siparişlerine ekle
                    Icecek icecek = new Icecek(boyut, tip);
                    musteri.siparisEkle(icecek);

                }

                // Müşteriyi listeye ekle
                musteriler.add(musteri);

            } catch (IllegalArgumentException e) {
                System.out.println("Girdiniz hatalı, lütfen tekrar deneyin.");
            } catch (Exception e) {
                System.out.println("Hata: " + e.getMessage());
                input.nextLine();
            }
        }

        if (musteriler.isEmpty()) { // Müşteri listesi boşsa
            System.out.println("Hiç sipariş yok!");
            return;
        }

        // Tüm müşterilerin sipariş listesini göster
        System.out.println("\nTüm Müşterilerin Sipariş Listesi");
        System.out.println("-----------------------------");

        for (Musteri musteri : musteriler) {
            System.out.println("Müşteri: " + musteri.getIsim());
            int count = 1;
            if (musteri.getSiparisler().isEmpty()){
                System.out.println("Siparis Vermedi!");}
            else {
                for (Icecek i : musteri.getSiparisler()) {
                    System.out.printf("%d. İçecek: %s | Boyut: %s\n", count, i.getTipIsim(), i.getBoyutIsim());
                    count++;
                }
                // siparişlerin fiyatlarını hesapla ve yazdır
                double toplamFiyat = 0;
                toplamFiyat += hesaplayici.fiyatHesapla(musteri.getSiparisler());
                System.out.println("Toplam fiyat: " + toplamFiyat + " TL");
            }
                System.out.println("-----------------------------");

        }
    }
}
