/*
 * Piensa un número al azar entre 0 y 100, el ordenador tendrá 5 intentos para
 * adivinarlo. Con cada intento fallido deberás decirle si el número es mayor o
 * menor.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio14Random {
	
	public static void main (String[] args) {
    
    System.out.println("Introduzca el número en el que está pensando: ");
    int codigo = Integer.parseInt(System.console().readLine());
    int masMenos = 0;
    int min = 0;
    int max = 100;
    int rest = 5;
    int x;
    
    do {
      x = (int)(int)(Math.random() * (max - min) + min);
      System.out.println("Intentos restantes: " + rest);
      System.out.println("Creo que ese número es: " + x);
      rest = rest - 1;
      
      System.out.println("¿Se trata de un número mayor, menor o igual al introducido?");
      System.out.println("1. Mayor | 2. Menor | 3. Igual");
      masMenos = Integer.parseInt(System.console().readLine());
      
      if (masMenos == 1) {
        min = x + 1;
        System.out.println("Incorrecto, es mayor.\n");
      } else if (masMenos == 2) {
        max = x - 1;
        System.out.println("Incorrecto, es menor.\n");
      } else if (masMenos == 3) {
        System.out.println("¡JA!¡EN TU CARA MALDITO SAPIENS SAPIENS!\n");
      }
      
    } while (rest != 0 && x != codigo);
    
    if (rest == 0) {
      System.out.println("Vaya, no he conseguido acertar el número.");
    }
    
	}
}

