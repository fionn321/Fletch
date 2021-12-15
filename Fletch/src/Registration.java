import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Registration {


    public static void main(String[] args) {

        PreparedStatement stmt = null;
        Connection conn = null;
        Scanner s = new Scanner(System.in);

        System.out.print(" Enter First name ");
        String firstname = s.nextLine();


        System.out.print(" Enter Last name");
        String lastname = s.nextLine();


        System.out.print(" Enter User name ");
        String username = s.nextLine();


        System.out.print(" Enter Password ");
        String password = s.nextLine();


        System.out.print(" Enter Email address ");
        String emailaddress = s.nextLine();


        System.out.print(" Enter Phone number ");
        long phonenumber = s.nextLong();


        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/campsite", "root", "");

        stmt = conn.prepareStatement("insert into customerinfo" + "(firstname, lastname, username, password, emailaddress, phonenumber) values (?,?,?,?,?,?)");
            System.out.println("Connected too the database");
            stmt.setString(1, firstname);
            stmt.setString(2, lastname);
            stmt.setString(3, username);
            stmt.setString(4, password);
            stmt.setString(5, emailaddress);
            stmt.setLong(6, phonenumber);
            stmt.executeUpdate();

    } catch (SQLException e) {
        e.printStackTrace();
    }
    }

}
