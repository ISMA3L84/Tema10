import java.io.*;
import java.util.Scanner;


/*Escribir un programa que duplique el contenido de un fichero cuyo nombre
 * se pide al usuario. El fichero copia tendrá el mismo nombre con el pre-
 * fijo <<copia_de_>>.
 * ******************************SOLUCION********************************
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del fichero: ");
        String fichOriginal = sc.nextLine();
        String fichCopia = "copia_de_" + fichOriginal;
        /*
         * Abrimos los ficheros para lectura y escritura en la misma sentencia
         * del bloque try-catch-resources:
         */
        try (BufferedReader in = new BufferedReader(new FileReader(fichOriginal));
        /*me falla la siguiente linea ¿porque? */
        BufferedWriter out = new BufferedWriter(new FileWriter(fichCopia))) {
            int c = in.read();// leemos del original.
            while (c != -1) {// mientras no lleguemos al final del fichero.
                out.write(c);// escribimos en el fichero copia.
                c = in.read();// volvemos a leer.

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        sc.close();
    }
}
