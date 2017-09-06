/**
 * Created by Grand Circus Student on 7/10/2017.
 */
import java.util.Scanner;
public class MainClass {


    public static void main (String[] args){


    Scanner scan = new Scanner(System.in);

        System.out.println("Hello World");

            int number1;
            int number2;

           System.out.println("Please enter a number:");
            number1 = scan.nextInt();
            scan.nextLine();

            System.out.println("Please enter a number");
            number2 = scan.nextInt();
            scan.nextLine();

            //processing

            int result = number1 + number2;

            // output

            System.out.println("The result = "+result);
    }
    }
