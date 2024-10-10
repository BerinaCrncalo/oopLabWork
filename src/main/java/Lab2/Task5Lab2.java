package Lab2;

import java.util.Scanner;

public class Task5Lab2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int number=sc.nextInt();
        int sum=0;

        for (int i=20; i <= number; i++) {
            int powerValue = (int)Math.pow(2, i);
            sum += powerValue;
        }
        System.out.println("The sum of 2^20 + 2^21 + ... + 2^" + number + " is: " + sum);

    }
}
