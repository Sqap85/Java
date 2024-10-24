import java.util.Random;

public class GuessingGame {

    Random random = new Random();
    Player player;

    // Constructor
    GuessingGame(Player player){
        this.player = player;
    }

    // Rastgele bir sayı üret
    public int getRandom(){
        return random.nextInt(101); // 0-100 arası rastgele sayı (101 dahil değil)
    }

    // Tahmin kontrol et
    public boolean isTrue(int a, int x){
        if (a == x){
            System.out.println("It's true!");
            player.incrementWin();  // Kazanç sayısını artır
            player.incrementGuess(); // Tahmin sayısını artır
            return true;

        } else if (a < x) {
            System.out.println("Wrong! guess a bigger number!");
            player.incrementGuess(); // Tahmin sayısını artır
            return false;

        } else {
            System.out.println("Wrong! guess a smaller number!");
            player.incrementGuess(); // Tahmin sayısını artır
            return false;
        }
    }

    // Skor göster
    public void showScore() {
        player.showScore();  // Player sınıfındaki skoru gösterme fonksiyonu çağrılır
    }

}