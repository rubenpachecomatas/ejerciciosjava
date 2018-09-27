
public class Ejercicio7ED {
  public static void main(String[] args) {
    
    double base;
    
    System.out.println("Introduce el precio base: ");
    base = Double.parseDouble(System.console().readLine());
    double precioIva = (base * 21 / 100) + base;
    System.out.println("Precio final (Iva incluido) = " + precioIva + " euros.");
    

   
  }
}
