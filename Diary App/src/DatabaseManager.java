import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    // Veritabanı URL'sini sabit olarak tanımlıyoruz
    private static final String DATABASE_URL = "jdbc:sqlite:diary.db";
    private Connection connection;

    // Constructor: DatabaseManager sınıfı oluşturulduğunda otomatik olarak veritabanına bağlanır ve tabloları oluşturur
    public DatabaseManager() {
        connect();  // Veritabanına bağlanmayı başlat
        createTables();  // Tabloları oluştur
    }

    // Veritabanına bağlan
    private void connect() {
        try {
            // SQLite veritabanına bağlantı oluştur
            connection = DriverManager.getConnection(DATABASE_URL);
            System.out.println("Veritabanına bağlanıldı."); // Başarı durumunda mesaj yazdır
        } catch (SQLException e) {
            // Bağlantı sırasında oluşabilecek hataları yakala ve mesaj yazdır
            System.err.println("Veritabanı bağlantı hatası: " + e.getMessage());
        }
    }

    // Veritabanında kullanılacak tabloları oluştur
    private void createTables() {
        // Kullanıcılar tablosunun oluşturulması için SQL sorgusu
        String createUsersTable = """
            CREATE TABLE IF NOT EXISTS users (
                id INTEGER PRIMARY KEY AUTOINCREMENT,  // Otomatik artan birincil anahtar
                username TEXT UNIQUE,  // Kullanıcı adı benzersiz olmalı
                password TEXT  // Şifre alanı
            );
            """;

        // Günlük girdileri tablosunun oluşturulması için SQL sorgusu
        String createDiaryTable = """
            CREATE TABLE IF NOT EXISTS diary_entries (
                id INTEGER PRIMARY KEY AUTOINCREMENT,  // Otomatik artan birincil anahtar
                user_id INTEGER,  // Kullanıcı ID'si, diğer tabloya yabancı anahtar
                title TEXT,  // Günlük başlığı
                content TEXT,  // Günlük içeriği
                date TEXT,  // Tarih bilgisi
                FOREIGN KEY(user_id) REFERENCES users(id)  // Kullanıcılar tablosuna yabancı anahtar
            );
            """;

        try (Statement stmt = connection.createStatement()) {
            // SQL sorgularını çalıştırarak tabloları oluştur
            stmt.execute(createUsersTable);  // Kullanıcılar tablosunu oluştur
            stmt.execute(createDiaryTable);  // Günlük girdileri tablosunu oluştur
            System.out.println("Tablolar başarıyla oluşturuldu."); // Başarı durumunda mesaj yazdır
        } catch (SQLException e) {
            // Tablolar oluşturulurken oluşabilecek hataları yakala ve mesaj yazdır
            System.err.println("Tablolar oluşturulurken hata: " + e.getMessage());
        }
    }

    // Bağlantı nesnesini dışarıya açan getter metodu
    public Connection getConnection() {
        return connection;
    }
}
