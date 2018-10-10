/*
 * Muestra el cuadrado y el cubo de 5 números introducidos.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio11Bucles {
	
	public static void main (String[] args) {
		
    System.out.print("Introduzca 5 números enteros para conocer su cuadrado y su cubo: ");
    
    for (int x = 0; x < 5; x++) {
      int num = Integer.parseInt(System.console().readLine());
      System.out.println(num + "     " + (num * num) + "     " + (num * num * num));
    }
    
	}
}

