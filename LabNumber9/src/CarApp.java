import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Grand Circus Student on 7/24/2017.
 */
public class CarApp {

        public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to Grand Circus Motors admin console ! ");
            System.out.println();
            System.out.println("How many cars are you entering ?");
            scan.nextLine();


            String Make;
            String Model;
            int year;
            double price;

            System.out.println("Please enter Car #1 Make:");
            Make = scan.next();
            scan.nextLine();

            System.out.println("Please enter Car #1 Model:");
            Model= scan.next();
            scan.nextLine();

            System.out.println("Please enter Car #1 Year:");
            year = scan.nextInt();
            scan.nextLine();

            System.out.println("Please enter Car #1 Price:");
            price = scan.nextInt();
            scan.nextLine();

            //syntax for ArrayList is different
            ArrayList<Cars> carsList = new ArrayList<Cars>();
            carsList.add(new Cars("Ford", "Fusion", 2017, 22000,0));
            carsList.add(new Cars("Ford", "Edge", 2017,28950,0));
            carsList.add(new Cars("Ford", "Explorer", 2017,31660,0));

            carsList.add(new Cars("Dodge", "Stratus", 2005,1633,135983));
            carsList.add(new Cars("Chrysler", "Pacifica", 2004,1426,250000));
            carsList.add(new Cars("Saturn", "Vue", 2008,3098,140000));

            for (int i = 0; i < carsList.size(); i++) {
                if (carsList.get(i) instanceof Cars) {
                    Cars s = (Cars) (carsList.get(i));
                    s.getMake();
                }
            }

            for (Cars c : carsList) {
                System.out.println(c);
            }

        }
    }

