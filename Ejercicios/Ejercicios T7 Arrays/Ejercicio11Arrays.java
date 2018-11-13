/*
 * Pide 10 números entre 0 y 100 colocando a continuacón los primos delante en
 * un Array.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio11Arrays {
	
	public static void main (String[] args) {
  
    int[] num = new int[20];
    int[] primo = new int[20];
    int[] noPrimo = new int[20];
    boolean primoC;
    int aux;
    int i;
    int primos = 0;
    int noPrimos = 0;
    
    System.out.println("Introduzca 10 números enteros: ");
    for (i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
      primoC = true;
      for (aux = 2; aux < num[i] - 1; aux++) {
        if (num[i] % aux == 0) {
          primoC = false;
        }
      }
      if (primoC) {
        primo[primos++] = num[i];
      } else {
        noPrimo[noPrimos++] = num[i];
      }
    }
    
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", num[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    for (i = 0; i < primos; i++) {
      num[i] = primo[i];
    }
    
    for (i = primos; i < primos + noPrimos; i++) {
      num[i] = noPrimo[i - primos];
    }
    
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", num[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
	}
}

