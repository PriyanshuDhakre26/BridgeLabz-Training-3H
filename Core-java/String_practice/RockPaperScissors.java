import java.util.*;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "Rock";
        else if (choice == 1) return "Paper";
        else return "Scissors";
    }

    public static String getWinner(String userChoice, String compChoice) {
        if (userChoice.equalsIgnoreCase(compChoice)) {
            return "Draw";
        } else if (
                (userChoice.equalsIgnoreCase("Rock") && compChoice.equals("Scissors")) ||
                        (userChoice.equalsIgnoreCase("Paper") && compChoice.equals("Rock")) ||
                        (userChoice.equalsIgnoreCase("Scissors") && compChoice.equals("Paper"))
        ) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(int playerWins, int compWins, int draws, int totalGames) {
        String[][] stats = new String[3][3];
        stats[0][0] = "Player Wins";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f%%", (playerWins * 100.0 / totalGames));
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f%%", (compWins * 100.0 / totalGames));
        stats[2][0] = "Draws";
        stats[2][1] = String.valueOf(draws);
        stats[2][2] = String.format("%.2f%%", (draws * 100.0 / totalGames));
        return stats;
    }

    public static void displayStats(String[][] stats) {
        System.out.println("\n========= Game Statistics =========");
        System.out.printf("%-15s %-10s %-10s\n", "Result", "Count", "Percentage");
        System.out.println("-----------------------------------");
        for (String[] row : stats) {
            System.out.printf("%-15s %-10s %-10s\n", row[0], row[1], row[2]);
        }
        System.out.println("===================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int playerWins = 0, compWins = 0, draws = 0;
        System.out.print("Enter number of games to play: ");
        int games = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= games; i++) {
            System.out.println("\nGame " + i + ": Choose Rock, Paper, or Scissors");
            String userChoice = sc.nextLine();
            String compChoice = getComputerChoice();
            System.out.println("Computer chose: " + compChoice);
            String winner = getWinner(userChoice, compChoice);
            if (winner.equals("Player")) {
                System.out.println("You Win!");
                playerWins++;
            } else if (winner.equals("Computer")) {
                System.out.println("Computer Wins!");
                compWins++;
            } else {
                System.out.println("It's a Draw!");
                draws++;
            }
        }
        String[][] stats = calculateStats(playerWins, compWins, draws, games);
        displayStats(stats);
        sc.close();
    }
}
