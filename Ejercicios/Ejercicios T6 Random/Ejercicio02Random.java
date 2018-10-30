/*
 * Muestra al azar el nombre de una carta de la baraja francesa.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio02Random {
	
	public static void main (String[] args) {
		
    int palo = (int)((Math.random() * 4) + 1);
    String paloFin;
    int num = (int)((Math.random() * 13) + 1);
    String numFin;
    
    switch (num) {
      case 1:
        numFin = "2";
        System.out.printf(numFin);
        break;
      case 2:
        numFin = "3";
        System.out.printf(numFin);
        break;
      case 3:
        numFin = "4";
        System.out.printf(numFin);
        break;
      case 4:
        numFin = "5";
        System.out.printf(numFin);
        break;
      case 5:
        numFin = "6";
        System.out.printf(numFin);
        break;
      case 6:
        numFin = "7";
        System.out.printf(numFin);
        break;
      case 7:
        numFin = "8";
        System.out.printf(numFin);
        break;
      case 8:
        numFin = "9";
        System.out.printf(numFin);
        break;
      case 9:
        numFin = "J";
        System.out.printf(numFin);
        break;
      case 10:
        numFin = "Q";
        System.out.printf(numFin);
        break;
      case 11:
        numFin = "K";
        System.out.printf(numFin);
        break;
      case 12:
        numFin = "A";
        System.out.printf(numFin);
        break;
      case 13:
        numFin = "10";
        System.out.printf(numFin);
        break;
    }
    
    System.out.printf(" de ");
    
    switch (palo) {
      case 1:
        paloFin = "picas";
        System.out.printf(paloFin);
        break;
      case 2:
        paloFin = "diamantes";
        System.out.printf(paloFin);
        break;
      case 3:
        paloFin = "treboles";
        System.out.printf(paloFin);
        break;
      case 4:
        paloFin = "corazones";
        System.out.printf(paloFin);
        break;
    }
    
	}
}

