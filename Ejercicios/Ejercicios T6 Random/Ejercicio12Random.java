/*
 * Llena la pantalla de carácteres a lo Matrix.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio12Random {
	
	public static void main (String[] args) {
    
    for (int cont = 0; cont < 2000; cont++) {
      System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
    }
	}
}

