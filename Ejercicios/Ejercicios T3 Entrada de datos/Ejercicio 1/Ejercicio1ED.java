
public class Ejercicio1ED {
  public static void main(String[] args) {
    
    String x;
    String y;
    
    System.out.println("Introduce un número: ");
    x = System.console().readLine();
    System.out.println("Introduce otro número: ");
    y = System.console().readLine();
    System.out.println("El producto de ambos números es " + Integer.parseInt(x) * Integer.parseInt(y));

   
  }
}
