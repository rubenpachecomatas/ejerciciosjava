/*
 * Muestra una L a partir de la altura introducida por teclado.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio31Bucles {
	
	public static void main (String[] args) {
    
    System.out.println("Introduce la altura de la L: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.println("\n");
    
    int cont = 1;
    int cont2 = 0;
    
    while (h > cont) {
      System.out.println("*");
      cont ++;
    }
    while ((h / 2) > cont2) {
      System.out.print("* ");
      cont2 ++;
    }
    
    System.out.print("*");
    
	}
}

