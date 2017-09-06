/**
 * Created by Grand Circus Student on 7/13/2017.
 */
public class Methods1 {
    public static void main(String[] args) {
        int m = 6;
        int n = 5;

        System.out.println(m + " cubed is " + cube(m));
        System.out.println(n + " cubed is " + cube(n));
        System.out.println(n + " cubed is " + cube(7));
        System.out.println(n + " cubed is " + cube((m + n) / 3));
        System.out.println("Whatever cubed is" + cube(m + n) / 3);

        System.out.println("(3 cubed)cubed is" + cube(cube(3)));

        System.out.println("2 is even is ? " + isEven (2));
        System.out.println("7 is even is ? " + isEven (7));
        System.out.println("The higher number between 3 and 5, 1 is" + highest(3, 5, 1));
        System.out.println("The higher number between 9 and 6, 7 is" + highest(9, 6, 7));

    //We write a method to reuse code
    //The methods starts with a METHOD HEADER
    // The header consists of 4.5 things:
    //1. the visibility modifier (public for now)
    //1.5. static or nothing (for Now, static)
    //2.THe return type (the data type of the info returned)
    //      void if none
    //3. the name of the method ( verb-- What are you doing?)
    //4.

    //bob is named to copy of the value

    public static int cube(int bob) {
        return bob * bob * bob;
    }

    public static boolean isEven(int n) {
        // if (n % 2 == 0) {
        //   return true;
        //} else {
        //  return false;

        return (n % 2 == 0);
    }

    public static int highest(int a, int b) {
        if (a > b) {
            return a;

        } else {
            return b;
        }
    }

    public static int highest(int a, int b, int c) {
        int d = highest(a,b);
        return highest(d,c);
    }
        }





