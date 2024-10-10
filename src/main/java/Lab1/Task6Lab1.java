package Lab1;

import java.util.Scanner;

public class Task6Lab1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number one ");
        int numberOne=sc.nextInt();
        System.out.println("Enter number two ");
        int numberTwo=sc.nextInt();
        if(numberOne==numberTwo){
            System.out.println("Numbers are equal, "+numberOne);
        } else if (numberOne>numberTwo) {
            System.out.println("First number is greater, "+numberOne);
        }else {
            System.out.println("Second number is greater, "+numberTwo);
        }
    }
}
