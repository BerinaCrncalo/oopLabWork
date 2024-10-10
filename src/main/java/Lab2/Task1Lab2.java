package Lab2;

import java.util.Scanner;

public class Task1Lab2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String password="jabuka";
        System.out.println("Please enter the password: ");
        String password1 = input.nextLine();
        while(!password1.equals(password)){
            System.out.println("Password is incorrect ");
            System.out.println();
            System.out.println("Please enter the password: ");
            password1=input.nextLine();
        }
        System.out.println("Password is a match, secret message is: From the tree");

    }

}
