package contralador;

import java.sql.ResultSet;
import java.sql.Statement;
import modelo.Usuario;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CtrlUsuario {

    public boolean loginUser(Usuario Objeto) {
        boolean repuesta = false;
        Connection cn = Conexion.conector();
        String sql = "select usuario, password from tb_usarios where usuario = '" + Objeto.getUsuario() + "' and password = '" + Objeto.getPassword() + "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                repuesta = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion" + e);
        }
        return repuesta;
    }

}
