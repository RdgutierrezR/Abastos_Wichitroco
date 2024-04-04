
package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Conexion {
    public static Connection conector(){
        
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sistema_ventas","root", "1234");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error De Conexion BD"+e);
            JOptionPane.showMessageDialog(null, "Error De Conexion BD" + e);
        }
        return null;
    }
}
