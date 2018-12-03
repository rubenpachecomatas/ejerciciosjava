
package tema.pkg8.funciones;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ODLana
 */
public class Ejercicio20Funciones {
    public static void main(String[] args) {
        
        //Genera un array unidimensional.
        
        Scanner s = new Scanner(System.in);
        System.out.println("Prueba generaArrayInt, maxArrayInt, minArrayInt y"
                + " mediaArrayInt. ");
        System.out.println("Introduce el tamaño del array:  ");
        int n = Integer.parseInt(s.nextLine());
        System.out.println("Introduce el valor máximo dentro del array:  ");
        int max = Integer.parseInt(s.nextLine());
        System.out.println("Introduce el valor mínimo dentro del array:  ");
        int min = Integer.parseInt(s.nextLine());
        int[] num = matematicas.funcionesArray.generaArrayInt(n, max, min);
        System.out.println(Arrays.toString(num));
        
        //Saca el valor mínimo de un array.
        
        int maxValor = max;
        System.out.println(matematicas.funcionesArray.minimoArrayInt(num, maxValor));
        
        //Sacar el valor máximo de un array.
        
        int minValor = min;
        System.out.println(matematicas.funcionesArray.maximoArrayInt(num, minValor));
        
        //Sacar la media de un array.
        
        System.out.println(matematicas.funcionesArray.mediaArrayInt(num));
        
        //Comprueba si el numero está en el array.
        
        System.out.println("Introduce un valor para comprobar si está en el array:  ");
        n = Integer.parseInt(s.nextLine());
        System.out.println(matematicas.funcionesArray.estaEnArrayInt(num, n));

        //Comprueba si el numero está en el array.
        
        System.out.println("Introduce un valor para obtener la posición"
                + " en el array:  ");
        n = Integer.parseInt(s.nextLine());
        System.out.println(matematicas.funcionesArray.posicionEnArray(num, n));
        
        // Le da la vuelta al array.
        
        System.out.println("Array del revés: ");
        System.out.println(Arrays.toString(matematicas.funcionesArray.volteaArrayInt(num)));
        
        // Rota a la derecha n posiciones.
        
        System.out.println("Introduzca el número de posiciones que desea rotar"
                + " hacia la derecha:  ");
        n = Integer.parseInt(s.nextLine());
        System.out.println(Arrays.toString(matematicas.funcionesArray.rotaDerechaArrayInt(num, n)));
        
        // Rota a la izquierda n posiciones.
        
        System.out.println("Introduzca el número de posiciones que desea rotar"
                + " hacia la izquierda:  ");
        n = Integer.parseInt(s.nextLine());
        System.out.println(Arrays.toString(matematicas.funcionesArray.rotaIzquierdaArrayInt(num, n)));
    }
}