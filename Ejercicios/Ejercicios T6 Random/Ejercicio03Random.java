/*
 * Muestra al azar el nombre de una carta de la baraja española.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio03Random {
	
	public static void main (String[] args) {
		
    int palo = (int)((Math.random() * 4) + 1);
    String paloFin;
    int num = (int)((Math.random() * 10) + 1);
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
        numFin = "Sota";
        System.out.printf(numFin);
        break;
      case 8:
        numFin = "Caballo";
        System.out.printf(numFin);
        break;
      case 9:
        numFin = "Rey";
        System.out.printf(numFin);
        break;
      case 10:
        numFin = "As";
        System.out.printf(numFin);
        break;
    }
    
    System.out.printf(" de ");
    
    switch (palo) {
      case 1:
        paloFin = "Espadas";
        System.out.printf(paloFin);
        break;
      case 2:
        paloFin = "Copas";
        System.out.printf(paloFin);
        break;
      case 3:
        paloFin = "Oros";
        System.out.printf(paloFin);
        break;
      case 4:
        paloFin = "Bastos";
        System.out.printf(paloFin);
        break;
    }
    
	}
}

