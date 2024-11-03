//toString() metodunu kullanarak nesnelerinizi daha anlamlı bir şekilde temsil edebilir ve debug sürecinde faydalı bilgiler elde edebilirsiniz.
class Kitap {
    private String ad;
    private String yazar;
    private int yil;

    public Kitap(String ad, String yazar, int yil) {
        this.ad = ad;
        this.yazar = yazar;
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "Kitap Adı: " + this.ad + ", Yazar: " + this.yazar + ", Yıl: " + this.yil;
    }
}

public class Main {
    public static void main(String[] args) {
        Kitap kitap = new Kitap("Küçük Prens", "Antoine de Saint-Exupéry", 1943);
        System.out.println(kitap); // veya kitap.toString();
    }
}
