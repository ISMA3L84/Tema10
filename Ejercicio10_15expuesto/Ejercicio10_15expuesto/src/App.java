import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*En el archivo numeros.txt disponemos de una serie de números (uno por cada línea).
 * Diseña un programa que procese el fichero y nos muestre el mayor y el menor.
 * 
 * **************************************SOLUCION**************************************
 */
public class App {
    public static void main(String[] args) {
        int minimo;//variable de tipo entero donde guadarmos el minimo
        int maximo;//variable de tipo entero donde guardamos el maximo

       //A continuacion procesamos el archivo para saca el numero minimo y el numero maximo:
        try ( BufferedReader br = new BufferedReader(new FileReader("numeros.txt"))) {//leemos los datos del archivo numeros.txt
            String linea = br.readLine();
            if (linea != null) {//si linea es distinta de null
                minimo = maximo = Integer.valueOf(linea);//convertimos datos de String a Integer.
                linea = br.readLine();
                
                while (linea != null) {//mientras linea sea diferente a null
                    int num = Integer.valueOf(linea);//num es igual al dato de linea convertido a Integer.
                    if (num > maximo) {//si num es mayor que maximo
                        maximo = num;//maximo es igual a num
                    }
                    if (num < minimo) {//si num es menor que minimo
                        minimo = num;//minimo es igual a num
                    }
                    linea = br.readLine();//linea es igual a los datos leidos del BufferedReader.
                }
                System.out.println("Valor mínimo: " + minimo);//mostramos el minimo por pantalla
                System.out.println("Valor máximo: " + maximo);//mostramos el maximo por pantalla
            }
        } catch (IOException ex) {//Nos da error si no se encuentran datos "supongo".
            System.out.println(("MENSAJE PERSONALIZADO PARA ISMAEL: "+ex));
        }
        
    }
   
    
    /*El método valueOf() convierte los datos de su forma interna en una forma legible por humanos.
     Es un método estático que está sobrecargado dentro de la String para todos los tipos integrados
    de Java, de modo que cada tipo se pueda convertir correctamente en una String.  */

}