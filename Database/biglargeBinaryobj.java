package Database;
import java.io.*;
import java.sql.*;

public class biglargeBinaryobj {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/JavaDatabase";
        String username = "root";
        String Password = "Sanskar@2001";
        String filePath ="/Users/sanskarjain/Desktop/form.png";

        try{
            Connection conn = DriverManager.getConnection(url, username, Password);
            String sql = "INSERT INTO Person1 (first_name,last_name,photo) VALUES (?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "Prana");
            stmt.setString(2, "Sinna");
            InputStream is = new FileInputStream(new File(filePath));

            stmt.setBlob(3, is);

            int row = stmt.executeUpdate();
            if(row>0){
                System.out.println("Image");
            }
            conn.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
