public class Ejercicio15If {
	
	public static void main (String[] args) {
		
    System.out.println("¿Hacia dónde quieres que apunte la pirámide?¿Arriba, abajo, izquierda o derecha?");
    System.out.println("Por favor, escribe tu respuesta en mayúsculas.");
    String dir = System.console().readLine();
    
    if (dir.equals("ARRIBA")) {
      System.out.println("    *    ");
      System.out.println("   ***   ");
      System.out.println("  *****  ");
      System.out.println(" ******* ");
      System.out.println("*********");
    } else if (dir.equals("ABAJO")) {
      System.out.println("*********");
      System.out.println(" ******* ");
      System.out.println("  *****  ");
      System.out.println("   ***   ");
      System.out.println("    *    ");
    } else if (dir.equals("IZQUIERDA")) {
      System.out.println("        *");
      System.out.println("       **");
      System.out.println("      ***");
      System.out.println("     ****");
      System.out.println("    *****");
      System.out.println("     ****");
      System.out.println("      ***");
      System.out.println("       **");
      System.out.println("        *");
    } else if (dir.equals("DERECHA")) {
      System.out.println("*        ");
      System.out.println("**       ");
      System.out.println("***      ");
      System.out.println("****     ");
      System.out.println("*****    ");
      System.out.println("****     ");
      System.out.println("***      ");
      System.out.println("**       ");
      System.out.println("*        ");
    }
	}
}

