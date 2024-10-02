public class main {
    public static void main(String[] args) {
        // İlk constructor kullanılarak kitap nesnesi oluşturma
        Book book1 = new Book("Java Programming", "John Doe", 29.99);
        book1.displayInfo();

        // İkinci constructor kullanılarak kitap nesnesi oluşturma
        Book book2 = new Book("Python Programming", "Jane Smith");
        book2.displayInfo();

        // Üçüncü constructor kullanılarak kitap nesnesi oluşturma
        Book book3 = new Book("C++ Programming");
        book3.displayInfo();
    }
}