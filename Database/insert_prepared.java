package Database;
import java.sql.*;

public class insert_prepared {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/JavaDatabase";
        String username = "root";
        String password = "Sanskar@2001";

        try{
            Connection conn = DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO person(first_name,last_name) VALUES (?,?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, "Sanskar");
            stmt.setString(2, "Jain");

            int rs = stmt.executeUpdate();
            if(rs>0){
                System.out.println("Data Inserted Successfully");
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }

    }
}
