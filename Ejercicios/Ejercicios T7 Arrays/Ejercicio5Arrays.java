/*
 * Pide 10 números por teclado y los muestra junto con la palabra "máximo" y
 * "mínimo" escrita a un lado del respectivo máximo y mínimo.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio5Arrays {
	
	public static void main (String[] args) {
  
    System.out.println("Introduce 10 números por teclado: ");
    int[] num = new int[10];
    int i;
    
    for (i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("----------------------------------");
    
    int minimo = num[0];
    int maximo = num[0];
    
    for (int cont = 0; cont < 10; cont++) {
      if (num[cont] < minimo) {
        minimo = num[cont];
      } else if (num[cont] > maximo) {
        maximo = num[cont];
      }
    }
    
    for (int cont2 = 0; cont2 < 10; cont2++) {
      System.out.print(num[cont2]);
      if (minimo == num[cont2]) {
        System.out.printf(" Mínimo");
      } else if (num[cont2] == maximo) {
        System.out.printf(" Máximo");
      }
      System.out.println("");
    }

	}
}

