/*
 * Pide 15 números por teclado, los almacena en un array y los muestra corridos
 * una posición.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio6Arrays {
	
	public static void main (String[] args) {
  
    System.out.println("Introduce 15 números por teclado: ");
    int[] num = new int[15];
    int i;
    
    for (i = 0; i < 15; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    int aux = num[0];
    
    for ( int cont = 0; cont < 14; cont++) {
      num[cont] = num[(cont + 1)];
    }
    
    num[14] = aux;
    
    for (i = 0; i < 15; i++) {
      System.out.printf(num[i] + " ");
    }
    
	}
}

