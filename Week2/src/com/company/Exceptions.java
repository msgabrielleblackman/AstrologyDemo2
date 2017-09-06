package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
            System.out.print("Enter an integer");
            int n = scan.nextInt();
        }catch (InputMismatchException e){
            System.out.println("That wasn't an integer!! ");
            System.out.println();
            System.out.println();
            System.out.println("Exiting now...");
            return;
        }

        System.out.println("You entered" + n);

        System.out.println();

    }

}
