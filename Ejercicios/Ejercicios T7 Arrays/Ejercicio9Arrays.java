/*
 * Pide 8 números enteros y muestra si son pares o impares.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio9Arrays {
	
	public static void main (String[] args) {
  
    int[] num = new int[12];
    int i;
    
    System.out.println("Introduzca 8 números enteros: ");
    for (i = 0; i < 8; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("");
    
    for (i = 0; i < 8; i++) {
      System.out.print(num[i] + " | ");
      if (num[i] % 2 == 0) {
        System.out.println("Par");
      } else if (num[i] % 2 != 0) {
        System.out.println("Impar");
      }
    }

	}
}

