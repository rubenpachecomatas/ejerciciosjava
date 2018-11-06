/*
 * Tira 5 dados de póker.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio23Random {
	
	public static void main (String[] args) {
  
    for (int cont = 0; cont < 5; cont++) {
      int dado = (int)(Math.random() * 6);
      switch (dado) {
        case 1:
          System.out.printf("As ");
          break;
        case 2:
          System.out.printf("K ");
          break;
        case 3:
          System.out.printf("Q ");
          break;
        case 4:
          System.out.printf("J ");
          break;
        case 5:
          System.out.printf("7 ");
          break;
        case 0:
          System.out.printf("8 ");
          break;
      }
    }
	}
}

