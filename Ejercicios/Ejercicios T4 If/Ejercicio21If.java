/*
 * Calcula la media de un alumno en base a la nota de dos exámenes, y en caso de
 * suspenso aplica la nota de la recuperación.
 * 
 */


public class Ejercicio21If {
	
	public static void main (String[] args) {
		
    System.out.println("Introduce la nota del primer examen: ");
    double x1 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la nota del segundo examen: ");
    double x2 = Double.parseDouble(System.console().readLine());
    
    double media = (x1 + x2) / 2;
    
    if (media >= 5) {
      System.out.println("Tu media es de: " + media);
    } else if (media <= 5) {
      System.out.println("Nota de la recuperación (Apto/No Apto): ");
      String re = System.console().readLine();
      
      if (re.equals("Apto")) {
        System.out.println("Tu media es de: 5");
      } else {
        System.out.println("Tu media es de: " + media);
      }
    }
      
    
	}
}

