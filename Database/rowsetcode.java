package Database;
import java.sql.*;
import javax.sql.rowset.*;
import javax.sql.rowset.spi.*;
import java.io.*;


public class rowsetcode {
    static Console console   = System.console();
    static String answer;
    static boolean quit = false;

    public static void main(String args[]){
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MCA","root","Sanskar@2001")){
            conn.setAutoCommit(false);
            String sql = "Select * FROM Employee";
            Statement stmt = conn.createStatement();

            ResultSet result = stmt.executeQuery(sql);
            RowSetFactory factory = RowSetProvider.newFactory();
            CachedRowSet rowset =  factory.createCachedRowSet();

            rowset.setTableName("Employee");
            rowset.populate(result);

            while(!quit){
                if(!readPerson(rowset)) continue;
                //   updatePerson(result);
                //   deletePerson(result);
                //   insertPerson(result);
                updatePerson(sql, result);
                deletePerson(sql, result);
                insertPerson(sql, result);
                saveChanges(rowset,conn);
                askToQuit();
            }
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    static void readPersonInfo(String position,ResultSet result) throws SQLException{
        String name = result.getString("employee_name");
        String email = result.getString("city");

        String studentInfo = "%s: %s - %s\n";
        System.out.format(studentInfo, position, name, email);
    }

    static boolean readPerson(ResultSet result) throws SQLException{
        int row = Integer.parseInt(console.readLine("Enter Person Number: "));

        if(result.absolute(row)){
            readPersonInfo("Person at row: "+ row, result);
            return true;
        }
        else{
            System.out.println("THere is no"+row);
            return false;
        }
    }
    static void updatePerson(String position,ResultSet result) throws SQLException{
        answer = console.readLine("do you want to update(Y/N): ");

        if(answer.equalsIgnoreCase("Y")){
            String name = console.readLine("\tUpate Name:");
            String email = console.readLine("\tUpdate City:"); 
    
            if(!name.equals("")) result.updateString("employee_name",name);
            if(!email.equals("")) result.updateString("city",email);


            result.updateRow();
            System.out.println("Student updated successfully.");
        }
    }

    static void deletePerson(String position,ResultSet result) throws SQLException{
        answer = console.readLine("Do you want to delete (Y/N)?: ");

        if(answer.equalsIgnoreCase("Y")){
            result.deleteRow();
            System.out.println("Student deleted successfully.");
        }
    }

    static void insertPerson(String position,ResultSet result) throws SQLException{
        answer = console.readLine("Do you want to insert (Y/N)?: ");

        if(answer.equalsIgnoreCase("Y")){
            String name = console.readLine("\tEnter Name:");
            String email = console.readLine("\tEnter City:");

            result.moveToInsertRow();

            result.updateNull("employee_id");
            result.updateString("employee_name",name);
            result.updateString("city",email);

            result.insertRow();
            result.moveToCurrentRow();
            System.out.println("Student inserted successfully.");
        }
    }

    static void saveChanges(CachedRowSet rowset, Connection conn){
        answer = console.readLine("Do you want to save changes(Y/N)?: ");

        if(answer.equalsIgnoreCase("Y")){
            try{
                rowset.acceptChanges(conn);
            }
            catch(SyncProviderException ex){
                System.out.println("Error Commiting Changes: " + ex.getMessage());
            }
        }
    }

    static void askToQuit(){
        answer = console.readLine("Do you want to quit (Y/N)?: ");

        if(answer.equalsIgnoreCase("Y")){
            quit = true;
        }
    }

}
