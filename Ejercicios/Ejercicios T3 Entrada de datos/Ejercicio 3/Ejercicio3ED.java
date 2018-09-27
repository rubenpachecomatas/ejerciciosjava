
public class Ejercicio3ED {
  public static void main(String[] args) {
    
    double pesetas;
    
    System.out.println("Introduzca la cantidad de pesetas que desea convertir a euros: ");
    pesetas = Double.parseDouble(System.console().readLine());
    double euros = pesetas / 166.386;
    System.out.println(pesetas + " pesetas equivalen a " + euros + " euros.");
    

   
  }
}
