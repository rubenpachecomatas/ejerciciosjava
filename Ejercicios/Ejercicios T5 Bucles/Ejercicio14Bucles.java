/*
 * Calcula un número elevado a un exponente, ambos pedidos por teclado.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio14Bucles {
	
	public static void main (String[] args) {
    
      System.out.print("Introduce la base: ");
      int ba = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce el exponente: ");
      int exp = Integer.parseInt(System.console().readLine());
      
      System.out.print(Math.pow(ba, exp));
      
	}
}

