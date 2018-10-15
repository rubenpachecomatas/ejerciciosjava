/*
 * Muestra los números enteros positivos menores a un número introducido por
 * teclado que no sean divisibles por otro también introducido.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio29Bucles {
	
	public static void main (String[] args) {
		
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca otro número para conocer los menores del anterior no divisibles entre este mismo: ");
    int div = Integer.parseInt(System.console().readLine());
    
    int cont = 0;
    int contM3 = 0;
    int cont3 = 1;
    int suma = 0;
      
    while (cont < num) {
      if ((cont3 % div) != 0) {
        System.out.print(cont3 + " ");
        contM3++;
        suma += cont3;
      }
      cont++;
      cont3++;
    }
	}
}

