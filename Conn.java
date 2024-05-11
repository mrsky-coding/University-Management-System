import java.sql.*;

public class Conn {
    Connection c=null;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost/universitymangementsystem", "root","akashyadav@95");
            s=c.createStatement();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Conn();
    }
}
