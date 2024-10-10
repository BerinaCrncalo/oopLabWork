package Lab2;

import java.util.Scanner;

public class Task3Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter numbers to sum. Enter 0 to stop:");
        number = scanner.nextInt();

        while (number != 0) {
            sum += number;
            number = scanner.nextInt();
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}
