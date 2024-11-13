public class Game {
    Player player1, player2;

    Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void decideWinner(Player player1, Player player2) {
        Handsign p1Move = player1.handsign;
        Handsign p2Move = player2.handsign;

        if (p1Move == p2Move) {
            System.out.println("It's a draw!");
            Player.draws++;
        } else if ((p1Move == Handsign.ROCK && p2Move == Handsign.SCISSORS) ||
                (p1Move == Handsign.PAPER && p2Move == Handsign.ROCK) ||
                (p1Move == Handsign.SCISSORS && p2Move == Handsign.PAPER)) {
            System.out.println(player1.name + " wins this round!");
            player1.win();
        } else {
            System.out.println(player2.name + " wins this round!");
            player2.win();
        }

        Player.rounds++;
    }

    public Handsign convertInputToHand(String input) {
        switch (input) {
            case "r": return Handsign.ROCK;
            case "p": return Handsign.PAPER;
            case "s": return Handsign.SCISSORS;
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
