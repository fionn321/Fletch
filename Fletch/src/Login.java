import java.sql.*;
import java.util.Scanner;

public class Login {

    public boolean login (Scanner scanner){
        boolean valid = false;
        try{
            System.out.print(" Enter Username ");
            String  username = scanner.nextLine();

            Customer customer = new Customer(username);

            System.out.print(" Enter Password ");
            String  password = scanner.nextLine();

            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/campsite", "root", "");
            Statement stmt = conn.createStatement();
            String SQL = "SELECT * FROM customerinfo WHERE username='" + username + "' AND password='" + password + "'";
            ResultSet rs = stmt.executeQuery(SQL);
            //System.out.println(rs);

            int count = 0;
            while(rs.next()) {
                count = count + 1;
            }
            if(count == 1){
                System.out.println(" You have logged in");
                valid = true;
            }else{
                System.out.println("Invalid password or username");
                valid = false;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return valid;

    }
}
