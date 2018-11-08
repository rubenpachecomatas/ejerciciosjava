/*
 * Define un array de 12 números asignados según el enunciado del ejercicio.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio2Arrays {
	
	public static void main (String[] args) {
  
    char[] simbolo;
    simbolo = new char[10];
    
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    
    for (int cont = 0; cont < 10; cont++) {
      System.out.printf(simbolo[cont] + " ");
    }
    
    //Los elementos no inicializados lo hacen como un espacio en blanco.

	}
}

