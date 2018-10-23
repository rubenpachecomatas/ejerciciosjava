/*
 * Muestra el factorial de un número entero introducido por pantalla.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio28Bucles {
	
	public static void main (String[] args) {
		
    System.out.print("Introduzca un número para calcular su factorial: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int factorial = num;
    
    if (num == 0) {
      System.out.print("0! = 1");ç
    } else if (num > 0) {
      for (int cont = 1; cont < num; cont++) {
        factorial = factorial * cont;
      }
      
      System.out.print(num + "! = " + factorial);
    }
    
	}
}

