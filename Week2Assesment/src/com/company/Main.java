package com.company;

import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);
    String Student = "";
    int string = scan.nextInt();

    public static void main(String[] args) {
        System.out.println("Please input a test score:");
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();

        //create an array of 5 ints
        int [] grades = new int [5];

        //loop through the array and take input for each grade
        for(int i = 0; i <= 4; i++) {
            System.out.println("What is the test score ? ");
            grades[i] = scan.nextInt();
        }
        for(int i = 0; i <= grades.length; i++) {
            System.out.println(grades[i]);

        }




        //store the grade in the array
         grades[0] = 1;
         grades[1] = 2;
         grades[2] = 3;
         grades[3] = 4;
         grades[4] = 5;


        //go through the array and add up a total
        int sum = 0;
        for( int i :grades) {
            sum += i;
        }

        System.out.println(sum);
        //after the loop, calculate the average

//        System.out.println("Student" + "Test1" + "Test2" + "Test3" + "Test4"
//        + "Test5" + " Average" + "Grade");

        //change grade to your average variable
        if (grade >= 90){
                System.out.println(" Excellent ! ");
        } else if ( grade >= 70){
            System.out.println(" Good! ");
        } else {
            System.out.println(" Try Again ! ");
        }






        }
    }

