/*
 * Calcula el tiempo que tarda un objeto en caer.
 * 
 */
public class Ejercicio6If {
  public static void main(String[] args) {
    
    System.out.println("Introduzca la altura para calcular el tiempo que tardará en caer el objeto en cuestión: ");
    double h = Double.parseDouble(System.console().readLine());
    
    if (h >= 0) {
      double resultado;
		  resultado = Math.sqrt((2 * h) / 9.81);
		  System.out.println("El tiempo es de " + resultado + " segundos.");
    } else {
		  System.out.println("La altura debe ser positiva.");
		}
  }
}
