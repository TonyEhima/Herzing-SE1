package net.RockPaperScissors.java; // Define the package aligned with project structure requirements

import java.util.Scanner; // Import Scanner class for input operations

public class Main {

    public static void main(String[] args) {
        // Initialize scanner object for reading user input
        Scanner scanner = new Scanner(System.in);
        // Variables to keep track of scores for Player 1 and Player 2
        int playerOneScore = 0, playerTwoScore = 0;
        // Variables to store choices of Player 1 and Player 2
        String playerOneChoice, playerTwoChoice;
        // Variable to control the game continuation loop
        String continueGame;

        do {
            // Prompt Player 1 for their choice
            System.out.println("Player 1, enter rock, paper, or scissors:");
            playerOneChoice = scanner.nextLine().toLowerCase();
            // Prompt Player 2 for their choice
            System.out.println("Player 2, enter rock, paper, or scissors:");
            playerTwoChoice = scanner.nextLine().toLowerCase();

            // Evaluate the choices to determine the round winner
            if (playerOneChoice.equals(playerTwoChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerOneChoice.equals("rock") && playerTwoChoice.equals("scissors")) ||
                       (playerOneChoice.equals("scissors") && playerTwoChoice.equals("paper")) ||
                       (playerOneChoice.equals("paper") && playerTwoChoice.equals("rock"))) {
                System.out.println("Player 1 wins this round!");
                playerOneScore++; // Increment score for Player 1
            } else {
                System.out.println("Player 2 wins this round!");
                playerTwoScore++; // Increment score for Player 2
            }

            // Ask if players want to continue or stop
            System.out.println("Do you want to continue playing? (y/n)");
            continueGame = scanner.nextLine();
        } while (continueGame.equalsIgnoreCase("y")); // Continue as long as players respond with 'y'

        // Output the final scores
        System.out.println("Final Scores - Player 1: " + playerOneScore + ", Player 2: " + playerTwoScore);
        scanner.close(); // Close the scanner resource to prevent memory leak
    }
}
