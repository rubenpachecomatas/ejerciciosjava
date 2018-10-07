/*
 * Resuelve una ecuación de primer grado.
 * 
 */
 
public class Ejercicio5If {
  public static void main(String[] args) {
    
    System.out.println("Introduzca el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    if (a > 0 || a < 0 ) {
	  b = b * (-1);
	  double resultado = b / a;
	  System.out.println("x = " + resultado);
	} else if (a == 0) {
	  System.out.println("El valor de a no puede ser 0.");
	}  
  }
}

