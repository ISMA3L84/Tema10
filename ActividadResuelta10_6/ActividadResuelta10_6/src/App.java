import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Crear con un editor de texto Enteros.txt en la carpeta del proyecto 
 * actual de NetBeans y escribir en él una serie de enteros separados
 * por secuencias de espacios y tabuladores, incluso en líneas distin-
 * tas, tal como:
 *  2   3   45   73
 * 123     4      21
 * Implementar un programa que acceda a Enteros.txt con un objeto Scanner
 * a través de un flujo de entrada, lea los números y calcule su suma y
 * su media aritmetica, mostrando los resultados por pantalla.
 * ******************************SOLUCION****************************************
 * 
 * Primero creamos el flujo de texto a partir del nombre del archivo. Como
 * dentro del bloque try solo se va a abrir el archivo y no se va a leer
 * de el, basta con la excepcion FileNotFoundException, que es una subclase
 * de IOException
 */

public class App {
    public static void main(String[] args) throws Exception {
       FileInputStream flujo = null;
       try{
        flujo = new FileInputStream("Enteros.txt");
       }catch (FileNotFoundException ex){//valdría su superclase IOException
    System.out.println(ex.getMessage());
    }
    Scanner s = new Scanner(flujo);
    int contador = 0;
    int suma = 0;
    while(s.hasNext()){//no sabemos cuantos numeros hay.
    int n = s.nextInt();
    System.out.println(n + " ");//vamos mostrando los números leídos.
    suma += n;
    contador ++;
    }
    double media = (double) suma / contador; //la media es un número real.
    System.out.println("\nsuma: " + suma + " media: " + media);
    }
}
