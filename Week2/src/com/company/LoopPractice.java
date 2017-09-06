package com.company;

public class LoopPractice {

    public static void main(String[] args) {
	//write a loop to count from 100 to 1 (inclusive)
        for(int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
        //write a loop to count from 5 to 100 inclusive
        for (int i = 5; i <=100;i+=5) {
            System.out.println(i);
        }
        //count by powers of two in a loop
        //1 2 4 8 16 .... 1024
        for (int i =1; i<=1024; i=i*2){
            System.out.println(i);
        }

    //count from 1000 to 0 by quarters
    //1000 250 62 31 15.....0
       for(int i = 1000; i > 1; i /= 4) {
         System.out.println(i);
    }
}
}