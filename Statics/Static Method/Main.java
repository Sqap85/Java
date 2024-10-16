/*
	•	Sınıfa aittir: Nesneye bağlı değildir, sınıf üzerinden çağrılır.
	•	Sadece static üyeleri kullanabilir: Static olmayan değişkenler ve yöntemler doğrudan kullanılamaz.
	•	Nesne oluşturmaya gerek yoktur: Static yöntemler, sınıf adı üzerinden çağrılabilir.
 */
class Hesaplama {
    static int kareAl(int sayi) {
        return sayi * sayi;
    }
}

public class Main {
    public static void main(String[] args) {
        // Static yöntemi sınıf adı ile çağırıyoruz, nesne oluşturmaya gerek yok
        int sonuc = Hesaplama.kareAl(5);
        System.out.println("Sonuç: " + sonuc); // Sonuç: 25
    }
}