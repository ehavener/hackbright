import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public GuessingGame() {

    }

    public static void main(String[] args){
        System.out.println("Welcome to Guessing Game!");
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        Random rand = new Random();
        int number = rand.nextInt(100);

        while(true) {
            int guess;

            try {
                guess = scanner.nextInt();
            } catch (InputMismatchException e) {
                String invalidInput = scanner.next();
                System.out.println("Please enter a number.");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }

            if (guess == number) {
                System.out.println("You guessed correctly!");
                break;
            } else if (guess < number) {
                System.out.println("Too low.");
            } else if (guess > number) {
                System.out.println("Too high.");
            }
        }
    }
}
