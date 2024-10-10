package Lab2;

import java.util.Scanner;

public class Task6Lab2 {
    public static void printText(){
        System.out.println("In the begining there were swamp, the hoe and Java. ");
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many times should the text be printed? ");
        int times = sc.nextInt();
        for (int j=0;j<times;j++){
            printText();
        }
    }
}
