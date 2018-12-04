
package tema.pkg8.funciones;

import java.util.Scanner;

/**
 *
 * @author ODLana
 */
public class Ejercicio18Funciones {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un número decimal: ");
        int num = Integer.parseInt(s.nextLine());
        int aux = num;
        int cont = 0;
        
        while (aux != 1) {
            aux = aux / 2;
            cont++;
        }

        int[] numA = new int[cont + 1];
        
        for (int i = 0; i < cont; i++) {
            numA[i] = num % 2;
            num = num / 2;
        }
        
        numA[cont] = 1;
        
        System.out.println("");
        int[] reves = matematicas.funcionesArray.volteaArrayInt(numA);
        
        for (int i = 0; i < reves.length; i++) {
            System.out.print(reves[i]);
        }
        
    }
}
