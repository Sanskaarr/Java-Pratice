package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MCA", "root", "Sanskar@2001");
            System.out.println("Connected to the database!");
            connection.close();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

