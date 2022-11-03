
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public static boolean modificarContraseña(Usuario user, String nContraseña) {
        user.setContraseña(nContraseña);
        return BaseDatos.modificarContraseña(user);
    }

    public static void guardarEnFichero(String entrada, File fichero, boolean append) {

        try {
            fichero.createNewFile();
            FileWriter file = new FileWriter(fichero, append);

            file.write(entrada);
            file.write("\n");

            if (file != null) {
                file.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String leerFichero(File fichero) {
        String salida = "";

        try {
            Scanner sc = new Scanner(fichero);

            while (sc.hasNext()) {
                salida = salida.concat(sc.nextLine());
                salida = salida.concat("\n");
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salida;
    }
}
