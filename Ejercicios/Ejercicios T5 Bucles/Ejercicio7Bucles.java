/*
 * Control de acceso a una caja fuerte, permite ingresar un código hasta 4 veces
 * antes de bloquearse.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio7Bucles {
	
	public static void main (String[] args) {
		
    int codigo = 1234;
    int rest = 4;
    int x;
    
    do {
      System.out.println("Introduzca el código para desbloquear la caja fuerte: ");
      System.out.println("Intentos restantes: " + rest);
      x = Integer.parseInt(System.console().readLine());
      rest = rest - 1;
      
      if (x == codigo) {
        System.out.println("Código correcto, caja fuerte desbloqueada");
        
      } else {
        System.out.println("Código incorrecto, vuelva a intentarlo.");
      }
    }
    
    while (rest != 0 && x != codigo);
    
	}
}

