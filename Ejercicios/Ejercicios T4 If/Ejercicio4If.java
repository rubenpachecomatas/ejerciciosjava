/*
 * Calcula el sueldo semanal de un empleado.
 * 
 */
 
public class Ejercicio4If {
  public static void main(String[] args) {
    
    int horas;
    
    System.out.println("Introduzca las horas trabajadas: ");
    horas = Integer.parseInt(System.console().readLine());
    
    if (horas <= 40 && horas >= 0) {
      int sueldo = horas * 12;
      System.out.println("Su sueldo es de " + sueldo + " euros.");
    } else if (horas >= 41){
	  int excedente;
	  int sueldo;
	  horas = horas - 40;
	  excedente = horas * 16;
	  sueldo = excedente + (40 * 12);
	  System.out.println("Su sueldo es de " + sueldo + " euros.");
	}
  }
}
