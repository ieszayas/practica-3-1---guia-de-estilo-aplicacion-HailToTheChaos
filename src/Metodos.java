
//import java.util.ArrayList;
public class Metodos {

    public static boolean verificarUser(Usuario user) {
        return BaseDatos.consultar(user);
    }
    
    public static boolean verificarUser(String user) {
        return BaseDatos.consultar(user);
    }

    public static boolean verificarDobleContra(String contra1, String contra2) {
        return contra1.equals(contra2);
    }

    public static boolean verificarCorreo(String correo) {
        if (correo.matches("([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))+")) {
            return true;
        }
        return false;
    }
    
    public static boolean verificarDuplicado(String user) {
        return BaseDatos.consultar(user);
    }
    
    public static boolean modificarContraseña(Usuario user, String nContraseña){
        user.setContraseña(nContraseña);
        return BaseDatos.modificarContraseña(user);
    }
}
