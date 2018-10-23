/*
 * Muestra si el número introducido por teclado es primo o no.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio16Bucles {
	
	public static void main (String[] args) {
    
    System.out.println("Introduzca un número para saber si es primo o no: ");
    int num = Integer.parseInt(System.console().readLine());
    
    boolean primo = true;
    
    for (int cont = 2; cont < num; cont++) {
      if (num % cont == 0) {
        primo = false;
      }
    }
    
    if (primo) {
      System.out.println("Es primo");
    } else {
      System.out.println("No es primo");
    }
    
	}
}

