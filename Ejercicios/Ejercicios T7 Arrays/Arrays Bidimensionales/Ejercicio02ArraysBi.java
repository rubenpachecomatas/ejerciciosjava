
package tema.pkg7.arrays;

import java.util.Scanner;

/**
 *
 * @author ODLana
 */
public class Ejercicio02ArraysBi {

    public static void main(String[] args) {
        
      Scanner s = new Scanner(System.in);
      
      int[][] num = new int[4][5];
      int fila;
      int columna;
      int sumaFila;
      int sumaColumna;
      int total = 0;
      
      System.out.println("Introduce 20 números enteros: ");
      for (fila = 0; fila < 4; fila++) {
        for (columna = 0; columna < 5; columna++) {
          num[fila][columna] = Integer.parseInt(s.nextLine());
        }
      }
      
      for (fila = 0; fila < 4; fila++) {
        sumaFila = 0;
        for (columna = 0; columna < 5; columna++) {
          System.out.printf("%3d   ", num[fila][columna]);
          sumaFila = sumaFila + num[fila][columna];
        }
        System.out.printf("|%3d", sumaFila);
        System.out.println("");
      }
      
      for (columna = 0; columna < 5; columna++) {
        sumaColumna = 0;
        for (fila = 0; fila < 4; fila++) {
          sumaColumna = sumaColumna + num[fila][columna];
        }
        total = total + sumaColumna;
        System.out.printf("%3d   ", sumaColumna);
      }
      System.out.printf("|%3d   ", total);
    }

}
