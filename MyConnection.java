package punchr;


import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author 1BestCsharp
 */
public class MyConnection {
    
    
    // create a function to connect with mysql database
    
    public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/punchusers", "root", null);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
}
