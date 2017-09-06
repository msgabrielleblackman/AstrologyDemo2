package com.company;

/**
 * Created by Grand Circus Student on 7/17/2017.
 */
public class Arrays {
    static final int SIZE = 5;

    public static void main (String [] args){
        //Creating the array and setting the names at once

        String[] playerNames = {"David", "Katie","DeShayla", "Gagan","Marc"};

        //for loop to go through all names
        for (int i = 0; i < playerNames.length; i++ ){
            System.out.println(playerNames[i]);
            //traditional loop I have access to change elements
            //playerNames[i] = "Leslie";
        }
        //the same as above with an enhanced for
        for (String name: playerNames){
            System.out.println(name);
            //in an enhanced for loop, I can't change elements
            // or find out the index directly
            //name = "Peter"; // this does't work -- I'm changing a copy
        }
        //declare an array with 10 int elements
        final int SIZE = 5;
        int[] scores = new int[SIZE];
        scores[0] = 300;
        scores[1] = 160;
        scores[2] = 90;
        scores[3] = 120;
        scores[4] = 220;

        //you can change an individual element later
        scores[0] = 190;
        scores[2] =130;


        //int [] scores = new int[10]

        //finding the average of an array
        //1
        int total =0;
        //2. loop through all the elements
        for (int i = 0; i < scores.length; i++){
            //3. ad each element into the total
            total += scores[i];
        }
        //4.divide the sum by the length of array
        //watch out for int/int!!
        double average = (double)total / scores.length; {
            System.out.println("Average score:" + average);

            //find the lowest score (and corr.name)
            //1.set the low to the first element
            int max = scores[0];
            int min = scores[0];
            int maxPosition = 0 ; //the first low is at position 0
            //2. go through all the remaining values
            for (int i = 1; i <= scores.length; i++) {
            //3.compare to previous low value
                if (scores[i] > max ) {
                    //3a. reset max to the new high
                    min=scores[i];
                    maxPosition = i; // low is noe at position i
                }
        }
        //output the low
            System.out.println("High Score is" + max);
            System.out.println("Low Score belongs to" + playerNames[maxPosition]);

         System.out.println("Names and Scores:");
         //parallel arrays; 2+  arrays where element i of one array
        //
        //have to be the same length , so I can count based on the length of any of them
        for (int i = 0; i < playerNames.length; i++) {
            System.out.println(playerNames[i]+ ";\t" + scores[i]);

            }
        }

}}
