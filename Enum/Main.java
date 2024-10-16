/*
	• Tip Güvenliği: Enum kullanarak belirli sabit değerleri kısıtlayarak, hatalı değer atamalarını engelleyebilirsiniz.
	• Kodun Okunabilirliği: Enum sabitleri ile kodun ne anlama geldiği daha açık olur.
	• Kolay Kullanım: Enum’lar sabitler ve ilişkili verilerle çalışmayı kolaylaştırır.
 */
public class Main {

    // Enum tanımı
    public enum Pozisyon {
        KALECI,
        DEFANS,
        ORTA_SAHA,
        FORVET
    }

    // Oyuncu sınıfı
    public static class Oyuncu {
        private String isim;
        private Pozisyon pozisyon;

        public Oyuncu(String _isim, Pozisyon _pozisyon) {
            this.isim = _isim;
            this.pozisyon = _pozisyon;
        }

        public void oyuncuBilgileriniYazdir() {
            System.out.println("Oyuncu İsmi: " + isim + ", Pozisyon: " + pozisyon);
        }
    }

    // Ana program
    public static void main(String[] args) {
        Oyuncu oyuncu1 = new Oyuncu("Ali", Pozisyon.KALECI);
        Oyuncu oyuncu2 = new Oyuncu("Ahmet", Pozisyon.DEFANS);
        Oyuncu oyuncu3 = new Oyuncu("Ayşe", Pozisyon.ORTA_SAHA);
        Oyuncu oyuncu4 = new Oyuncu("Fatma", Pozisyon.FORVET);

        oyuncu1.oyuncuBilgileriniYazdir(); // Oyuncu İsmi: Ali, Pozisyon: KALECI
        oyuncu2.oyuncuBilgileriniYazdir(); // Oyuncu İsmi: Ahmet, Pozisyon: DEFANS
        oyuncu3.oyuncuBilgileriniYazdir(); // Oyuncu İsmi: Ayşe, Pozisyon: ORTA_SAHA
        oyuncu4.oyuncuBilgileriniYazdir(); // Oyuncu İsmi: Fatma, Pozisyon: FORVET
    }
}