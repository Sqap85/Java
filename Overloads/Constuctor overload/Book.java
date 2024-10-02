public class Book {
    private String title;
    private String author;
    private double price;

    // İlk constructor: Başlık, yazar ve fiyat alır
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // İkinci constructor: Başlık ve yazar alır, fiyat varsayılan olarak 0.0 olur
    public Book(String title, String author) {
        this(title, author, 0.0); // Diğer constructor'ı çağırarak varsayılan fiyat atama
    }

    // Üçüncü constructor: Sadece başlık alır, yazar varsayılan olarak "Bilinmeyen" ve fiyat 0.0 olur
    public Book(String title) {
        this(title, "Bilinmeyen", 0.0); // Diğer constructor'ı çağırarak varsayılan yazar ve fiyat atama
    }

    // Metot: Kitap bilgilerini göster
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + (int) price + "$");
    }
}