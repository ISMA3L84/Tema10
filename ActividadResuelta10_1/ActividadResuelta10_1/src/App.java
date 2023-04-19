import java.nio.IntBuffer;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Escribir el metodo:
Integer leerEntero(),
 * que pide un entero por consola, lo lee del teclado y lo devuelve. Si
 * la cadena introducida por consola no tiene el formato correcto, mues-
 * tra un mesaje de error y vuelve a pedirlo.
 * 
 */

public class App {
    //***********SOLUCION************* */
    /* Establecemos un bucle infinito del que solo nos puede sacar el
    break que, por otra parte, solo se ejecutará si se produce la lec-
    tura de Scanner sin que salte una excepción InputMismatchException
    por una entrada de tipo erróneo.
     */
    static Integer leerEntero(){
        Integer resultado;
        while (true){
            try{
                System.out.println("Introducir entero: ");
                resultado = new Scanner(System.in).nextInt();
                break;/*aqui se llega solo si la lectura del Scanner ha
                sido correcta */
            }catch (InputMismatchException ex){
                System.out.println("Tipo erróneo");
            }
        }
        return resultado;
    }   
    

}
