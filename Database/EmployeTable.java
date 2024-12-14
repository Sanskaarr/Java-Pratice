package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeTable {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaDatabase", "root", "Sanskar@2001");
             Statement stmt = conn.createStatement()) {
            String sql = "CREATE TABLE Person1 (" +
                    "first_name TEXT, " +
                    "last_name VARCHAR(50), " +
                    "photo MEDIUMBLOB)";
            stmt.executeUpdate(sql);
            System.out.println("Employee table created.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// TinybLOB 
//BLOB
//MEDIUMBLOB
//LONGBLOB