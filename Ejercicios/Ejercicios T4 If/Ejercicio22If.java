/*
 * Calcula los minutos que faltan para el fin de semana (Viernes a las 15:00).
 * 
 */


public class Ejercicio22If {
	
	public static void main (String[] args) {
		
    System.out.println("¿Qué día es? (En minusculas sin acentuar)");
    String dia = System.console().readLine();
    System.out.println("Precisa la hora.");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.println("Precisa los minutos");
    int min = Integer.parseInt(System.console().readLine());
    
    int minR = 60 - min;
    int horaR = (24 - hora) * 60;
    int excR = horaR - minR;
    
    if (dia.equals("lunes")) {
      int diaR = (((5 - 2) * 24) + 15) * 60;
      int tiempo = excR + diaR;
      System.out.println("Faltan " + tiempo + " minutos.");
    } else if (dia.equals("martes")) {
      int diaR = (((5 - 3) * 24) + 15) * 60;
      int tiempo = excR + diaR;
      System.out.println("Faltan " + tiempo + " minutos.");
    } else if (dia.equals("miercoles")) {
      int diaR = (((5 - 4) * 24) + 15) * 60;
      int tiempo = excR + diaR;
      System.out.println("Faltan " + tiempo + " minutos.");
    } else if (dia.equals("jueves")) {
      int diaR = (((5 - 5) * 24) + 15) * 60;
      int tiempo = excR + diaR;
      System.out.println("Faltan " + tiempo + " minutos.");
    } else if (dia.equals("viernes")) {
      if (hora >= 15) {
        System.out.println("Ya es fin de semana.");
      } else {
        int tiempo = ((15 - hora) * 60) - (60 - min);
        System.out.println("Faltan " + tiempo + " minutos.");
      }
    }
    
	}
}

