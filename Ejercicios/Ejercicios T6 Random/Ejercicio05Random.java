/*
 * Muestra 50 números aleatorios entre 100 y 199 así como su máximo, mínimo y la
 * media de todos.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio05Random {
	
	public static void main (String[] args) {
		
    int max = 0;
    int min = 200;
    int total = 0;
    
    for (int cont = 0; cont < 50; cont++) {
      int num = (int)((Math.random()*100) + 100);
      System.out.printf(num + " ");
      
      if (num > max) {
        max = num;
      } else if (num < min) {
        min = num;
      }
      
      total = total + num;
    }
    
    System.out.println("\n\nMáximo = " + max);
    System.out.println("Mínimo = " + min);
    System.out.println("Media = " + (total / 50));
	}
}

