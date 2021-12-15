

import java.sql.*;
import java.util.Scanner;

public class Bookings {

   public static void main(String args[]) {

      Scanner s = new Scanner(System.in);
      System.out.println("Enter number of people");
      int numPeople = Integer.parseInt(s.nextLine());


      String sql = "SELECT mobilenames, singlerooms, doublerooms, bathrooms, price FROM mobilehomes WHERE ? <= capacity";
      PreparedStatement ps = null;
      ResultSet rs = null;
      Connection conn = null;

      try {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/campsite", "root", "");
         ps = conn.prepareStatement(sql);
         ps.setInt(1, numPeople);
         rs = ps.executeQuery();
         System.out.println("Here are some options available for your guest size please choose one");
         while (rs.next()) {

               String mobileNames = rs.getString("mobilenames");
               int numberOfSingleRooms = rs.getInt("singlerooms");
               int numberOfDoubleRooms = rs.getInt("doublerooms");
               int numberOfBathrooms = rs.getInt("bathrooms");
               double Price = rs.getInt("price");

               System.out.println( mobileNames );
               System.out.println("the number of single rooms is " + numberOfSingleRooms);
               System.out.println("the number of double rooms is " + numberOfDoubleRooms);
               System.out.println("the number of bathrooms is " + numberOfBathrooms);
               System.out.println("the price of this mobile home is " + Price);
               System.out.println("");

         }
         System.out.println( "Would you like to make a reservation (Y/N) " );
         String answer = s.nextLine();
                 if(answer.equalsIgnoreCase("Y")){
                     Reservation reservation = new Reservation();
                     reservation.Reservation();

                 }else{
                     System.exit(1);

                 }


      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         if (rs != null) {
            try {
               rs.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
         if (ps != null) {
            try {
               ps.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
      }
   }
}