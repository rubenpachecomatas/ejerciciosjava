/*
 * Genera una cuba en base a la capacidad introducida. Se llenara con una
 * cantidad de litros aleatoria (Siempre que la capacidad lo permita).
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio20Random {
	
	public static void main (String[] args) {
  
    System.out.println("Introduce la capacidad de la cuba: ");
    int capacidad = Integer.parseInt(System.console().readLine());
    int litros = (int)(Math.random() * (capacidad + 1));
    System.out.println(litros);
    
    for (int i = 0; i < capacidad; i++) {
      System.out.printf("*");
      for (int cont = 0; cont < 4; cont++) {
        if (i < (capacidad - litros)) {
          System.out.printf(" ");
        } else {
          System.out.printf("=");
        }
      }
      System.out.println("*");
    }
    for (int contBase = 0; contBase < 6; contBase++) {
      System.out.printf("*");
    }
    
	}
}

