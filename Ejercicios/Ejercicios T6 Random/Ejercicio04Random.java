/*
 * Muestra 20 números aleatorios entre 0 y 10 separados por espacios.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio04Random {
	
	public static void main (String[] args) {
		
    for (int cont = 0; cont < 20; cont++) {
      int num = (int)(Math.random()*11);
      System.out.printf(num + " ");
    }
	}
}

