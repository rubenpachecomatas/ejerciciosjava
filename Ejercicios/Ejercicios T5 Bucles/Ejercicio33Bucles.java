/*
 * Muestra una U en pantalla en base a la altura introducida
 * 
 */


public class Ejercicio33Bucles {
	
	public static void main (String[] args) {
    
    System.out.println("Introduzca la altura de la U: ");
    int h = Integer.parseInt(System.console().readLine());
    
    for (int cont = 0; cont < h; cont++) {
      System.out.print("* ");
      for (int cont2 = 2; cont2 < h; cont2++) {
        System.out.print("  ");
      }
      System.out.println("*");
    }
    
    System.out.print("  ");
    for (int contB = 2; contB < h; contB++) {
      System.out.print("* ");
    }
	}
}

