/*
 * Muestra una pirámide rellena a partir de la altura introducida por teclado.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio19Bucles {
	
	public static void main (String[] args) {
    
    int base = 1;
    int linea = 1;
    
    System.out.println("Introduce la altura de la pirámide: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print("¿Con qué carácter deseas rellenarla?");
    String re = System.console().readLine();
    
    int espacios = h - 1;
    
    while (base <= h) {
      for (int cont = 1; cont <= espacios; cont++) {
        System.out.print(" ");
      }
      for (int cont = 1; cont <= linea; cont++) {
        System.out.print(re);
      }
      
      System.out.print("\n");
      
      base++;
      espacios--;
      linea = linea + 2;
    }
	}
}

