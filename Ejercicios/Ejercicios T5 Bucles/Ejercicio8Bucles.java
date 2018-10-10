/*
 * Muestra la tabla de multiplicar del número introducido.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio8Bucles {
	
	public static void main (String[] args) {
		
    System.out.println("Introduzca un número para obtener su tabla de multiplicar: ");
    int num = Integer.parseInt(System.console().readLine());
      
    for (int x = 0; x < 11; x++ ) {
      System.out.println(num + " por " + x +" = " + (num * x));
    }
    
	}
}

