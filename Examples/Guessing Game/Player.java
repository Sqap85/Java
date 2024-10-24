public class Player {

    private String name;
    int round;  // Her oyuncu için farklı round sayısı
    int guess;
    int win;

    // Constructor
    Player(String name){
        this.name = name;
        this.win = 0;
        this.guess = 0;
        this.round = 0;  // Yeni oyuncu başladığında round sıfırlanır
    }

    // Getter metodu
    public String getName() {
        return name;
    }

    // Kazanç sayısını artır
    public void incrementWin() {
        this.win++;
    }

    // Tahmin sayısını artır
    public void incrementGuess() {
        this.guess++;
    }

    // Round sayısını artır
    public void incrementRound() {
        this.round++;
    }

    // Skoru göster
    public void showScore() {
        System.out.println("Player: " + name);
        System.out.println("Wins: " + win);
        System.out.println("Played Rounds: " + round);
        System.out.println("Total Guesses: " + guess);
    }
}