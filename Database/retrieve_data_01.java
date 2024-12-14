package Database;

import java.sql.*;

public class retrieve_data_01 {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/MCA";
        String username = "root";
        String password = "Sanskar@2001";

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);){
            System.out.println("Connected to the database");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE");

            while(rs.next()){
                System.out.println("Employee ID : " + rs.getString("employee_id"));
                System.out.println("Employee Name : " + rs.getString("employee_name"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }

       
    }
}
