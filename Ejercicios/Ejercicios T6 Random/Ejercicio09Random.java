/*
 * Genera número aleatorios pares entre 0 y 100 hasta que uno sea 24. Al
 * terminar muestra el cuantos números ha generado.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio09Random {
	
	public static void main (String[] args) {
    
    int cont = 0;
    int num;
    
    do {
      num = (int)(Math.random() * 101);
      if (num % 2 == 0) {
        System.out.printf(num + " ");
        cont ++;
      }
    } while (num != 24);
    
    System.out.println("\n\nCantidad de números = " + cont);
	}
}

