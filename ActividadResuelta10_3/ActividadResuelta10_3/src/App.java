import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*Leer el archivo de texto Main.java de uno de los proyectos que hayamos
 * terminado y mostrarlo por pantalla.
 * 
 * ****************SOLUCION****************
 * Una vez abierto el flujo, leemos de él carácter a caracter, incluidos
 * los cambios de línea, y los vamos concatenando en la cadena de carac-
 * teres que al final contendrá el texto completo del archivo Main.java.
 * 
 */
/*Repetir la Actividad Resuelta 10.2 usando un flujo de texto con búfer.
 * *********************SOLUCION************************
 * 
 */
public class App {
    public static void main(String[] args) throws Exception {
       String texto = "Desde que la cabra tira al monte y la casta le viene al galgo... vamos a peor!!!";
      BufferedReader in = null;
      try{
        in = new BufferedReader(new FileReader("C:\\Users\\JAVA\\Java.Project\\Tema10\\ActividadResuelta10_1\\ActividadResuelta10_1\\src\\App.java"));
        String linea = in.readLine();
        while(linea != null){//mientras no llegue al final del archivo
        texto = texto + linea + '\n'; /*el cambio de línea hay que inser-
        tarlo manualmente */
        linea = in.readLine();
        }
      }catch (IOException ex){
        System.out.println(ex.getMessage());
      }finally{
        if (in != null){
            try{
                in.close();
            }catch (IOException ex){
                System.out.println(ex);
            }
        }
      }
          
            System.out.println(texto);//mostramos el texto leido.
        
    }
}