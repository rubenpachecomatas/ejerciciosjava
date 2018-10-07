/*
 * Muestra  Buenos días/tardes/noches en base a la hora.
 * 
 */
 
public class Ejercicio2If {
  public static void main(String[] args) {
    
	int hora;
	
	System.out.println("¿Qué hora es?");
	hora = Integer.parseInt(System.console().readLine());
	
	if (hora >= 6 && hora <= 12) {
	  System.out.println("¡Buenos días!");
	} else if (hora >= 13 && hora <= 20) {
	  System.out.println("¡Buenos tardes!");
	} else {
	  System.out.println("¡Buenos noches!");
	}
  }
}
