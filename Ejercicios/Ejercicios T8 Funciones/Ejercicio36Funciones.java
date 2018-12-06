
package tema.pkg8.funciones;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ODLana
 */
public class Ejercicio36Funciones {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el tamaño del array: ");
        int n = Integer.parseInt(s.nextLine());
        System.out.println("Introduzca el valor máximo del array: ");
        int max = Integer.parseInt(s.nextLine());
        System.out.println("Introduzca el valor mínimo del array: ");
        int min = Integer.parseInt(s.nextLine());
        int[] x = matematicas.funcionesArray.generaArrayInt(n, max, min);
        System.out.println(Arrays.toString(filtraPrimos(x)));
        
    }
    
    public static int[] filtraPrimos(int x[]) {
        
        int cont = 0;
        for (int i = 0; i < x.length; i++) {
            if (matematicas.funciones.esPrimo(x[i])) {
                cont++;
            }
        }
        
        int[] res = new int[cont];
        int cont2 = 0;
        
        for (int i = 0; i < x.length; i++) {
            if (matematicas.funciones.esPrimo(x[i])) {
                res[cont2] = x[i];
                cont2++;
            }
        }
        
        return res;
    }
}
