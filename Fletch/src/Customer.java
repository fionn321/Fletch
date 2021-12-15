import java.sql.*;

public class Customer implements User {

    PreparedStatement ps = null;
    ResultSet rs = null;
    private String firstName;
    private String lastname;
    private String username;
    private String password;
    private String emailaddress;
    private Long phonenumber;
    private Boolean admin;

    public Customer(String userName) throws SQLException {
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/campsite", "root", "");
        String sql = "SELECT firstname, lastname, username, password, emailaddress, phonenumber, admin FROM customerinfo WHERE username='" + userName + "'" ;
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        rs.next();
        this.firstName = rs.getString("firstname");
        this.lastname = rs.getString("lastname");
        this.username = rs.getString("username");
        this.password = rs.getString("password");
        this.emailaddress = rs.getString("emailaddress");
        this.phonenumber = rs.getLong("phonenumber");
        this.admin = rs.getBoolean("admin");

    }


    @Override
    public String getDescription() {
        return null;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastname(){
        return  this.lastname;
    }

    public String getUsername(){
        return  this.username;
    }

    public String getPassword(){
        return  this.password;
    }

    public String getEmailaddress(){
        return  this.emailaddress;
    }

    public Long getPhonenumber(){
        return  this.phonenumber;
    }

    public Boolean getAdmin(){
        return  this.admin;
    }

}
