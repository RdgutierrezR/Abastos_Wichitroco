
package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Conexion {
    public static Connection conector(){
        
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/abastos_wichitroco","root", "");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error De Conexion BD"+e);
            JOptionPane.showMessageDialog(null, "Error De Conexion BD" + e);
        }
        return null;
    }
}
