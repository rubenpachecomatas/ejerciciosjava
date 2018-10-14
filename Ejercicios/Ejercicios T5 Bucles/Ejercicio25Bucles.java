/*
 * Muestra el número introducido por teclado pero al revés.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio25Bucles {
	
	public static void main (String[] args) {
		
    System.out.print("Introduzca un número para verlo al revés: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int aux = num;
    int reves = 0;
    
    while (aux > 0) {
      reves = (reves * 10) + (aux % 10);
      aux = aux / 10;
    }
    
    
    System.out.print(reves);
    
    
	}
}

