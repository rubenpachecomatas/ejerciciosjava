public class Ejercicio13If {
	
	public static void main (String[] args) {
		
    System.out.println("Introduzca el primer número: ");
    int x1 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el segundo número: ");
    int x2 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el tercer número: ");
    int x3 = Integer.parseInt(System.console().readLine());
    
    if (x1 >= x2 && x1 >= x3) {
      if (x2 >= x3) {
        System.out.println(x1 + " - " + x2 + " - " + x3);
      } else {
        if (x3 >= x2) {
        System.out.println(x1 + " - " + x3 + " - " + x2);
        }
      }
    } else {
      if (x2 >= x1 && x2 >= x3) {
        if (x1 >= x3) {
          System.out.println(x2 + " - " + x1 + " - " + x3);
        } else {
          if (x3 >= x1) {
          System.out.println(x2 + " - " + x3 + " - " + x1);
          }
        }
      } else {
        if (x3 >= x1 && x3 >= x2) {
        if (x1 >= x2) {
          System.out.println(x3 + " - " + x1 + " - " + x2);
        } else {
          if (x2 >= x1) {
          System.out.println(x3 + " - " + x2 + " - " + x1);
          }
        }
      }
      }
    }
    
    
	}
}

