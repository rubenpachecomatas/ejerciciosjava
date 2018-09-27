
public class Ejercicio6ED {
  public static void main(String[] args) {
    
    double base;
    double altura;
    
    System.out.println("Introduce la base de triángulo: ");
    base = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la altura del triángulo: ");
    altura = Double.parseDouble(System.console().readLine());
    
    System.out.println("Área del triángulo indicado: " + ((base * altura) / 2));
    
	
   
  }
}
