
public class Ejercicio9If {
  public static void main(String[] args) {
    
    System.out.println("Introduzca el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca el valor de c: ");
    double c = Double.parseDouble(System.console().readLine());
    
		double resultado1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
		double resultado2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
		
		System.out.println("Resultados: " + resultado1 + " y " + resultado23);
		   
  }
}

