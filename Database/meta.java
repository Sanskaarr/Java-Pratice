package Database;
import java.sql.*;

public class meta {

    public static void main(String[] args) {
        // Database credentials
        String dbUrl = "jdbc:mysql://localhost:3306/NewDatabase"; 
        String username = "root"; 
        String password = "Sanskar@2001"; 

        // Table name
        String tableName = "table1";

        // Establish database connection
        try (Connection conn = DriverManager.getConnection(dbUrl, username, password);
             Statement stmt = conn.createStatement();
             ResultSet resultSet = stmt.executeQuery("SELECT * FROM " + tableName + " LIMIT 0")) {

            // Get table meta data
            DatabaseMetaData dbMetaData = conn.getMetaData();
            ResultSet tableMetaData = dbMetaData.getTables(null, null, tableName, new String[] {"TABLE"});

            if (tableMetaData.next()) {
                System.out.println("**Table Meta Data**");
                System.out.println("---------------------");
                System.out.println("Table Name: " + tableMetaData.getString("TABLE_NAME"));
                System.out.println("Table Type: " + tableMetaData.getString("TABLE_TYPE"));
                System.out.println();

                // Get column meta data
                ResultSet columnMetaData = dbMetaData.getColumns(null, null, tableName, null);

                System.out.println("**Column Meta Data**");
                System.out.println("---------------------");
                while (columnMetaData.next()) {
                    System.out.println("Column Name: " + columnMetaData.getString("COLUMN_NAME"));
                    System.out.println("Data Type: " + columnMetaData.getString("TYPE_NAME"));
                    System.out.println("Size: " + columnMetaData.getInt("COLUMN_SIZE"));
                    System.out.println("Nullable: " + columnMetaData.getString("IS_NULLABLE"));
                    System.out.println();
                }
            } else {
                System.out.println("Table not found: " + tableName);
            }
        } catch (SQLException e) {
            System.err.println("Error printing table meta data: " + e.getMessage());
        }
    }
}
