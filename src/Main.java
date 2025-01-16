import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Please enter a number: ");
        number = scanner.nextInt();
        int randomNumber = rand.nextInt(number) + 1;
        System.out.println(randomNumber);
        int tryCount = 0;
        while(true) {
            System.out.println("Enter your guess (1-"+ number + ")");

            int playerGuess = scanner.nextInt();
            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println("Correct! You Win!");
                System.out.println("It took you " + tryCount + " tries");
                break;
            }
            else if(randomNumber > playerGuess) {
                System.out.println("Nope! The number is higher. Guess again.");
            }
            else {
                System.out.println("Nope! The number is lower. Guess again.");
            }
        }


        scanner.close();

    }
}