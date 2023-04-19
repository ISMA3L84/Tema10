import java.util.Arrays;

public class App {
    /*Escribe la función Integer[] leerEnteros(String texto), al que se le pasa
     * una cadena y devuelve una tabla con todos los enteros que aparecen en ella.
     */
   public static void main(String[] args) {
        String texto="sdf 7 dfgd 4 rthrth 45";//variable tipo String de nombre "texto."
        Integer[] num=leerEnteros(texto);//Creamos un array Integer[] num que es igual a leerEnteros de la variable String "texto"
        System.out.println(Arrays.toString(num));//Mostramos por pantalla el array num.
    }

    static Integer[] leerEnteros(String texto) {//creamos la funcion que nos pide el enunciado del ejercicio.
        String[] parametro = texto.split(" ");//hacemos un array de String de nombre parametro que sus datos seran los caracteres de la variable texto separados por un espacio.
        Integer numeros[] = new Integer[0];//creamos un array de tipo Integer llamado numeros con cero posiciones.
        for (int i = 0; i < parametro.length; i++) {//con este bucle for recorremos el array parámetro.
            try {
                Integer num = Integer.valueOf(parametro[i]);//integer num es igual al valor Integer de i del Array de String "parámetro"
                numeros = Arrays.copyOf(numeros, numeros.length + 1);//hacemos copia del array numeros y le incrementamos una posicion.
                numeros[numeros.length - 1] = num;//guardamos num en la posicon que hemos creado.
            } catch (NumberFormatException ex) {
                
            }
        }
        return numeros;//retornamos el valor numeros.
    }

}