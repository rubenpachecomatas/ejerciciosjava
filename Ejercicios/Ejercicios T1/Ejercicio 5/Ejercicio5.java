


public class Ejercicio5 {
  public static void main(String[] args) {
    
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.println("  Lunes    Martes    Miércoles    Jueves    Viernes  ");
    System.out.println("-----------------------------------------------------");
    System.out.println(rojo + "   EED      SINF        PRO        PRO        SINF   ");
    System.out.println(verde + "   LM       SINF        PRO        PRO        SINF   ");
    System.out.println(naranja + "   LM       SINF        PRO        EED        SINF   ");
    System.out.println(azul + "   BBDD     PRO         BBDD       EED        FOL    ");
    System.out.println(morado + "   BBDD     PRO         BBDD       LM         FOL    ");
    System.out.println( blanco + "   BBDD     PRO         BBDD       LM         FOL    ");
    
  }
}
