/*
 * Calcula la media de tres notas y muestra la nota del boletín.
 * 
 */
 
public class Ejercicio8If {
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
	if (resultado >= 0 && resultado < 5) {
	  System.out.println("Resultado final dentro del boletín: Insuficiente.");
	} else if (resultado >= 5 && resultado < 6) {
	  System.out.println("Resultado final dentro del boletín: Suficiente.");
	} else if (resultado >= 6 && resultado < 7) {
	  System.out.println("Resultado final dentro del boletín: Bien.");
	} else if (resultado >= 7 && resultado < 9) {
	  System.out.println("Resultado final dentro del boletín: Notable.");
	} else if (resultado >= 9 && resultado < 10) {
	  System.out.println("Resultado final dentro del boletín: Sobresaliente.");
	} else {
	  System.out.println("No puedes introducir una nota negativa.");
	}
 } 
}
