import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*Como ejemplo, vamos a guardar en un fichero de texto,
 * "En un lugar de La Mancha,
 * de cuyo nombre no quiero acordarme"
 * 
 * La primera línea, caracter a caracter, y la segunda, en una sola sentencia.
 * 
 * *******************************SOLUCION************************************
 */

public class App {
    public static void main(String[] args) throws Exception {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("quijote.txt"));
            String cad = "En un lugar de La Mancha,";// primera linea.
            for (int i = 0; i < cad.length(); i++) {
                out.write(cad.charAt(i));// escribimos caracter a caracter.
            }
            cad = "de cuyo nombre no quiero acordarme.";// segunda linea.
            out.newLine();// cambio de línea en el archivo.
            out.write(cad);// escribimos con una única sentencia.
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();// vaciamos bufer y se escribe en el archivo.
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

    }
}
