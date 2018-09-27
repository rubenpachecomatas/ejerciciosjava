
public class Ejercicio2ED {
  public static void main(String[] args) {
    
    double euros;
    
    System.out.println("Introduzca la cantidad de euros que desea convertir a pesetas: ");
    euros = Double.parseDouble(System.console().readLine());
    double pesetas = euros * 166.386;
    System.out.println(euros + " euros equivalen a " + pesetas + " pesetas.");
    

   
  }
}
