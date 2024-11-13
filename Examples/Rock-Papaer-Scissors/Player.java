public class Player {

    String name;
    Handsign handsign;
    int wins;
    static int draws;
    static int rounds;

    Player(String name) {
        this.name = name;
    }

    public void win() {
        this.wins++;
    }

    public void move(Handsign handsign) {
        this.handsign = handsign;
    }
}
