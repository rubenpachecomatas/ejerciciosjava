/*
 * Muestra una X en base a la altura introducida por teclado impar y mayor o
 * igual a 3.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio35Bucles {
	
	public static void main (String[] args) {
		
    System.out.println("Introduce la altura de la X: ");
    int h = Integer.parseInt(System.console().readLine());
    
    int esIz = 0;
    int esCen = h - 2;
    
    // Altura
    for (int cont = 0; cont < h; cont++) {
      
      // Espacios izquierda
      for (int es = 0; es < esIz; es++) {
        System.out.print(" ");
      }
      
      System.out.print("*");
      
      // Espacios centrales
      for (int es = 0; es < esCen; es++) {
        System.out.print(" ");
      }
      if (cont != h / 2) {
        System.out.println("*");
      } else if (cont == h / 2) {
        System.out.println("");
      }
      
      if (cont < (h / 2)) {
        esIz++;
        esCen -= 2;
      } else if(cont >= (h / 2)) {
        esIz--;
        esCen += 2;
      }
      
    }
    
	}
}
