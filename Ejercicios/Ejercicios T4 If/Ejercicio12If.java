public class Ejercicio12If {
	
	public static void main (String[] args) {
    
    System.out.println("¡Es hora de un cuestionario!");
    System.out.println("Contesta con el número correspondiente a la respuesta.");
    System.out.println("¡Primera pregunta!¿Qué lenguaje se imparte en la asignatura programación?");
    System.out.println("1. Java | 2. C");
    int p1 = Integer.parseInt(System.console().readLine());
    System.out.println("¡Segunda pregunta!¿Qué significa BBDD?");
    System.out.println("1. Bases de datos | 2. Alcachofa");
    int p2 = Integer.parseInt(System.console().readLine());
    System.out.println("¡Tercera pregunta!¿Qué lenguaje destaca por su uso en la creación de páginas web?");
    System.out.println("1. Python | 2. HTML");
    int p3 = Integer.parseInt(System.console().readLine());
    System.out.println("¡Cuarta pregunta!¿Qué función cumplía la máquina ENIGMA durante la 2ªGM?");
    System.out.println("1. Codificación de mensajes | 2. Acariciador de perros");
    int p4 = Integer.parseInt(System.console().readLine());
    System.out.println("¡Quinta pregunta!¿Qué NO es un ID?");
    System.out.println("1. Minecraft | 2. Geany");
    int p5 = Integer.parseInt(System.console().readLine());
    System.out.println("¡Sexta pregunta!¿Qué metodo usamos en programación para emular otros SO dentro del nuestro y poder trabajar sin riesgo?");
    System.out.println("1. Máquinas virtuales | 2. Yoga");
    int p6 = Integer.parseInt(System.console().readLine());
    System.out.println("¡Séptima pregunta!¿Qué tipo de variable corresponde a números enteros?");
    System.out.println("1. int | 2. string");
    int p7 = Integer.parseInt(System.console().readLine());
    System.out.println("¡Octava pregunta!¿Qué lenguaje permite personalizar la estética de una página escrita en HTML?");
    System.out.println("1. Ruby | 2. CSS");
    int p8 = Integer.parseInt(System.console().readLine());
    System.out.println("¡Novena pregunta!¿Qué significa FOL?");
    System.out.println("1. Formación y orientación al mundo laboral | 2. FOLtnite");
    int p9 = Integer.parseInt(System.console().readLine());
    System.out.println("¡Decima pregunta!¿Es este el mejor cuestionario del mundo?");
    System.out.println("1. Sí | 2. No");
    int p10 = Integer.parseInt(System.console().readLine());
    
    int puntos = 0;
    
    if (p1 == 1) {
      puntos ++;
    }
    if (p2 == 1) {
      puntos ++;
    }
    if (p3 == 2) {
      puntos ++;
    }
    if (p4 == 1) {
      puntos ++;
    }
    if (p5 == 1) {
      puntos ++;
    }
    if (p6 == 1) {
      puntos ++;
    }
    if (p7 == 1) {
      puntos ++;
    }
    if (p8 == 2) {
      puntos ++;
    }
    if (p9 == 1) {
      puntos ++;
    }
    if (p10 == 2) {
      puntos ++;
    }
    
    System.out.print("Tu puntuación es de " + puntos + " puntos.");
    
	}
}

