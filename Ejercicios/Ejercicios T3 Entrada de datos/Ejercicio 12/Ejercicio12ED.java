
public class Ejercicio12ED {
  public static void main(String[] args) {
    
    double nota1;
    double media;
    
    System.out.println("Introduzca la nota del primer examen: ");
    nota1 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca la media deseada: ");
    media = Double.parseDouble(System.console().readLine());
    
    double nota2;
    
    nota2 = ((media * 100) - (nota1 * 40)) / 60;
    media = ((nota1 * 40) + (nota2 * 60)) / 100;
    
    System.out.println("La nota a sacar en el segundo examen es: " + nota2);

   
  }
}
