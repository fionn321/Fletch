 /* import java.sql.Date;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Driver {


    public static void main(String[] args) {
        Date arrivalDate = null;
        int singleRooms;
        int doubleRooms;
        String name;

        int nights = 0;
        int persons = 0;
        int price = 0;


        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Fletch the Campsite Booking System");
        System.out.println("Please choose an option");
        System.out.println("1 - Make a booking");
        System.out.println("2 - View and manage bookings");
        System.out.println("3 - Available services/emergency contacts");
        System.out.println("4 - View and manage your details");
        System.out.println("5 - About Fletch");
        System.out.println("6 - Logout");

        boolean check = false;
        while (!check) {
            int select = Integer.parseInt(s.nextLine());
            int input =
                    s.nextInt();
            if (select == 1) {


                } else if (input.equalsIgnoreCase("B")) {
                    System.out.println("Welcome to Hotel Executive!");

                    check = true;
                } else if (input.equalsIgnoreCase("C")) {

                    check = true;
                } else if (input.equalsIgnoreCase("D")) {

                    check = true;
                } else if (input.equalsIgnoreCase("E")) {

                    check = true;
                } else {
                    System.out.println("Invalid Hotel, please enter valid hotel");
                }
            }
        }
    }
}*/