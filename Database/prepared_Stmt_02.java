package Database;

import java.sql.*;

public class prepared_Stmt_02 {
    public static void main(String args[]){
        String url ="jdbc:mysql://localhost:3306/DBMS";
        String username = "root";
        String password = "Sanskar@2001";

        try(Connection conn = DriverManager.getConnection(url, username, password);){
            String sqlInsert = "INSERT INTO first_join(first,last,course,section,phone_number) VALUES (?,?,?,?,?)";
            String sqlDelete = "DELETE FROM first_join WHERE section = ?";

            PreparedStatement pstmt1 = conn.prepareStatement(sqlInsert);
            PreparedStatement pstmt2  = conn.prepareStatement(sqlDelete);

            pstmt1.setString(1, "Ruchi");
            pstmt1.setString(2, "Malhotra");
            pstmt1.setString(3, "Fashion");
            pstmt1.setString(4, "G");
            pstmt1.setString(5, "9876543210");

            pstmt2.setString(1, "F");

            int rowinserted = pstmt1.executeUpdate();
           int rowdeleted = pstmt2.executeUpdate();

            if(rowinserted>0){
                System.out.println("The Data is Being Added to the Table");
            }
            else{
                System.out.println("Failed to Add the Data to the Table");
            }

            if(rowdeleted>0){
                System.out.println("The Data is Being Deleted from the Table");
            }
            else{
                System.out.println("Failed to Delete the Data from the Table");
            }
        }   
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
