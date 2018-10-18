/*
 * Muestra por pantalla la unión de los números pares de dos números
 * introducidos por teclado seguida de la unión de impares.
 * 
 * 
 */


public class Ejercicio34Bucles {
	
	public static void main (String[] args) {
    
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca otro número: ");
    int num2 = Integer.parseInt(System.console().readLine());
    
    //Dar la vuelta a los números.
    int aux = num;
    int reves = 0;
    
    while (aux > 0) {
      reves = (reves * 10) + (aux % 10);
      aux = aux / 10;
    }
    //System.out.print("\n" + reves);
    
    int auxb = num2;
    int reves2 = 0;
    
    while (auxb > 0) {
      reves2 = (reves2 * 10) + (auxb % 10);
      auxb = auxb / 10;
    }
    //System.out.print("\n" + reves2);
    
    //Variables.
    
    int aux1 = reves;
    int aux2 = reves2;
    int aux1N = reves;
    int aux2N = reves2;
    
    //Pares.
    
    System.out.print("\nNúmero par: ");
    
    while (reves > 0) {
      aux1 = (reves % 10);
      if (aux1 % 2 == 0) {
        System.out.print(aux1);
      }
      reves /= 10;
      aux2 = (reves2 % 10);
      if (aux2 % 2 == 0) {
        System.out.print(aux2);
      }
      reves2 /= 10;
    }
    
    //Impares
    
    System.out.print("\nNúmero impar: ");
    while (aux1 > 0) {
      aux1 = (aux1N % 10);
      if (aux1 % 2 != 0) {
        System.out.print(aux1);
      }
      aux1N /= 10;
      aux2 = (aux2N % 10);
      if (aux2 % 2 != 0) {
        System.out.print(aux2);
      }
      aux2N /= 10;
    }
		
	}
}

