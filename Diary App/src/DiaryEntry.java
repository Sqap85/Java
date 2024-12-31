import java.time.LocalDate;

public class DiaryEntry {
    // Günlük girişi bilgilerini tutan sınıf

    // Günlük girişinin benzersiz ID'si
    private int entryID;

    // Günlük başlığı
    private String title;

    // Günlük içeriği
    private String content;

    // Günlük tarih bilgisi
    private LocalDate date;

    // Constructor: Günlük giriş nesnesi oluşturur
    public DiaryEntry(int entryID, String title, String content, LocalDate date) {
        this.entryID = entryID; // ID atanır
        this.title = title; // Başlık atanır
        this.content = content; // İçerik atanır
        this.date = date; // Tarih atanır
    }

    // Getter ve setter metodları: Alanlara erişim ve düzenleme sağlar
    public int getEntryID() {
        return entryID;
    }

    public void setEntryID(int entryID) {
        this.entryID = entryID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    // toString metodu: Günlük girişini okunabilir bir formatta döner
    @Override
    public String toString() {
        return "ID: " + entryID + ", Title: " + title + ", Date: " + date + "\nContent: " + content;
    }
}
