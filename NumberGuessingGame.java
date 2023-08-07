import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minNumber = 1;
        int maxNumber = 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int targetNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
            System.out.println("\n number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess the number.");

            int attempts = 0;
            int userGuess;

            while (attempts < maxAttempts) {
                System.out.print("\nEnter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! Your guess is correct.");
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("\nSorry, you've run out of attempts.");
                System.out.println("The correct number was: " + targetNumber);
            }

            System.out.print("\nDo you want to play again? (y/n): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("y")) {
                break;
            }

        } while (true);

        System.out.println("\nGame Over. Your total score is: " + score);
        scanner.close();
    }
}
