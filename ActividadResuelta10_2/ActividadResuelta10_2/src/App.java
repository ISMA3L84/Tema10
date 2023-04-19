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

public class App {
    public static void main(String[] args) throws Exception {
       String texto = "Desde que la cabra tira al monte y la casta le viene al galgo... vamos a peor!!!";
       FileReader in = null; /*la declaramos fuera de la estructura try/catch
       para que sea accesible tambien desde fuera */

       try{
        in = new FileReader("C:\\Users\\JAVA\\Java.Project\\Tema10\\ActividadResuelta10_1\\ActividadResuelta10_1\\src\\App.java");
        int c = in.read();
        while (c != -1){//Mientras no lleguemos al final del archivo.
            texto = texto + (char) c;//convertimos c a char.
            c = in.read();
        }
       
    }catch (IOException ex){
       System.out.println(ex.getMessage()); 
    } finally {//en todo caso, cerramos el flujo
        if (in != null){//si el flujo está abierto.
            try{
                in.close(); //cerramos el flujo.
            }catch (IOException ex){
                System.out.println(ex.getMessage());
            }finally{//en todo caso cerramos el flujo.
                if(in != null){//si el flujo está abierto
                    try{
                        in.close();//cerramos el flujo
                    }catch (IOException ex){
                        System.out.println(ex);
                    }
                    }
                }
            }
            System.out.println(texto);//mostramos el texto leido.
        }
    }
}
