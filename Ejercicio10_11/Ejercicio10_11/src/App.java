import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*Escribe un programa que solicite al usuario el nombre de un fichero de
 * texto y muestre su contenido en pantalla. Si no se proporciona ningún
 * nombre de fichero, la aplicación utilizará por defecto prueba.txt.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la ruta de acceso al archivo: ");
        String archivo = sc.nextLine();
        if(archivo.equals("")){
            archivo = "prueba.txt";
        }
        String texto = "";
       BufferedReader br = null;
       try{
        br = new BufferedReader(new FileReader(archivo));
        String linea = br.readLine();
        while(linea != null){
            texto = texto + linea + '\n';
            linea = br.readLine();
        }
       }catch (IOException ex){
        System.out.println(ex.getMessage());
       }
       System.out.println(texto);
    }
}
