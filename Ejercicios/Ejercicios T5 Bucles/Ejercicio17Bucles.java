/*
 * Calcula la suma del número introducido y sus 100 siguientes.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio17Bucles {
	
	public static void main (String[] args) {
      
      int num = 0;
      
      do {
        System.out.print("Introduce un número entero y positivo para sumarle sus 100 siguientes: ");
        num = Integer.parseInt(System.console().readLine());
      } while (num < 0);
      
      int aux = num;
      int rest = aux;
      
      if (num >= 0) {
        for (int cont = 0; cont <= 99; cont++) {
          num = num + aux;
          aux++;
        }
        
        System.out.print("La suma equivale a " + (num - rest));
      }
	}
}

