/*
 * Muestra por pantalla los números de 7 en 7 entre dos números enteros
 * introducidos por pantalla.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio18Bucles {
	
	public static void main (String[] args) {
      
    int num1;
    int num2;
    
    do {
      System.out.println("Introduce el primer número: ");
      num1 = Integer.parseInt(System.console().readLine());
      System.out.println("Introduce el segundo número número: ");
      num2 = Integer.parseInt(System.console().readLine());
      
      if(num1 == num2) {
        System.out.println("Los valores introducidos no son validos (Deben ser distintos).");
      }
    } while (num1 == num2);
    
    if (num1 > num2) {
      int num12;
      
      num12 = num1;
      num1 = num2;
      num2 = num12;
    }
    
    for(int cont = num1; cont <= num2; cont = cont + 7) {
      System.out.println(cont);
    }
	}
}

