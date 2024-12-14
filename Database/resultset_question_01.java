package Database;

import java.sql.*;

public class resultset_question_01 {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/DBMS";
        String username = "root";
        String password = "Sanskar@2001";

        try (Connection conn = DriverManager.getConnection(url, username, password);) {
            String Sql = "SELECT * FROM second_join";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(Sql);

            while(rs.next()){
            System.out.println(rs.getInt("student_id") + "\t" + rs.getString(2)+ "\t\t" + rs.getString(4));
            }
        }

        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}