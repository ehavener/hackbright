import java.util.Scanner;

public class GuessingGame {
    public GuessingGame() {


    }

    public static void main(String[] args){
        System.out.println("Welcome to Guessing Game!");
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
