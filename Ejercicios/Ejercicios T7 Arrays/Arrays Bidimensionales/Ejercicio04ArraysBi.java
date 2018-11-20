
package tema.pkg7.arrays;

/**
 *
 * @author ODLana
 */
public class Ejercicio04ArraysBi {
    public static void main(String[] args) throws InterruptedException {

          int[][] num = new int[4][5];
          int fila;
          int columna;
          int sumaFila;
          int sumaColumna;
          int total = 0;

          System.out.println("Introduce 20 números enteros: ");
          for (fila = 0; fila < 4; fila++) {
            for (columna = 0; columna < 5; columna++) {
              num[fila][columna] = (int)(Math.random()*900 + 100);
            }
          }

          for (fila = 0; fila < 4; fila++) {
            sumaFila = 0;
            for (columna = 0; columna < 5; columna++) {
              System.out.printf("%3d   ", num[fila][columna]);
              sumaFila = sumaFila + num[fila][columna];
              Thread.sleep(100);
            }
            System.out.printf("|%3d", sumaFila);
            System.out.println("");
            Thread.sleep(500);
          }

          for (columna = 0; columna < 5; columna++) {
            sumaColumna = 0;
            for (fila = 0; fila < 4; fila++) {
              sumaColumna = sumaColumna + num[fila][columna];
            }
            total = total + sumaColumna;
            System.out.printf("%3d   ", sumaColumna);
            Thread.sleep(500);
          }
          System.out.printf("|%3d   ", total);
    }
}
