/*
 * Muestra una pirámide hueca en base a la altura introducida por teclado.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio20Bucles {
	
	public static void main (String[] args) {
		
    System.out.println("Introduce la altura de la pirámide por teclado: ");
    int h = Integer.parseInt(System.console().readLine());
    
    int espacios = h;
    int espaciosCentrales = 0;
    
    for (int cont = 0; cont < h; cont++) {
      //espacios izquierda
      for (int contEs = 0; contEs < espacios; contEs++){
         System.out.print(" ");
      }
      //asteriscos
      System.out.print("*");
      //espacios centrales
      for (int contEs = 0; contEs < espaciosCentrales; contEs++){
          System.out.print(" ");
      }
      System.out.println("*");
      espacios--;
      espaciosCentrales += 2;
    }
    
    for (int cont = 0; cont < 2 * h + 2; cont++) {
      System.out.print("*");
    }
    
	}
}

