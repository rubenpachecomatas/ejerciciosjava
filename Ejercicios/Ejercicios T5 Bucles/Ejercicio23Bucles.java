/*
 * Suma una serie de números indeterminada mientras su valor no supere 10000.
 * Una vez lo haga se detendrá mostrando el total, la cantidad de números y la
 * media.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio23Bucles {
	
	public static void main (String[] args) {
		
    int cont = 0;
    int total = 0;
    
    do {
      System.out.print("Introduce números hasta sumar un valor superior a 10000: ");
      int num = Integer.parseInt(System.console().readLine());
      
      total = total + num;
      cont++;
    } while (total <= 10000);
    
    System.out.println("Total acumulado: " + total);
    System.out.println("Cantidad de números introducidos: " + cont);
    System.out.println("Media: " + (total / cont));
    
	}
}

