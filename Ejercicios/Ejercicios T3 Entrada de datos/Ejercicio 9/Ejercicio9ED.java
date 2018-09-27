
public class Ejercicio9ED {
  public static void main(String[] args) {
    
    double radio;
    double altura;
    
    System.out.println("Introduzca el radio del cono: ");
    radio = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca la altura del cono: ");
    altura = Double.parseDouble(System.console().readLine());
    double volumen = ((((double)1 / (double)3) * Math.PI) * (radio * radio)) * altura;
    System.out.println("Volumen del cono: " + volumen);
    

   
  }
}
