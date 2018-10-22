/*
 * Muestra por pantalla los factoriales enteros positivos de una serie de
 * números teniendo como tope el número introducido por teclado.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio37Bucles {
	
	public static void main (String[] args) {
    
    System.out.println("Introduzca un número entero positivo por teclado: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int acu = 1;
    int contInt;
    if (num == 1 || num == 0) {
      System.out.println(num + "! = 1");
    } else if (num > 1) {
      System.out.println("0! = 1");
      System.out.println("1! = 1");
      for (int cont = 2; cont <= num; cont++) {
        contInt = cont;
        acu = contInt;
        for (int i = 1; i < contInt; i++) {
          acu = acu * i;
        }
        System.out.println(cont + "! = " + acu);
      }
    } else if (num < 0) {
      System.out.println("El número introducido no es correcto.");
    }
    
	}
}

