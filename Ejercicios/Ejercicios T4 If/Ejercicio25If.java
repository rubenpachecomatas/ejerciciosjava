/*
 * Calcula el precio de una bandera en base a sus medidas, si tiene emblema o
 * no, y los gastos de envío.
 * 
 */


public class Ejercicio25If {
	
	public static void main (String[] args) {
		
    System.out.println("Introduzca la altura de su bandera en cm: ");
    double h = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca el ancho de su bandera en cm: ");
    double anc = Double.parseDouble(System.console().readLine());
    System.out.println("¿Quiere que lleve un escudo dorado bordado? (S/N): ");
    String esc = System.console().readLine();
    
    double dim = h * anc;
    double precioF = dim / 100;
    System.out.println("Bandera de " + dim + " cm2: " + precioF + " euros.");
    
    if (esc.equals("S")) {
      precioF = precioF + 2.50;
      System.out.println("Con escudo: 2.50 euros.");
    } else if (esc.equals("N")) {
      System.out.println("Sin escudo: 0.00 euros.");
    }
    
    precioF = precioF + 3.25;
    System.out.println("Gastos de envío: 3.25 euros.");
    System.out.println("Precio final: " + precioF);
    
    
    
	}
}

