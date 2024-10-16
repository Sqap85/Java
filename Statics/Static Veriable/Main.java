/*
	•	Tüm nesneler tarafından paylaşılır: Aynı sınıfın farklı nesneleri, aynı static değişkeni kullanır.
	•	Sınıfa aittir: Static değişkenler, nesnelere değil sınıfa aittir. Bu yüzden nesne oluşturulmadan da erişilebilir.
	•	Bellekte tek bir kez yer alır: Static değişken bellekte bir kez oluşturulur ve tüm nesneler onu kullanır.

 */
class Araba {
    static int tekerlekSayisi = 4; // Tüm Arabalar için geçerli tek bir değişken

    String model;

    Araba(String model) {
        this.model = model;
    }

    void bilgileriGoster() {
        System.out.println("Model: " + model + ", Tekerlek Sayısı: " + tekerlekSayisi);
    }
}

public class Main {
    public static void main(String[] args) {
        Araba araba1 = new Araba("BMW");
        Araba araba2 = new Araba("Mercedes");

        araba1.bilgileriGoster(); // Model: BMW, Tekerlek Sayısı: 4
        araba2.bilgileriGoster(); // Model: Mercedes, Tekerlek Sayısı: 4

        // Static değişkeni sınıf üzerinden değiştirebiliriz
        Araba.tekerlekSayisi = 6;

        araba1.bilgileriGoster(); // Model: BMW, Tekerlek Sayısı: 6
        araba2.bilgileriGoster(); // Model: Mercedes, Tekerlek Sayısı: 6
    }
}