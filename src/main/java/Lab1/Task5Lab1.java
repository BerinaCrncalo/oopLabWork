package Lab1;
import java.util.Scanner;
public class Task5Lab1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int number=sc.nextInt();
        if (number>0){
            System.out.println("Number is positive ");
        }else{
            System.out.println("Number is negative ");
        }
    }
}
