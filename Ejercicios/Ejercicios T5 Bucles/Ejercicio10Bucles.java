/*
 * Calcula la media de los números introducidos (Positivos).
 * 
 * @author Rubén Pacheco Matas
 */

public class Ejercicio10Bucles {
	
	public static void main (String[] args) {
    
    double num = 0;
    double cont = 0;
    double cuenta = 0;
    System.out.println("Introduzca un números positivos para calcular su media (Para detener la cuenta introduzca un valor negativo): ");
    
    while (num >= 0) {
      
    num = Double.parseDouble(System.console().readLine());
    cont = cont + num;
    cuenta++;
    
    }
    
    cont = cont - num;
    cuenta = cuenta - 1;
    System.out.println("Media: " + (cont / cuenta));
    
	}
}

