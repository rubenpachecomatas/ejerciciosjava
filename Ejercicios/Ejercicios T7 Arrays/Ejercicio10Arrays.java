/*
 * Genera 20 números entre 0 y 100 colocando a continuacón los pares delante en
 * un Array.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio10Arrays {
	
	public static void main (String[] args) {
  
    int[] num = new int[20];
    int[] par = new int[20];
    int[] impar = new int[20];
    int i;
    int pares = 0;
    int impares = 0;
    
    for (i = 0; i < 20; i++) {
      num[i] = (int)(Math.random()*101);
      if (num[i] % 2 == 0) {
        par[pares++] = num[i];
      } else {
        impar[impares++] = num[i];
      }
    }
    
    for (i = 0; i < pares; i++) {
      num[i] = par[i];
    }
    
    for (i = pares; i < 20; i++) {
      num[i] = impar[i - pares];
    }
    
    for (i = 0; i < 20; i++) {
      System.out.print(num[i] + " ");
    }
    
	}
}

