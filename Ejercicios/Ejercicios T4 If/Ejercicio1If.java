/*
 * Muestra que asignatura toca a primera hora en base al día.
 * 
 */
 
public class Ejercicio1If {
  public static void main(String[] args) {
    
	System.out.println("¿Qué día es?");
	String dia = System.console().readLine();
	
	if (dia.equals("Lunes")) {		
	  System.out.println("A primera hora tienes Entornos de desarrollo.");
	} else if (dia.equals("Martes")) {
	  System.out.println("A primera hora tienes Sistemas informáticos.");
	} else if (dia.equals("Miércoles")) {
	  System.out.println("A primera hora tienes Programación.");
	} else if (dia.equals("Jueves")) {
	  System.out.println("A primera hora tienes Programación.");
	} else if (dia.equals("Viernes")) {
	  System.out.println("A primera hora tienes Sistemas Informáticos.");
	} else {
		System.out.println("No tienes clase.");
	}
  }
}
