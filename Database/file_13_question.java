package Database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class file_13_question {

    public static void main(String[] args) {
        // Database credentials
        String dbUrl = "jdbc:mysql://localhost:3306/NewDatabase"; 
        String username = "root"; 
        String password = "Sanskar@2001"; 

        String dataFile = "data.txt"; 

        String tableName = "mytable"; 

        // Establish database connection
        try (Connection conn = DriverManager.getConnection(dbUrl, username, password);
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO " + tableName + " VALUES (?, ?, ?, ?, ?)")) {

            // Read tab-separated data from file
            try (BufferedReader reader = new BufferedReader(new FileReader(dataFile))) {
                String line;
                int lineNumber = 0;
                int insertedRecords = 0;

                while ((line = reader.readLine()) != null) {
                    lineNumber++;
                    if (lineNumber >= 51 && lineNumber <= 54) { // Process records 51-54
                        String[] columns = line.split("\t");
                        if (columns.length == 5) { // Assuming 5 columns
                            pstmt.setString(1, columns[0]);
                            pstmt.setString(2, columns[1]);
                            pstmt.setString(3, columns[2]);
                            pstmt.setString(4, columns[3]);
                            pstmt.setString(5, columns[4]);

                            pstmt.addBatch();
                            if (lineNumber == 54 || (line = reader.readLine()) == null) { // Execute batch
                                int[] updateCounts = pstmt.executeBatch();
                                insertedRecords += updateCounts.length;
                                System.out.println("Inserted " + updateCounts.length + " records (Batch)");
                            }
                        } else {
                            System.err.println("Invalid column count at line " + lineNumber + ": " + columns.length);
                        }
                    }
                }
                System.out.println("Total inserted records: " + insertedRecords);
            } catch (IOException e) {
                System.err.println("Error reading data file: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.err.println("Error inserting data into database: " + e.getMessage());
        }
    }
}

