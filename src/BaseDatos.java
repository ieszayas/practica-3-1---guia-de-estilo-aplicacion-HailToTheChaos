
import java.sql.*;

public class BaseDatos {

    private static final String url = "jdbc:derby://localhost:1527/dam2;create=true";
    private static final String userBD = "jaime";
    private static final String passwd = "1234";
    static Connection conexion = null;

    private static boolean conectar() {
        try {
            conexion = DriverManager.getConnection(url, userBD, passwd);

        } catch (SQLException e) {
            return false;
        }

        return true;
    }

    public static boolean guardar(Usuario user) {

        if (conectar()) {
            try {
                String usuario = user.getUsuario();

                PreparedStatement ps = conexion.prepareStatement("INSERT INTO APP.USERS values (?,?)");
                ps.setString(1, usuario);
                ps.setString(2, user.getContraseña());

                ps.executeUpdate();
                if (user.isInfo()) {
                    PreparedStatement ps2 = conexion.prepareStatement("INSERT INTO APP.INFORMACION values (?,?,?,?,?)");
                    ps2.setString(1, usuario);
                    ps2.setString(2, user.getNombre());
                    ps2.setString(3, user.getApellido());
                    ps2.setString(4, user.getFecha_nac());                    
                    ps2.setString(5, user.getCorreo());

                    ps2.executeUpdate();
                    ps2.close();
                }
                ps.close();
                conexion.close();

            } catch (SQLException ex) {                
                return false;
            }
        }
        return true;
    }

    public static boolean consultar(Usuario user) {
        if (conectar()) {
            try {
                Statement s = conexion.createStatement();
                ResultSet rs = s.executeQuery("select usuario, password from APP.users where usuario = '" + user.getUsuario()
                        + "' and password = '" + user.getContraseña() + "'");

                if (rs.next()) { //Si devuelve true es que hay registro                    
                    return true;
                } else {
                    return false;
                }
            } catch (SQLException ex) {
                return false;
            }
        }
        return false;
    }

    public static boolean consultar(String user) {
        if (conectar()) {
            try {
                Statement s = conexion.createStatement();
                ResultSet rs = s.executeQuery("SELECT USUARIO, PASSWORD FROM APP.USERS WHERE USUARIO = '" + user + "'");

                if (rs.next()) { //Si devuelve true es que hay registro
                    return true;
                } else {
                    return false;
                }
            } catch (SQLException ex) {

                return false;
            }
        }
        return false;
    }

    public static boolean modificarContraseña(Usuario user) {
        if (conectar()) {
            try {
                Statement s = conexion.createStatement();
                s.executeUpdate("update app.users set password = '" + user.getContraseña() + "' where usuario = '" + user.getUsuario() + "'");

                return true;

            } catch (SQLException ex) {
                return false;
            }
        }
        return false;
    }
}
