/**
 * Escribe un programa que nos diga el número de cifras de un número positivo
 * o negativo de hasta 5 cifras
 * 
 */

public class Ejercicio19If {
	
	public static void main (String[] args) {
		
    System.out.println("Introduce un número para saber cuantas cifras tiene: ");
    int x1 = Integer.parseInt(System.console().readLine());
    
    if (x1 >= 0 && x1 <= 9) {
      System.out.println("Una cifra.");
    } else if (x1 >= 10 && x1 <= 99) {
      System.out.println("Dos cifras.");
    } else if (x1 >= 100 && x1 <= 999) {
      System.out.println("Tres cifras.");
    } else if (x1 >= 1000 && x1 <= 9999) {
      System.out.println("Cuatro cifras.");
    } else if (x1 >= 10000 && x1 <= 99999) {
      System.out.println("Cinco cifras.");
    } else if (x1 <= -1 && x1 >= -9) {
      System.out.println("Una cifra.");
    } else if (x1 <= -10 && x1 >= -99) {
      System.out.println("Dos cifras.");
    } else if (x1 <= -100 && x1 >= -999) {
      System.out.println("Tres cifras.");
    } else if (x1 <= -1000 && x1 >= -9999) {
      System.out.println("Cuatro cifras.");
    } else if (x1 <= -10000 && x1 >= -99999) {
      System.out.println("Cinco cifras.");
    } else if (x1 > 99999 || x1 < -99999) {
      System.out.println("No se aceptan número de más de 5 cifras.");
    }
    
	}
}

