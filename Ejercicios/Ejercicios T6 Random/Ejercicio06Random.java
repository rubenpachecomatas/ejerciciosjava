/*
 * Piensa un número al azar entre 0 y 100. Tienes 5 oportunidades para acertarlo
 * y en cada fallo te dice si el número es mayor o menor que el introducido.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio06Random {
	
	public static void main (String[] args) {
    
    int codigo = (int)(Math.random()*101);
    int rest = 5;
    int x;
    
    do {
      System.out.println("Introduzca el número: ");
      System.out.println("Intentos restantes: " + rest);
      x = Integer.parseInt(System.console().readLine());
      rest = rest - 1;
      
      if (x == codigo) {
        System.out.println("Código correcto.");
        
      } else {
        System.out.println("Código incorrecto.");
      }
      
      if (x < codigo) {
        System.out.println("El número correcto es MAYOR al introducido.");
      } else if (x > codigo) {
        System.out.println("El número correcto es MENOR al introducido.");
      }
    } while (rest != 0 && x != codigo);
	}
}

