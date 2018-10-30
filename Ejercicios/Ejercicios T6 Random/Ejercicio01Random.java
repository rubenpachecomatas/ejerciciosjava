/*
 * Muestra 3 tiradas de un dado y su respectiva suma.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio01Random {
	
	public static void main (String[] args) {
		
    int total = 0;
    
    for (int cont = 0; cont < 3; cont++) {
      double num = (Math.random()*6) + 1;
      System.out.println((int)num);
      total = total + (int)num;
    }
    
    System.out.println("Suma = " + total);
    
	}
}

