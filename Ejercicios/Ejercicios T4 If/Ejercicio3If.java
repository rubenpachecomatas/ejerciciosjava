/*
 * Muestra el día de la semana en base a un número.
 * 
 */
 
public class Ejercicio3If {
  public static void main(String[] args) {
    
    int x;
	
	System.out.println("Dime un número del 1 al 7.");
	x = Integer.parseInt(System.console().readLine());
	
	if (x == 1) {
	  System.out.println("Lunes");
	} else if (x == 2) {
	  System.out.println("Martes");
	} else if (x == 3) {
	  System.out.println("Miércoles");
	} else if (x == 4) {
	  System.out.println("Jueves");
	} else if (x == 5) {
	  System.out.println("Viernes");
	} else if (x == 6) {
	  System.out.println("Sábado");
	} else if (x == 7) {
	  System.out.println("Domingo");
	}
  }
}
