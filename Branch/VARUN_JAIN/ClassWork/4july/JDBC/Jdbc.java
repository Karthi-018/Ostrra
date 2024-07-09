import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

public class Jdbc{
public static void main(String[] args) {
//     connection;
    try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Osttra","root","root")){        
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connected to the DB Success !!");
        
        Statement stmt=connection.createStatement();
        int count= stmt.executeUpdate("insert into Persons values(101,'mishra','yashi','jkp','hig'),(101,'mishra','yashi','jkp','hig')");
        
    }
    catch (Exception e) {
        System.out.println(e.getMessage());
    }
    
    
}
}