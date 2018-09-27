
public class Ejercicio11ED {
  public static void main(String[] args) {
    
    double kb;
    
    System.out.println("Introduzca el tamaño en kb: ");
    kb = Double.parseDouble(System.console().readLine());
	double mb = kb / 1024;
    System.out.println(kb + " kb equivalen a " + mb + " mb.");
    

   
  }
}
