import java.util.Scanner;

/*Diseña una aplicación que pida al usuario su nombre y edad. Estos datos
 * deben guardarse en el fichero de datos.txt. Si este fichero existe, de-
 * ben añadirse al final en una nueva línea, y en caso de no existir, debe
 * crearse.
 */
 

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.next();
        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();
        
    }
}
