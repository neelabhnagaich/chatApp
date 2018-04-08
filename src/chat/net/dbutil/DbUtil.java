
package chat.net.dbutil;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DbUtil {
   private static Connection conn;
    static
    {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-F43VIA2V:1521/xe","project","java");
            
           }
        catch(ClassNotFoundException c)
        {
            JOptionPane.showMessageDialog(null, "Error Connecting with database "+c,"Error !!",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException q)
        {
            JOptionPane.showMessageDialog(null, "Error Connecting SQL..  "+q,"Error !!",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public static Connection getConnection()
    {
        return conn;
    }
    public static void closeConnection()
    {
         if(conn!=null)
        {
            try{
                conn.close();
            JOptionPane.showMessageDialog(null, "Connection closed","Success",JOptionPane.INFORMATION_MESSAGE);

                
               }
            catch(SQLException s)
            {
             JOptionPane.showMessageDialog(null, "Error Closing the connection ","Error !!",JOptionPane.ERROR_MESSAGE);

            }
        }
    }
    
}