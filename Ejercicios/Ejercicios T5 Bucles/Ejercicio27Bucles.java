/*
 * Muestra, cuenta y suma los números múltiplos de 3 entre 1 y un número
 * introducido por teclado.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio27Bucles {
	
	public static void main (String[] args) {
		
    System.out.print("Introduzca un número para conocer los múltiplos de 3 desde 1 hasta él: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int cont = 0;
    int contM3 = 0;
    int cont3 = 1;
    int suma = 0;
      
    while (cont < num) {
      if ((cont3 % 3) == 0) {
        System.out.print(cont3 + " ");
        contM3++;
        suma += cont3;
      }
      cont++;
      cont3++;
    }
    
    System.out.print("\n");
    System.out.println("Cantidad de múltiplos: " + contM3);
    System.out.print("Suma total: " + suma);
    
	}
}

