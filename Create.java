import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Create{


    public static void main(String[] sgd){
        String URL="jdbc:mysql://localhost:3306/students";
        String USER="root";
        String PASSWORD="dhivya";
        try{
            Connection con=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("success");
            java.sql.Statement selectStatement=con.createStatement();
            String createTableSQL = "CREATE TABLE Employee ("
                                    + "Id INT AUTO_INCREMENT PRIMARY KEY, "
                                    + "First_Name VARCHAR(50) NOT NULL, "
                                    + "Last _Name VARCHAR(50) NOT NULL, "
                                    + "Email VARCHAR(100) NOT NULL, "
                                    + "Joining_date DATE NOT NULL"
                                    + ")";
             selectStatement.executeUpdate(createTableSQL);
             System.out.println("Table created successfully");
            
        }
        catch(SQLException  e){
            System.out.println(e);   
        }     
        
            

        }
    }
 

