import javax.swing.*;
import java.awt.*;

public class LoginScreen extends JFrame {
    private final DiaryManager manager;

    public LoginScreen(DiaryManager manager) {
        this.manager = manager;
        setTitle("Personal Diary - Login"); // Pencere başlığı ayarlanıyor
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Pencere kapatıldığında uygulama sonlanacak
        setSize(400, 300); // Pencere boyutu ayarlanıyor
        setLocationRelativeTo(null); // Pencere ekranın ortasına yerleştiriliyor

        // Login Panel oluşturuluyor ve düzenleniyor
        JPanel panel = new JPanel(new GridLayout(4, 2)); // 4 satır, 2 sütunlu bir ızgara düzeni
        JLabel userLabel = new JLabel(" Username:"); // Kullanıcı adı etiketi
        JLabel passLabel = new JLabel(" Password:"); // Şifre etiketi
        JTextField usernameField = new JTextField(); // Kullanıcı adı girişi için metin alanı
        JPasswordField passwordField = new JPasswordField(); // Şifre girişi için parola alanı
        JCheckBox showPasswordCheckBox = new JCheckBox("Show Password"); // Şifre gösterme seçeneği
        JButton loginButton = new JButton("Login"); // Giriş butonu
        JButton registerButton = new JButton("Register"); // Kayıt ol butonu

        // Bileşenler panele ekleniyor
        panel.add(userLabel);
        panel.add(usernameField);
        panel.add(passLabel);
        panel.add(passwordField);
        panel.add(showPasswordCheckBox); // Şifre gösterme kutusu
        panel.add(new JLabel()); // Layout düzeni için boş bir alan
        panel.add(loginButton);
        panel.add(registerButton);
        add(panel); // Panel pencereye ekleniyor

        // Şifre gösterme kutusu seçildiğinde şifreyi göster/gizle
        showPasswordCheckBox.addActionListener(e -> {
            if (showPasswordCheckBox.isSelected()) {
                passwordField.setEchoChar((char) 0); // Şifre maskesi kaldırılıyor
            } else {
                passwordField.setEchoChar('•'); // Şifre maskesi geri konuluyor
            }
        });

        // Login işlemi
        loginButton.addActionListener(e -> {
            String username = usernameField.getText(); // Kullanıcı adı metni alınıyor
            String password = new String(passwordField.getPassword()); // Şifre alınıyor

            if (username.isEmpty() || password.isEmpty()) { // Alanlar boşsa hata mesajı
                JOptionPane.showMessageDialog(this, "Username or Password cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (username.contains(" ") || password.contains(" ")) { // Alanlarda boşluk varsa hata mesajı
                JOptionPane.showMessageDialog(this, "Username or Password cannot contain spaces.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (manager.login(username, password)) { // Giriş başarılıysa dashboard açılıyor
                    JOptionPane.showMessageDialog(this, "Login Successful!");
                    openDiaryDashboard(); // Dashboard ekranına geçiş
                } else { // Giriş başarısızsa hata mesajı
                    JOptionPane.showMessageDialog(this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Register işlemi
        registerButton.addActionListener(e -> {
            String username = usernameField.getText(); // Kullanıcı adı metni alınıyor
            String password = new String(passwordField.getPassword()); // Şifre alınıyor

            if (username.isEmpty() || password.isEmpty()) { // Alanlar boşsa hata mesajı
                JOptionPane.showMessageDialog(this, "Username or Password cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (username.contains(" ") || password.contains(" ")) { // Alanlarda boşluk varsa hata mesajı
                JOptionPane.showMessageDialog(this, "Username or Password cannot contain spaces.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (manager.register(username, password)) { // Kayıt başarılıysa bilgilendirme
                    JOptionPane.showMessageDialog(this, "Registration Successful! Please log in.");
                    usernameField.setText(""); // Kullanıcı adı alanı temizleniyor
                    passwordField.setText(""); // Şifre alanı temizleniyor
                } else { // Kayıt başarısızsa hata mesajı
                    JOptionPane.showMessageDialog(this, "Username already exists.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Başarılı giriş yapıldığında dashboard ekranı açılıyor
    private void openDiaryDashboard() {
        DiaryDashboard dashboard = new DiaryDashboard(manager); // Dashboard nesnesi oluşturuluyor
        dashboard.setVisible(true); // Dashboard görünür yapılıyor
        this.dispose(); // Login ekranı kapatılıyor
    }
}
