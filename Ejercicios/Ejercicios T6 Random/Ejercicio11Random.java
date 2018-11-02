/*
 * Genera 20 notas al azar (Suspenso, suficiente, bien, notable o sobresaliente)
 * y muestra el número de cada una.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio11Random {
	
	public static void main (String[] args) {
    
    int contSus = 0;
    int contSuf = 0;
    int contBien = 0;
    int contNot = 0;
    int contSob = 0;
    
    for (int cont = 0; cont < 20; cont++) {
      int nota = (int)((Math.random() * 5) + 1);
      switch (nota) {
        case 1:
          System.out.printf("Suspenso ");
          contSus++;
          break;
        case 2:
          System.out.printf("Suficiente ");
          contSuf++;
          break;
        case 3:
          System.out.printf("Bien ");
          contBien++;
          break;
        case 4:
          System.out.printf("Notable ");
          contNot++;
          break;
        case 5:
          System.out.printf("Sobresaliente ");
          contSob++;
          break;
      }
    }
    
    System.out.println("\n\nNº de suspensos = " + contSus);
    System.out.println("Nº de suficientes = " + contSuf);
    System.out.println("Nº de bienes = " + contBien);
    System.out.println("Nº de notables = " + contNot);
    System.out.println("Nº de sobresalientes = " + contSob);
    
	}
}

