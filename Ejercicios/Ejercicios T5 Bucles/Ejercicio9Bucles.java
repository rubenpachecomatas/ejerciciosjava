/*
 * Muestra el número de dígitos del valor introducido.
 * 
 * @author Rubén Pacheco Matas
 */

public class Ejercicio9Bucles {
	
	public static void main (String[] args) {
		
    int cuenta = 0;
    
    System.out.print("Introduce un número para obtener el número de dígitos: ");
    int x = Integer.parseInt(System.console().readLine());
    
      while (x > 0) {
        x = x / 10;
        cuenta++;
      }
    
    System.out.print("El número de dígitos es de " + cuenta);
    
	}
}

