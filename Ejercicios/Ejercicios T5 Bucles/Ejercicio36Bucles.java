/*
 * Muestra si un número introducido por teclado es o no capicúa.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio36Bucles {
	
	public static void main (String[] args) {
		
    System.out.println("Introduzca un número entero positivo: ");
    long num = Long.parseLong(System.console().readLine());
    
    long aux = num;
    
    // Le damos la vuelta al número.
    long numeroVolteado = 0;
    
    while (aux > 0) {
      int digito = (int)(aux % 10);
      aux = aux / 10;
      numeroVolteado = numeroVolteado * 10 + digito;
    }
    
    if (num == numeroVolteado) {
      System.out.println("Es capicúa");
    } else {
      System.out.println("No es capicúa");
    }
    
	}
}

