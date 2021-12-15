import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Reservation {
    public void Reservation() throws ParseException {

        Scanner s = new Scanner(System.in);
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;

        System.out.println("Enter the name of the mobile home you want to stay in");
        System.out.println("Wander Inn, The Last Resort, Gingerbread House, Wolfs Lair, Moose Tracks, Lazy Bear, Slipper Slope, Lifes a Hoot, Moonlight Ridge or Eagle Peak");
        String name = s.nextLine();

        System.out.println("Please enter the date you wish to book for");
        String date = s.nextLine();
        Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(date);

        System.out.println("Please enter the date you wish to check out");
        String date2 = s.nextLine();
        Date date3 = new SimpleDateFormat("dd-MM-yyyy").parse(date2);

        String sql = "SELECT checkin_date, checkout_date FROM bookings WHERE mobilenames = ?";
        String sql2 = "SELECT price FROM mobilehomes WHERE mobilenames = ?";

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/campsite", "root", "");
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();

           //ps = conn.prepareStatement(sql2);
            //ps.setString(1, name);
            //rs = ps.executeQuery();

            Date checkInDate = rs.getDate("checkin_date");
            Date checkOutDate = rs.getDate("checkout_date");
            double Price = rs.getDouble("price");


                if (date1.compareTo(checkOutDate) < 0  && date3.compareTo(checkInDate) > 0) {
                    long diff = date3.getTime() - date1.getTime();
                    diff = (diff/ (1000 * 60 * 60 * 24));
                    double total = diff * Price;
                    System.out.println(total);
                }else{

                    System.out.println("Mobile home is booked until " + checkOutDate);
            }



    } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
