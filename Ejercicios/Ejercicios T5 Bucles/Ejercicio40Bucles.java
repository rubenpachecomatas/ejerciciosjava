/*
 * Muestra un rombo hueco en base a la altura introducida por teclado. Solo
 * números impares mayores a 3.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio40Bucles {
	
	public static void main (String[] args) {
		
    System.out.println("Introduzca la altura del rombo: ");
    int h = Integer.parseInt(System.console().readLine());
    
    int esIz = h / 2;
    int espaciosCentro = -1;
    
    if ((h >= 3) && (h % 2 == 1)) {
      for (int altura = 0; altura < h; altura++) {
        // Espacios de la izquierda
        for (int es = 0; es < esIz; es++) {
          System.out.print(" ");
        }
        
        System.out.print("*");
        
        // Espacios centro
        for (int e = 0; e < espaciosCentro; e++) {
          System.out.print(" ");
        }
        
        if ((altura > 0) && (altura < (h - 1))) {
          System.out.println("*");
        } else {
          System.out.println("");
        }
        
        
        if (altura < (h / 2)) {
          esIz--;
          espaciosCentro+=2;
        } else {
          esIz++;
          espaciosCentro-=2;
        }
      }
    } else {
      System.out.println("Número no válido, introduzca un valor impar mayor o igual a 3");
    }
	}
}

