/*
 * Pinta una serpiente y su respectivo serpenteo.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio22Random {
	
	public static void main (String[] args) {
  
    System.out.println("Introduzca la longitud de la serpiente: ");
    int longitud = Integer.parseInt(System.console().readLine());
    
    System.out.println("            @");
    for (int cont = 0; cont < (longitud - 1); cont++) {
      int auxEs = 13;
      auxEs = auxEs + (int)(Math.random() * 3) - 1;
      for (int i = 0; i < auxEs; i++) {
        System.out.printf(" ");
      }
      System.out.println("*");
    }
    
	}
}

