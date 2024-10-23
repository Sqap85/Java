import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Game game = new Game(player1, player2);

        System.out.println("Welcome to Rock, Paper, Scissors Game!");

        boolean gameActive = true;  // Oyunun aktif olup olmadığını kontrol eden flag

        do {
            // Player 1'in hamlesini al
            System.out.println(player1.name + ", choose your move: r (rock), p (paper), s (scissors), q (quit)");
            String player1Move = input.next().toLowerCase();

            if (player1Move.equals("q")) {
                System.out.println("Exiting game...");
                gameActive = false;  // Oyunu sonlandır
                break; // Ana döngüden çık
            }

            if (!isValidMove(player1Move)) {
                System.out.println("Invalid input! Please try again.");
                continue; // Geçersizse tekrar dene
            }

            // Player 2'nin hamlesini al ve doğru olup olmadığını kontrol et
            String player2Move;
            while (true) {
                System.out.println(player2.name + ", choose your move: r (rock), p (paper), s (scissors), q (quit)");
                player2Move = input.next().toLowerCase();

                if (player2Move.equals("q")) {
                    System.out.println("Exiting game...");
                    gameActive = false;  // Oyunu sonlandır
                    break; // Döngüden çık
                }

                if (isValidMove(player2Move)) {
                    break; // Geçerli hamle girildiyse döngüden çık
                } else {
                    System.out.println("Invalid input! Please try again.");
                }
            }

            // Eğer Player 2 oyunu terk ettiyse, dışarı çık
           if (!gameActive) {
                break;
            }

            // Player moves
            player1.Move(game.convertInputToHand(player1Move));
            player2.Move(game.convertInputToHand(player2Move));

            // Show the moves
            System.out.println(player1.name + " chose " + player1.handsing);
            System.out.println(player2.name + " chose " + player2.handsing);

            // Decide winner
            game.decideWinner(player1, player2);

        } while (gameActive);

        // Skorları oyunun sonunda göster
        game.showFinalScores();
        input.close();
    }

    private static boolean isValidMove(String move) {
        return move.equals("r") || move.equals("p") || move.equals("s");
    }
}