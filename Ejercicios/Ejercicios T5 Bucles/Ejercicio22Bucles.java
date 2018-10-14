/*
 * Muestra los números primos entre el 0 y el 100.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio22Bucles {
	
	public static void main (String[] args) {
      
    boolean comprob = true;
    
    for (int x = 2; x <= 100; x++ ) {
      comprob = true;
      for (int cont = 2; cont < x; cont++) {
        if (x % cont == 0) {
          comprob = false;
        }
      }
      if (comprob) {
        System.out.print(x + " ");
      }
    }
    
	}
}

