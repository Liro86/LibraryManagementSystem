
package Interface;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Linus
 */
public class DBConnect {
    private static Connection con=null;
    
    public static Connection connect()
    {
    if(con == null){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/library?","usernmae","password"); //Insert username and password for Database here
            JOptionPane.showMessageDialog(null, "connection success");
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
           
        }}
       return con;
    
    }
    
    
    
    
}
