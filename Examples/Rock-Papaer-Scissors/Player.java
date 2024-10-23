public class Player {

    String name;
    Handsing handsing;
    int wins;
    static int draws;
    static int rounds;

    Player(String name) {
        this.name = name;
    }

    public void Win(Player player) {
        player.wins++;
    }

    public void Move(Handsing handsing) {
        this.handsing = handsing;
    }
}