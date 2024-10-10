package Lab2;

import java.util.Scanner;

public class Task4Lab2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number one ");
        int numberOne=sc.nextInt();
        System.out.println("Enter number two ");
        int numberTwo=sc.nextInt();
        System.out.println("The numbers between "+numberOne+" and "+numberTwo+" are ");

        if (numberOne<=numberTwo){
            int finalnumbers=numberOne;
            while (finalnumbers<=numberTwo){
                System.out.println(finalnumbers + " ");
                finalnumbers++;
            }
        }else {
            int finalnumbers=numberTwo;
            while (finalnumbers>=numberTwo){
                System.out.println(finalnumbers + " "+ numberOne);
                finalnumbers--;
            }
        }
    }
}
