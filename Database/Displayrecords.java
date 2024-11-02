package Database;
import java.sql.*;

public class Displayrecords {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MCA", "root", "Sanskar@2001");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Employee")) {
            while (rs.next()) {
                System.out.println(rs.getInt("employee_id") + ", " +
                        rs.getString("employee_name") + ", " +
                        rs.getString("city") + ", " +
                        rs.getDouble("salary") + ", " +
                        rs.getDate("date_of_joining"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

