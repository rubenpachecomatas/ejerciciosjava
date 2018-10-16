/*
 * Muestra los dígitos pares de un número pedido por teclado y su suma.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio32Bucles {
	
	public static void main (String[] args) {
		
    System.out.println("Introduzca un número entero positivo: ");
    long numIntro = Integer.parseInt(System.console().readLine());
    
    long num = numIntro;
    long reves = 0;
    
    while (numIntro > 0) {
      reves = (reves * 10) + (numIntro % 10);
      numIntro /= 10;
    }
    
    System.out.print("Dígitos pares: ");
    
    int suma = 0;
    
    while (reves > 0) {
      long digito = reves % 10;
      if (digito % 2 == 0) {
        System.out.print(digito + " ");
        suma += digito;
      }
      reves /= 10;
    }
    
    System.out.println("\nSuma de los dígitos pares: " + suma);
    
	}
}

