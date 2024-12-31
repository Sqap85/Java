import java.time.LocalDate;
import javax.swing.*;
import java.awt.*;

public class DateRangePicker extends JDialog {
    private final JSpinner startDateSpinner; // Başlangıç tarihini seçmek için JSpinner bileşeni
    private final JSpinner endDateSpinner;   // Bitiş tarihini seçmek için JSpinner bileşeni
    private LocalDate startDate;            // Seçilen başlangıç tarihini saklamak için değişken
    private LocalDate endDate;              // Seçilen bitiş tarihini saklamak için değişken
    private boolean confirmed = false;      // Kullanıcının "OK" butonuna basıp basmadığını kontrol eden bayrak

    public DateRangePicker(JFrame parent) {
        // JDialog'u başlat ve özelliklerini ayarla
        super(parent, "Select Date Range", true);
        setLayout(new GridLayout(3, 2));    // 3 satır, 2 sütunlu bir düzen yerleşimi kullan
        setSize(400, 150);                 // Pencere boyutunu ayarla
        setLocationRelativeTo(parent);     // Pencereyi üst pencerenin ortasına hizala

        // Başlangıç tarihi bileşenini ekle
        add(new JLabel("Start Date:"));    // Başlangıç tarihi etiketi
        startDateSpinner = new JSpinner(new SpinnerDateModel()); // Tarih seçimi için spinner oluştur
        startDateSpinner.setEditor(new JSpinner.DateEditor(startDateSpinner, "yyyy-MM-dd")); // Tarih formatını ayarla
        add(startDateSpinner);             // Spinner'ı pencereye ekle

        // Bitiş tarihi bileşenini ekle
        add(new JLabel("End Date:"));      // Bitiş tarihi etiketi
        endDateSpinner = new JSpinner(new SpinnerDateModel());   // Tarih seçimi için spinner oluştur
        endDateSpinner.setEditor(new JSpinner.DateEditor(endDateSpinner, "yyyy-MM-dd")); // Tarih formatını ayarla
        add(endDateSpinner);               // Spinner'ı pencereye ekle

        // "OK" ve "Cancel" butonlarını ekle
        JButton okButton = new JButton("OK");         // "OK" butonu oluştur
        JButton cancelButton = new JButton("Cancel"); // "Cancel" butonu oluştur

        // "OK" butonuna tıklama olayını tanımla
        okButton.addActionListener(e -> {
            // Spinner'daki değerleri "yyyy-MM-dd" formatında al ve LocalDate'e dönüştür
            startDate = LocalDate.parse(new java.text.SimpleDateFormat("yyyy-MM-dd")
                    .format(startDateSpinner.getValue()));
            endDate = LocalDate.parse(new java.text.SimpleDateFormat("yyyy-MM-dd")
                    .format(endDateSpinner.getValue()));
            confirmed = true; // Kullanıcının "OK" butonuna bastığını işaretle
            dispose();        // Diyalog penceresini kapat
        });

        // "Cancel" butonuna tıklama olayını tanımla
        cancelButton.addActionListener(e -> dispose()); // Pencereyi kapat

        // Butonları pencereye ekle
        add(okButton);
        add(cancelButton);
    }

    // Kullanıcının "OK" butonuna basıp basmadığını kontrol eder
    public boolean isConfirmed() {
        return confirmed;
    }

    // Seçilen başlangıç tarihini döndürür
    public LocalDate getStartDate() {
        return startDate;
    }

    // Seçilen bitiş tarihini döndürür
    public LocalDate getEndDate() {
        return endDate;
    }
}