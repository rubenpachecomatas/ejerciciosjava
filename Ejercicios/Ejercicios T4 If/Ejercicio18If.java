/*
 * Escribe un programa que te diga la primera cifra de un número entero
 * introducido por teclado de hasta 5 cifras.
 * 
 */

public class Ejercicio18If {
	
	public static void main (String[] args) {
		
    System.out.println("Introduce un número para saber cual es su primera cifra: ");
    int x1 = Integer.parseInt(System.console().readLine());
    
    if (x1 >= 0 && x1 <= 9) {
      System.out.println(x1);
    } else if (x1 >= 10 && x1 <= 99) {
      System.out.println(x1 / 10);
    } else if (x1 >= 100 && x1 <= 999) {
      System.out.println(x1 / 100);
    } else if (x1 >= 1000 && x1 <= 9999) {
      System.out.println(x1 / 1000);
    } else if (x1 >= 10000 && x1 <= 99999) {
      System.out.println(x1 / 10000);
    } else  if 8(x1 > 99999) {
      System.out.println("No se aceptan número de más de 5 cifras, tampoco negativos.");
    }
	}
}
