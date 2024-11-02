package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createDatabase {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/";  // No database specified
        String username = "root";  //MySQL username
        String password = "Sanskar@2001";  // MySQL password
        
        String databaseName = "JavaDatabase";  // name for the new database

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password);
             Statement statement = connection.createStatement()) {
            
            String sql = "CREATE DATABASE " + databaseName;
            statement.executeUpdate(sql);
            System.out.println("Database created successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
