/*
 * Pide 10 números por teclado y los muestra a la inversa.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio3Arrays {
	
	public static void main (String[] args) {
  
    System.out.println("Introduce 10 números por teclado: ");
    int[] num = new int[10];
    int i;
    
    for (i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    for (int cont = 9; cont > -1; cont--) {
      System.out.printf(num[cont] + " ");
    }

	}
}

