import java.util.Scanner;

public class HighLow {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int secretNumber = (int) (Math.random() * 100) + 1;
            int guess = 0;
            int numGuesses = 0;
            boolean gameOver = false;

            System.out.println("Welcome to the High-Low guessing game!");
            System.out.println("I'm thinking of a number between 1 and 100.");

            while(!gameOver) {
                System.out.print("Enter your guess: ");
                if(scanner.hasNextInt()) {
                    guess = scanner.nextInt();
                    numGuesses++;
                    if(guess < 1 || guess > 100) {
                        System.out.println("Your guess is out of range. Please enter a number between 1 and 100.");
                    } else if(guess < secretNumber) {
                        System.out.println("HIGHER");
                    } else if(guess > secretNumber) {
                        System.out.println("LOWER");
                    } else {
                        System.out.println("GOOD GUESS!");
                        gameOver = true;
                    }
                    if(numGuesses >= 10 && !gameOver) {
                        System.out.println("Sorry, you ran out of guesses. The number was " + secretNumber);
                        gameOver = true;
                    }
                } else {
                    String input = scanner.next();
                    System.out.println("Invalid input. Please enter a number between 1 and 100.");
                }
            }

            scanner.close();
        }

    }
