package Lab2;

import java.util.Scanner;

public class Task2Lab2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number one ");
        int number1=sc.nextInt();
        System.out.println("Enter number two ");
        int number2=sc.nextInt();
        System.out.println("Enter number three ");
        int number3=sc.nextInt();
        int sum= number1+number2+number3;
        System.out.println("Sum of these numbers is "+ sum);

    }
}
