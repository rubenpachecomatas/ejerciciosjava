/*
 * Calcula la media de tres notas.
 * 
 */
 
public class Ejercicio7If {
  public static void main(String[] args) {
    
    System.out.println("Introduzca la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    if (nota1 >= 0 && nota2 >= 0 && nota3 >= 0) {
		  double resultado = (nota1 + nota2 + nota3) / 3;
		  System.out.println("Tu nota media es " + resultado);
		} else {
			System.out.println("No puedes introducir una nota negativa.");
    }
  }
}
