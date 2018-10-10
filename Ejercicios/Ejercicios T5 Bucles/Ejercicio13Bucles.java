/*
 * Divide 10 números en positivos y negativos.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio13Bucles {
	
	public static void main (String[] args) {
    
    for (int x = 0; x < 10; x++) {
      System.out.print("Introduce un número para saber si es positivo o negativo: ");
      int n = Integer.parseInt(System.console().readLine());
      if (n >= 0) {
        System.out.print("Positivo\n");
      } else if (n < 0){
        System.out.print("Negativo\n");
      }
    }
    
	}
}

