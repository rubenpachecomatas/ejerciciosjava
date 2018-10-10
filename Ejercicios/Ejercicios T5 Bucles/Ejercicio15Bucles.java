/*
 * Calcula un número elevado a un exponente, ambos pedidos por teclado, además
 * de ese mismo número elevado a todos los exponentes menores que el introducido
 * desde el 0.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio15Bucles {
	
	public static void main (String[] args) {
    
      System.out.print("Introduce la base: ");
      int ba = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce el exponente: ");
      int exp = Integer.parseInt(System.console().readLine());
      
      while (exp > 0) {
        System.out.print(Math.pow(ba, exp) + "\n");
        exp = exp - 1;
      }
      
	}
}

