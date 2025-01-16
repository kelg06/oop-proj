import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        long number;
        randomizer randomClass = new randomizer();
        System.out.println("Please enter a number: ");
        number = scanner.nextInt();
        long randomNumber = randomizer.ranNumber(number,rand);
        int tryCount = 0;
        ArrayList<Integer> guesses = new ArrayList<>();
        while(true) {
            System.out.println("Enter your guess between (1-"+ number + ")");
            int playerGuess = scanner.nextInt();
            guesses.add(playerGuess);
            for (int i = 0; i < guesses.size(); i++) {
                System.out.print(guesses.get(i)+ ",");
            }
            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println("Correct! You Win!");
                System.out.println("It took you " + tryCount + " tries");
                break;
            }
            else if(randomNumber > playerGuess) {
                System.out.println("\nNope! The number is higher. Guess again.");
            }
            else {
                System.out.println("\nNope! The number is lower. Guess again.");
            }
        }
        scanner.close();

    }
}