/*
 * Genera una pecera en base a la altura y el ancho introducido por teclado
 * con un pez posicionado aleatoriamente en cualquier punto dentro de la ella.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio17Random {
	
	public static void main (String[] args) {
  
    System.out.println("Introduce la altura de la pecera(min.4): ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el ancho de la pecera(min.4): ");
    int ancho = Integer.parseInt(System.console().readLine());
    
    int pez = (int)(Math.random() * (h - 2)*((ancho*2) - 3));
    int auxPez = 0;
    
    for (int cont = 0; cont < ancho; cont++) {
      System.out.printf("* ");
    }
    System.out.printf("\n");
    for (int cont = 2; cont < h; cont++) {
      System.out.printf("*");
      for (int i = 0; i < (ancho * 2 - 3); i++) {
        if (auxPez == pez) {
          System.out.printf("&");
        } else {
          System.out.printf(" ");
        }
        auxPez++;
      }
      System.out.println("*");
    }
    for (int cont = 0; cont < ancho; cont++) {
      System.out.printf("* ");
    }
	}
}

