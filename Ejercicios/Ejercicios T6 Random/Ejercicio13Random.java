/*
 * Simula la tirada de dos dados en bucle hasta que ambos tengan el mismo valor.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio13Random {
	
	public static void main (String[] args) {
    
    int dado1;
    int dado2;
    
    do {
      
      dado1 = (int)(Math.random() * 6 + 1);
      dado2 = (int)(Math.random() * 6 + 1);
      
      System.out.printf(dado1 + " & " + dado2 + "\n");
      
    } while (dado1 != dado2);
	}
}

