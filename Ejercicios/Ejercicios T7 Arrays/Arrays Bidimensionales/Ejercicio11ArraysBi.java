
package tema.pkg7.arrays;

/**
 *
 * @author ODLana
 */
public class Ejercicio11ArraysBi {
    
    public static void main(String[] args) {
        
        int[][] num = new int[10][10];
        int[] diagonal = new int[10];
        int fila;
        int columna;
        int i = 0;
        int min = 300;
        int max = 200;
        int total = 0;
        
        for (fila = 0; fila < 10; fila++) {
            System.out.println("");
            for (columna = 0; columna < 10; columna++) {
                num[fila][columna] = (int)(Math.random() * 101 + 200);
                System.out.print(num[fila][columna] + " ");
                if ((Math.abs(fila - columna)) == 0) {
                    diagonal[i] = num[fila][columna];
                    total += diagonal[i];
                    if (diagonal[i] < min) {
                        min = diagonal[i];
                    } else if (diagonal[i] > max) {
                        max = diagonal[i];
                    }
                    i++;
                }
            }
        }
        
        System.out.println("\n");
        
        for (i = 0; i < 10; i++) {
            System.out.print(diagonal[i] + " ");
        }
        
        System.out.println("\n\nMáximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + (total/10));
    }
    
}
