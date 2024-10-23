public class Game {
    Player player1, player2;

    Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void decideWinner(Player player1, Player player2) {
        Handsing p1Move = player1.handsing;
        Handsing p2Move = player2.handsing;

        if (p1Move == p2Move) {
            System.out.println("It's a draw!");
            Player.draws++;
        } else if ((p1Move == Handsing.ROCK && p2Move == Handsing.SCISSORS) ||
                (p1Move == Handsing.PAPER && p2Move == Handsing.ROCK) ||
                (p1Move == Handsing.SCISSORS && p2Move == Handsing.PAPER)) {
            System.out.println(player1.name + " wins this round!");
            player1.Win(player1);
        } else {
            System.out.println(player2.name + " wins this round!");
            player2.Win(player2);
        }

        Player.rounds++;
    }

    public Handsing convertInputToHand(String input) {
        switch (input) {
            case "r": return Handsing.ROCK;
            case "p": return Handsing.PAPER;
            case "s": return Handsing.SCISSORS;
            default: return null; // This shouldn't happen with valid input
        }
    }

    public void showFinalScores() {
        System.out.println("Final Scores:");
        System.out.println(player1.name + " wins: " + player1.wins);
        System.out.println(player2.name + " wins: " + player2.wins);
        System.out.println("Draws: " + Player.draws);
        System.out.println("Rounds played: " + Player.rounds);
    }
}