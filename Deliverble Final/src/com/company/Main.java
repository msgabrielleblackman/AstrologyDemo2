package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // This is how I activated the keyboard
        System.out.println("Welcome! What is the number?"); // This is the message Im sending to the keyboard
        int num = sc.nextInt(); // This the variable that captures input from the keyboard


        // this will return each number to a int variable. This is set of formulas I used to extract each digit
        int num1 = num % 10;
        int num2 = num / 10 % 10;
        int num3 = num /100 % 10;

      // System out used to test
       // System.out.print(num1);
       // System.out.print("\n" + num2);
       // System.out.print("\n" + num3);

        int numFinal = (num1 * num1 * num1) // I cubed each variable and added them together.
                +  (num2 * num2 * num2)
                +  (num3 * num3 * num3);
// This next section test for a true or false condition
        if (num == numFinal){
            System.out.println("True");
        }
        else
            System.out.println("False");
        sc.close();
    }

}