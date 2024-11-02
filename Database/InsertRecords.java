package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecords {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/MCA"; // Replace 'yourDatabase' with your actual database name
        String username = "root"; // Replace with your MySQL username
        String password = "Sanskar@2001"; // Replace with your MySQL password

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
             Statement stmt = conn.createStatement()) {

            // Insert 10 different records using regular SQL statements
            String[] sqlStatements = {
                "INSERT INTO Employee (employee_name, city, salary, date_of_joining) VALUES ('Ritika', 'New York', 70000, '2023-01-10')",
                "INSERT INTO Employee (employee_name, city, salary, date_of_joining) VALUES ('Allan', 'Los Angeles', 75000, '2023-02-15')",
                "INSERT INTO Employee (employee_name, city, salary, date_of_joining) VALUES ('Harshit', 'Chicago', 72000, '2023-03-01')",
                "INSERT INTO Employee (employee_name, city, salary, date_of_joining) VALUES ('Tony', 'Houston', 78000, '2023-04-18')",
                "INSERT INTO Employee (employee_name, city, salary, date_of_joining) VALUES ('Radhika', 'Phoenix', 73000, '2023-05-22')",
                "INSERT INTO Employee (employee_name, city, salary, date_of_joining) VALUES ('Sneha', 'Philadelphia', 71000, '2023-06-05')",
                "INSERT INTO Employee (employee_name, city, salary, date_of_joining) VALUES ('Rupesh', 'San Antonio', 76000, '2023-07-11')",
                "INSERT INTO Employee (employee_name, city, salary, date_of_joining) VALUES ('Priyanshu', 'San Diego', 74000, '2023-08-30')",
                "INSERT INTO Employee (employee_name, city, salary, date_of_joining) VALUES ('Sanskar', 'Dallas', 79000, '2023-09-17')",
                "INSERT INTO Employee (employee_name, city, salary, date_of_joining) VALUES ('Aman', 'San Jose', 80000, '2023-10-01')"
            };

            for (String sql : sqlStatements) {
                stmt.executeUpdate(sql);
            }
            System.out.println("10 records inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}