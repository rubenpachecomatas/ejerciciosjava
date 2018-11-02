/*
 * Funciona como una tragaperras simplificada. Si hay 3 símbolos iguales ganas,
 * si son 2 recuperas tu dinero y si los 3 son diferentes pierdes.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio16Random {
	
	public static void main (String[] args) {
  
    int contCo = 0;
    int contH = 0;
    int contD = 0;
    int contCa = 0;
    int contL = 0;
    
    for (int cont = 0; cont < 3; cont++) {
      int simbolo = (int)(Math.random() * 5 + 1);
      switch (simbolo) {
        case 1:
          System.out.printf("Corazón ");
          contCo++;
          break;
        case 2:
          System.out.printf("Herradura ");
          contH++;
          break;
        case 3:
          System.out.printf("Diamante ");
          contD++;
          break;
        case 4:
          System.out.printf("Campana ");
          contCa++;
          break;
        case 5:
          System.out.printf("Limón ");
          contL++;
          break;
      }
    }
    
    if (contCo == 3 || contH == 3 || contD == 3 || contCa == 3 || contL == 3) {
      System.out.printf("\nGanaste 10 monedas.");
    } else if (contCo == 2 || contH == 2 || contD == 2 || contCa == 2 || contL == 2) {
      System.out.printf("\nRecuperas tu dinero.");
    } else {
      System.out.printf("\nPierdes.");
    }
    
	}
}

