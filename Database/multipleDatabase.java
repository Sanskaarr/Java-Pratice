package Database;
import java.sql.Connection;
import java.sql.DriverManager;


public class multipleDatabase {
    public static void main(String[] args) {
        try (Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/MCA", "root", "Sanskar@2001");
        Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaDatabase", "root", "Sanskar@2001");
        Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/MCA1c", "root", "Sanskar@2001");){
            System.out.println("Connected to 3 databases!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
