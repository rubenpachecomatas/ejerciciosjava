/*
 * Muestra 50 números aleatorios entre -100 y 200. También muestra su media, el
 * mayor par y el menor impar.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio19Random {
	
	public static void main (String[] args) {
  
    int num;
    int total = 0;
    int maxPar = -100;
    int minImpar = 200;
  
    for (int cont = 0; cont < 50; cont++) {
      num = (int)(Math.random() * 301 - 100);
      System.out.printf(num + " ");
      total = total + num;
      if (num % 2 == 0 && num > maxPar) {
        maxPar = num;
      } else if (num % 2 != 0 && num < minImpar) {
        minImpar = num;
      }
    }
    
    System.out.println("\n\nMedia = " + (total / 50));
    System.out.println("Mayor par = " + maxPar);
    System.out.println("Mínimo impar = " + minImpar);
    
	}
}

