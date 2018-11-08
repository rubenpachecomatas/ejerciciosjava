/*
 * Define un array de 12 números asignados según el enunciado del ejercicio.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio1Arrays {
	
	public static void main (String[] args) {
  
    int[] num;
    num = new int[12];
    
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    
    for (int cont = 0; cont < 12; cont++) {
      System.out.printf(num[cont] + " ");
    }
    
    //Los elementos no inicializados lo hacen a 0.

	}
}

