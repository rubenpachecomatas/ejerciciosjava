/*
 * Pide la temperatura media de todos los meses de un año y muestra un diagrama
 * con ellas.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio8Arrays {
	
	public static void main (String[] args) {
  
    int[] num = new int[12];
    int i;
    
    String[] mes = {
      "enero", "febrero", "marzo", "abril", "mayo", "junio",
      "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };
    
    System.out.println("Introduzca la temperatura media de todos los meses del año en orden: ");
    for (i = 0; i < 12; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    for (i = 0; i < 12; i++) {
      System.out.print(mes[i] + " | ");
      for (int cont = 0; cont < num[i]; cont++) {
        System.out.print("=");
      }
      System.out.println(" " + num[i] + " grados");
    }

	}
}

