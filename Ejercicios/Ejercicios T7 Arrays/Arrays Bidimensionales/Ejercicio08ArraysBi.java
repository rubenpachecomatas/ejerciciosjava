package tema.pkg7.arrays;

import java.util.Scanner;

/**
 *
 * @author ODLana
 */
public class Ejercicio08ArraysBi {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.printf("Introduzca la posición del álfil: ");
        String pos = s.nextLine();
        int columnaAlfil = (int)(pos.charAt(0)) - 96;
        int filaAlfil = (int)(pos.charAt(1)) - 48;
        
        System.out.println(columnaAlfil);
        System.out.println(filaAlfil);

        for (int fila = 8; fila >= 1; fila--) {
            for (int columna = 1; columna <= 8; columna++) {
                if (!((filaAlfil == fila) && (columnaAlfil == columna)) &&
                        (Math.abs(filaAlfil - fila)) == 
                        (Math.abs(columnaAlfil - columna))) {
                    
                    System.out.println(" " + (char)(fila + 96) + columna);

                }
            }
        }

    }
}
