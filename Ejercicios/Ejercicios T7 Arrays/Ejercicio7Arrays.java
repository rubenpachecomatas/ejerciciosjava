/*
 * Muestra 100 números entre 0 y 20, pide dos valores por teclado e intercambia
 * dentro de esos 100 el valor del primero por el valor del segundo.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio7Arrays {
	
	public static void main (String[] args) {
  
    int[] num = new int[100];
    int i;
    
    for (i = 0; i < 100; i++) {
      num[i] = (int)(Math.random() * 21);
    }
    
    
    for (i = 0; i < 100; i++) {
      System.out.printf(num[i] + " ");
    }
    
    System.out.println("\n\nIntroduzca dos valores entre 1 y 20: ");
    int primero = Integer.parseInt(System.console().readLine());
    int segundo = Integer.parseInt(System.console().readLine());
    System.out.println("");
    for (i = 0; i < 100; i++) {
      if (num[i] == primero) {
        System.out.printf("\"" + segundo + "\" ");
      } else if (num[i] != primero) {
        System.out.printf(num[i] + " ");
      }

    }
    
	}
}

