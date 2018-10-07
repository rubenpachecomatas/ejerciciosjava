/*
 * Calcula la nómina de un empleado en base a su puesto, su estado civil y los
 * días visitando clientes.
 * 
 */


public class Ejercicio24If {
	
	public static void main (String[] args) {
		
    System.out.println("1. Programador junior.");
    System.out.println("2. Programador senior.");
    System.out.println("3. Jefe de Proyecto.");
    System.out.println("Introduzca el número correspondiente a su puesto: ");
    int puesto = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el número de días visitando clientes: ");
    int diasT = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca su estado civil (1. soltero / 2. casado):  ");
    int estado = Integer.parseInt(System.console().readLine());
    
    double sueldoB = 0;
    
    if (puesto == 1) {
      sueldoB = 950;
      System.out.println("-Sueldo base: " + sueldoB);
    } else if (puesto == 2) {
      sueldoB = 1200;
      System.out.println("-Sueldo base: " + sueldoB);
    } else if (puesto == 3) {
      sueldoB = 1600;
      System.out.println("-Sueldo base: " + sueldoB);
    }
    
    double exc = diasT * 30;
    double sueldoBr = exc + sueldoB;
    double IRPF = 0;
    System.out.println("-Dietas("+ diasT + " días): " + exc);
    System.out.println("-Sueldo bruto: " + sueldoBr);
    
    if (estado == 1) {
      IRPF = (sueldoBr / 100) * 25;
      System.out.println("-Retención IRPF: " + IRPF);
    } else if (estado == 2) {
      IRPF = (sueldoBr / 100) * 20;
      System.out.println("-Retención IRPF: " + IRPF);
    }
    
    double sueldoT = sueldoBr - IRPF;
    System.out.println("-Sueldo total: " + sueldoT);
    
	}
}

