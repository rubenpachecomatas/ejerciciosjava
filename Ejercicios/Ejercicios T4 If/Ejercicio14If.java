public class Ejercicio14If {
	
	public static void main (String[] args) {
		
    System.out.println("Introduzca un número para saber si es divisible entre 5 y/o divisible entre 5: ");
    int x1 = Integer.parseInt(System.console().readLine());
    
    if ((x1 % 2) == 0) {
      System.out.println("Es par.");
    } else {
      System.out.println("No es par.");
    }
    if ((x1 % 5) == 0) {
      System.out.println("Es divisible entre 5.");
    } else {
      System.out.println("No es divisible entre 5.");
    }
    
	}
}

