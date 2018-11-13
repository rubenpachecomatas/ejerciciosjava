/*
 * Genera 100 números entre 0 y 500 ambos incluidos. Preguntará al usuario si
 * quiere resaltar entre comillas el máximo o el mínimo.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio13Arrays {
	
	public static void main (String[] args) {
  
    int[] num = new int[100];
    int i;
    int max = 0;
    int min = 500;
    int opcion = 0;
    
    for (i = 0; i < 100; i++) {
      num[i] = (int)(Math.random()*501);
      System.out.print(num[i] + " ");
      if (num[i] > max) {
        max = num[i];
      } else if (num[i] < min) {
        min = num[i];
      }
    }

    System.out.println("\n\n¿Resaltar máximo o mínimo? (1. Max | 2. Min)");
    int res = Integer.parseInt(System.console().readLine());
    
    if (res == 1) {
      opcion = max;
    } else if (res == 2) {
      opcion = min;
    }
    
    for (i = 0; i < 100; i++) {
      if (num[i] == opcion) {
        System.out.print(" **" + opcion + "** ");
      } else {
        System.out.print(num [i] + " ");
      }
    }
    
	}
}

