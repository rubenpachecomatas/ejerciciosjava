/*
 * Muestra los números del 320 al 160 contando hacia atrás de 20 en 20 con un
 * bucle Do-While.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio6Bucles {
	
	public static void main (String[] args) {
		
    int x = 340;
    
    do {
      x = x - 20;
      System.out.println(x + " ");
    }
    
    while (x > 160);
    
	}
}

