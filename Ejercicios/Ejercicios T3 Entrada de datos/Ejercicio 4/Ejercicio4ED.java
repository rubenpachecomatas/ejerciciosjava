
public class Ejercicio4ED {
  public static void main(String[] args) {
    
    int x;
    int y;
    
    System.out.println("Introduce un número: ");
    x = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce otro número: ");
    y = Integer.parseInt(System.console().readLine());
    
    System.out.println("El valor de x es " + x);
    System.out.println("El valor de y es " + y);
    System.out.println("Suma = " + (x + y));
    System.out.println("Resta = " + (x - y));
    System.out.println("Multiplicación = " + (x * y));
    System.out.println("División = " + (y / x));
    

   
  }
}
