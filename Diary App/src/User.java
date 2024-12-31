import java.io.Serializable;

// Kullanıcı bilgilerini tutmak için kullanılan User sınıfı
// Bu sınıf Serializable arayüzünü implemente ediyor, böylece kullanıcı nesneleri serileştirilebilir
public class User implements Serializable {
    private String username; // Kullanıcının kullanıcı adı
    private String password; // Kullanıcının şifresi

    // User sınıfı için constructor (yapıcı metod)
    // Yeni bir kullanıcı nesnesi oluştururken kullanıcı adı ve şifre belirtilir
    public User(String username, String password) {
        this.username = username; // Kullanıcı adı atanıyor
        this.password = password; // Şifre atanıyor
    }

    // Kullanıcının kullanıcı adını döndürür
    public String getUsername() {
        return username;
    }

    // Kullanıcı şifresinin doğru olup olmadığını kontrol eder
    // Parametre olarak verilen şifre ile mevcut şifreyi karşılaştırır
    public boolean validatePassword(String password) {
        return this.password.equals(password); // Şifreler eşleşirse true döner
    }
}
