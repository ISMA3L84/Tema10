import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*Crear con un editor el fichero de texto NumerosReales.txt en la car-
 * peta del proyecto de Netbeans actual y escribir en él una serie de 
 * números reales separados por espacios simples.
 * 
 * Implementar un programa que acceda a NumerosReales.txt, lea los nú-
 * meros y calcule la suma y la media aritmética, mostrando los resul-
 * tados por pantalla.
 */
public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("NumerosReales.txt.txt"));
            String texto = in.readLine();// leemos la cadena con los números.
            String[] subcadenas = texto.split(" ");// separamos las cadenas.
            double suma = 0;
            for (int i = 0; i < subcadenas.length; i++) {
                suma += Double.valueOf(subcadenas[i]);/*
                                                       * las convertimos y
                                                       * acumulamos
                                                       */

            }
            System.out.println("suma: " + suma + "\tmedia: " + suma / subcadenas.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();

                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
