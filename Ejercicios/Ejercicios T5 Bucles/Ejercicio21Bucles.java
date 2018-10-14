/*
 * Pide números positivos hasta introducir una negativo (no incluido).
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio21Bucles {
	
	public static void main (String[] args) {
    
    int num;
    int numImpar = 0;
    int numCuent = 0;
    int numCuentN = 0;
    int numN = 0;
    int max = 0;
    
    do {
      System.out.println("Introduce números postivos (STOP = Número negativo): ");
      num = Integer.parseInt(System.console().readLine());
      if (num >= 0) {
        numCuent++;
        if ((num % 2) == 1) {
          numCuentN++;
          numN = numN + num;
        } else if (num >= max) {
          max = num;
        }
      }
    } while (num >= 0);
    
    System.out.println("Total de números introducidos: " + numCuent);
    System.out.println("Media impar: " + (numN / numCuentN));
    System.out.println("Mayor número par: " + max);
    
	}
}

