
package tema.pkg8.funciones;

import java.util.Scanner;

/**
 *
 * @author ODLana
 */
public class Ejercicio35Funciones {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un número decimal: ");
        int n = Integer.parseInt(s.nextLine());
        System.out.println(convierteEnPalotes(n));
        
    }
    
    public static String convierteEnPalotes(int n) {
        
        int cont = matematicas.funciones.digitos(n);
        int[] numSeparado = new int[cont];
        String res = "";
        
        for (int i = 0; i < cont; i++) {
            numSeparado[i] = n % 10;
            n = n / 10;
        }
        
        int numSeparadoReves[] = matematicas.funcionesArray.volteaArrayInt(numSeparado);
        
        for (int i = 0; i < cont; i++) {
            for (int j = 0; j < numSeparadoReves[i]; j++) {
                res = res + "|";
            }
            if (i != cont - 1) {
                res = res + " - ";
            }
        }
        
        return res;
        
    }
    
}
