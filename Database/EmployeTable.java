package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeTable {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MCA", "root", "Sanskar@2001");
             Statement stmt = conn.createStatement()) {
            String sql = "CREATE TABLE Employee (" +
                    "employee_id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "employee_name VARCHAR(50), " +
                    "city VARCHAR(50), " +
                    "salary DOUBLE, " +
                    "date_of_joining DATE)";
            stmt.executeUpdate(sql);
            System.out.println("Employee table created.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

