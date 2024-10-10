package Lab1;
import java.util.Scanner;
public class Task4Lab1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number one ");
        int numberOne=sc.nextInt();
        System.out.println("Enter number two ");
        int numberTwo=sc.nextInt();
        int sum= numberOne + numberTwo;
        System.out.println("The sum of your numbers is "+sum);
    }
}
