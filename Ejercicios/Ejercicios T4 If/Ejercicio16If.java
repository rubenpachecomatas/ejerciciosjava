public class Ejercicio16If {
	
	public static void main (String[] args) {
    
    System.out.println("¡Bienvenido al test de la infidelidad!");
    System.out.println("Por favor, escribe tu respuesta en mayúsculas (V/F).");
    System.out.println("#1 Tu pareja parece estar más inquieta de lo normal por algún motivo.");
    String r1 = System.console().readLine();
    System.out.println("#2 Ha aumentado sus gastos de vestuario.");
    String r2 = System.console().readLine();
    System.out.println("#3 Se afeita/peina/maquilla/asea con más frecuencia.");
    String r3 = System.console().readLine();
    System.out.println("#4 No te deja que mires la agenda de su tlf móvil.");
    String r4 = System.console().readLine();
    System.out.println("#5 A veces tiene llamadas que dice no querer contestar contigo delante.");
    String r5 = System.console().readLine();
    System.out.println("#6 Ultimamente se preocupa más por cuidar la línea o estar bronceado/a.");
    String r6 = System.console().readLine();
    System.out.println("#7 Muchos días viene tarde de trabajar porque dice tener mucho más trabajo.");
    String r7 = System.console().readLine();
    System.out.println("#8 Has notado que últimamente se perfuma más.");
    String r8 = System.console().readLine();
    System.out.println("#9 Ha perdido el interes por ti.");
    String r9 = System.console().readLine();
    System.out.println("#10 Se confunde y dice que ha estado en sitios donde no ha ido contigo.");
    String r10 = System.console().readLine();
    
    int puntos = 0;
    
    if (r1.equals("V")) {
      puntos = puntos + 3;
    }
    if (r2.equals("V")) {
      puntos = puntos + 3;
    }
    if (r3.equals("V")) {
      puntos = puntos + 3;
    }
    if (r4.equals("V")) {
      puntos = puntos + 3;
    }
    if (r5.equals("V")) {
      puntos = puntos + 3;
    }
    if (r6.equals("V")) {
      puntos = puntos + 3;
    }
    if (r7.equals("V")) {
      puntos = puntos + 3;
    }
    if (r8.equals("V")) {
      puntos = puntos + 3;
    }
    if (r9.equals("V")) {
      puntos = puntos + 3;
    }
    if (r10.equals("V")) {
      puntos = puntos + 3;
    }
		if (puntos <= 10) {
      System.out.println("¡Enhorabuena, tu pareja parece ser totalmente fiel!");
    } else if (puntos >= 11 && puntos <= 22) {
      System.out.println("Probablemente no sea nada, pero no bajes la guardia.");
    } else if (puntos >= 23 && puntos <= 30) {
      System.out.println("Tienes todas las papeletas, indaga en el asunto y soluciónalo cuanto antes.");
    }
	}
}

