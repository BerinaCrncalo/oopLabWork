package Lab2;

import java.util.Scanner;

public class Task10Lab2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int targetNumber = -1;
        while (targetNumber < 0 || targetNumber > 100) {
            System.out.print("Enter number between 0 and 100: ");
            targetNumber = sc.nextInt();

            if (targetNumber < 0 || targetNumber > 100) {
                System.out.println("Invalid number! Enter between 0 and 100.");
            }
        }

        int guess;
        int guessCount = 0;

        do {
            System.out.print("Guess number: ");
            guess = sc.nextInt();

            if (guess < 0 || guess > 100) {
                System.out.println("Invalid guess! Enter number between 0 and 100.");
                continue;
            }

            guessCount++;

            if (guess < targetNumber) {
                System.out.println("Number is larger.");
            } else if (guess > targetNumber) {
                System.out.println("Number is smaller.");
            } else {
                System.out.println("Congratulations, guess is correct!");
            }

            System.out.println("Number of guesses: " + guessCount);

        } while (guess != targetNumber);
    }
}
