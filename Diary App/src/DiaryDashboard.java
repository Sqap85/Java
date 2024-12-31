import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.List;

public class DiaryDashboard extends JFrame {
    // Günlük yönetim nesnesi ve günlük listesini tutacak model tanımlanır
    private final DiaryManager manager;
    private final DefaultListModel<String> diaryListModel;

    // Constructor: Günlük panosu GUI'si oluşturulur
    public DiaryDashboard(DiaryManager manager) {
        this.manager = manager; // Günlük yönetim nesnesi atanır
        setTitle("Personal Diary - Dashboard"); // Pencere başlığı belirlenir
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Çıkış işlemi belirlenir
        setSize(600, 400); // Pencere boyutu ayarlanır
        setLocationRelativeTo(null); // Pencere ortalanır

        setLayout(new BorderLayout()); // Ana düzen belirlenir

        diaryListModel = new DefaultListModel<>(); // Günlük listesi modeli oluşturulur
        updateDiaryList(); // Liste güncellenir

        JList<String> diaryList = new JList<>(diaryListModel); // Günlük listesi oluşturulur
        JScrollPane scrollPane = new JScrollPane(diaryList); // Liste kaydırılabilir yapılır

        // Düğmeler tanımlanır
        JButton addButton = new JButton("Add Entry");
        JButton viewButton = new JButton("View Entries");
        JButton updateButton = new JButton("Update Entry");
        JButton deleteButton = new JButton("Delete Entry");
        JButton logoutButton = new JButton("Logout");

        // Düğmeler bir panele eklenir
        JPanel buttonPanel = new JPanel(new GridLayout(5, 1));
        buttonPanel.add(addButton);
        buttonPanel.add(viewButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(logoutButton);

        // Bileşenler yerleştirilir
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.EAST);

        // Günlük ekleme işlemi
        addButton.addActionListener(e -> {
            while (true) {
                // Kullanıcıdan başlık alınır
                String title = JOptionPane.showInputDialog(this, "Entry Title:");
                if (title == null) break; // Kullanıcı işlemi iptal etti
                if (title.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Title cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    continue;
                }

                while (true) {
                    // Kullanıcıdan içerik alınır
                    String content = JOptionPane.showInputDialog(this, "Entry Content:");
                    if (content == null) break; // Kullanıcı işlemi iptal etti
                    if (content.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Content cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }

                    // Başlık ve içerik doğru ise giriş eklenir
                    manager.addEntry(title, content);
                    updateDiaryList(); // Liste güncellenir
                    return;
                }
            }
        });

        // Günlükleri görüntüleme işlemi
        viewButton.addActionListener(e -> {
            String[] options = {"Filter by Date", "View All", "Search by Title"};
            int choice = JOptionPane.showOptionDialog(
                    this,
                    "How would you like to view the entries?",
                    "View Entries",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            switch (choice) {
                case 0: // Tarihe göre filtreleme
                    DateRangePicker datePicker = new DateRangePicker(this);
                    datePicker.setVisible(true);

                    if (datePicker.isConfirmed()) {
                        LocalDate startDate = datePicker.getStartDate();
                        LocalDate endDate = datePicker.getEndDate();

                        List<String> entries = manager.viewEntries(startDate, endDate);
                        diaryListModel.clear();
                        if (entries.isEmpty()) {
                            JOptionPane.showMessageDialog(this, "No entries found for the selected date range.");
                        } else {
                            entries.forEach(diaryListModel::addElement);
                        }
                    }
                    break;

                case 1: // Tüm girişleri görüntüle
                    List<String> allEntries = manager.viewEntries(LocalDate.MIN, LocalDate.now());
                    diaryListModel.clear();
                    if (allEntries.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "No entries found.");
                    } else {
                        allEntries.forEach(diaryListModel::addElement);
                    }
                    break;

                case 2: // Başlığa göre arama
                    String title = JOptionPane.showInputDialog(this, "Enter the title to search:");
                    if (title != null && !title.trim().isEmpty()) {
                        List<String> matchingEntries = manager.searchEntriesByTitle(title);
                        diaryListModel.clear();
                        if (matchingEntries.isEmpty()) {
                            JOptionPane.showMessageDialog(this, "No entries found with the given title.");
                        } else {
                            matchingEntries.forEach(diaryListModel::addElement);
                        }
                    }
                    break;

                default: // Kullanıcı iptal etti
                    break;
            }
        });

        // Günlük güncelleme işlemi
        updateButton.addActionListener(e -> {
            int selectedIndex = diaryList.getSelectedIndex();
            if (selectedIndex >= 0) {
                List<DiaryEntry> entries = manager.getEntries();
                DiaryEntry selectedEntry = entries.get(selectedIndex);

                String newTitle = JOptionPane.showInputDialog(this, "New Title:", selectedEntry.getTitle());
                if (newTitle == null || newTitle.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Title cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String newContent = JOptionPane.showInputDialog(this, "New Content:", selectedEntry.getContent());
                if (newContent == null || newContent.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Content cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                manager.updateEntry(selectedEntry.getEntryID(), newTitle, newContent);
                updateDiaryList(); // Liste güncellenir
            } else {
                JOptionPane.showMessageDialog(this, "No entry selected! Please select an entry to update.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        });

        // Günlük silme işlemi
        deleteButton.addActionListener(e -> {
            int selectedIndex = diaryList.getSelectedIndex();
            if (selectedIndex >= 0) {
                int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this entry?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    List<DiaryEntry> entries = manager.getEntries();
                    DiaryEntry entryToDelete = entries.get(selectedIndex);
                    manager.deleteEntry(entryToDelete.getEntryID());
                    updateDiaryList(); // Liste güncellenir
                }
            } else {
                JOptionPane.showMessageDialog(this, "No entry selected! Please select an entry to delete.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        });

        // Çıkış yapma işlemi
        logoutButton.addActionListener(e -> {
            manager.logout();
            LoginScreen loginScreen = new LoginScreen(manager);
            loginScreen.setVisible(true);
            this.dispose(); // Mevcut pencere kapatılır
        });
    }

    // Günlük listesini günceller
    private void updateDiaryList() {
        List<String> entries = manager.viewEntries(LocalDate.now().minusDays(30), LocalDate.now());
        diaryListModel.clear();
        entries.forEach(diaryListModel::addElement);
    }
}
