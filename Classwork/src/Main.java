import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //tank to hold file
        //writetofile();

        File myFile = new File("names.txt");
        try (FileReader reader = new FileReader(myFile)) {
            BufferedReader bufReader = BufferedReader(reader);
            String line = bufReader.readLine();
            while (line!=null){
                System.out.println(line);
                line = bufReader.readLine(); //read the nextline!
            }

            bufReader
            System.out.println("File Not Found!");
        }

    }

    private static void writetofile() {
        File myFile = new File("names.txt");

        Scanner scan = new Scanner(System.in);


        //any error the program can't handle at runtime is known as an Exception
        //PrintWriter class has method built in to say: "Hey, I know you're going to be looking for a file"
        //In case you don't have access to that file, for whatever reason...
        //surround your print-writer with a try/catch to catch the exception
        try {
            //pipe  to stream file into tank             //pump, which by default deletes data from file
            PrintWriter p = new PrintWriter(new FileOutputStream(myFile, true));
//            p.println("First line!!! Wohooo!");
            System.out.println("Please enter a line:");
            String input = scan.nextLine();
            p.println(input);//save user input to the file
            p.close();


        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!!!! :-( ");

        }
    }
}
