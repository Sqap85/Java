import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Player player = new Player("Player");  // Oyuncuyu oluştur
        GuessingGame game = null;  // Oyunun başlangıcında game'i null yap
        boolean isTrue = false;
        int choice;

        while (true) {
            try {
                // Kullanıcıdan seçim al
                System.out.println("1. Start Game\n2. Exit Game\n3. Show Score");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        // Yeni bir oyun başlat
                        game = new GuessingGame(player);
                        int random = game.getRandom();
                        player.incrementRound();  // Yeni bir round başlatılıyor

                        while (!isTrue) {
                            try {
                                System.out.println("Guess a number (Between 0-100):");
                                int tahmin = input.nextInt();
                                isTrue = game.isTrue(tahmin, random);
                            } catch (IllegalArgumentException e) {
                                System.out.println("Please enter a valid integer number!");
                            } catch (Exception e) {
                                System.out.println("Error: " + e.getMessage());
                                input.nextLine();  // Hatalı input'u temizle
                            }
                        }
                        isTrue = false;  // Yeni oyun için yeniden başlat
                        break;

                    case 2:
                        // Oyundan çıkış
                        System.out.println("Exiting...");
                        return;

                    case 3:
                        // Skoru göster
                        if (game != null) {
                            game.showScore();  // Oyun başlatıldıysa skoru göster
                        } else {
                            System.out.println("Please start a game first.");
                        }
                        break;

                    default:
                        // Geçersiz seçim yapılırsa uyarı ver
                        System.out.println("Please enter a valid choice (1, 2, or 3).");
                }
            } catch (InputMismatchException e) {
                // Eğer kullanıcı sayı yerine geçersiz bir input girerse
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();  // Hatalı input'u temizle
            }
        }
    }
}