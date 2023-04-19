import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*Crea con un editor un archivo de texto con un conjunto de numeros reales
 * uno por linea. Abrirlo con un flujo de texto para lectura y leerlo linea
 * a linea. Convertir las cadenas leídas en números de tipo double por me-
 * dio de Scanner, y mostrar al final, la suma de todos ellos.
 * ****************************SOLUCION**********************************
 */

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("Numeros.txt"));
            Scanner s;
            double numero;
            double suma = 0;
            String linea = in.readLine();
            while (linea != null) {// hasta final de fichero.
                s = new Scanner(linea).useLocale(Locale.US);
                if (s.hasNextDouble()) {// si es un numero real
                    numero = s.nextDouble();
                    suma += numero;
                }
                linea = in.readLine();
            }
            System.out.println("Suma: " + suma);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}