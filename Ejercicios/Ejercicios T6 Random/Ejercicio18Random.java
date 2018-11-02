/*
 * Genera 3 colores aleatoriamente. No pueden repetirse.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio18Random {
	
	public static void main (String[] args) {
  
    int color1;
    int color2;
    int color3;
    
    do {
      color1 = (int)(Math.random() * 6);
      color2 = (int)(Math.random() * 6);
      color3 = (int)(Math.random() * 6);
    } while ((color1 == color2) || (color1 == color3) || (color2 == color3));
    
    switch (color1) {
      case 0:
        System.out.println("Rojo");
        break;
      case 1:
        System.out.println("Azul");
        break;
      case 2:
        System.out.println("Verde");
        break;
      case 3:
        System.out.println("Amarillo");
        break;
      case 4:
        System.out.println("Violeta");
        break;
      case 5:
        System.out.println("Naranja");
        break;
    }
    switch (color2) {
      case 0:
        System.out.println("Rojo");
        break;
      case 1:
        System.out.println("Azul");
        break;
      case 2:
        System.out.println("Verde");
        break;
      case 3:
        System.out.println("Amarillo");
        break;
      case 4:
        System.out.println("Violeta");
        break;
      case 5:
        System.out.println("Naranja");
        break;
    }
    switch (color3) {
      case 0:
        System.out.println("Rojo");
        break;
      case 1:
        System.out.println("Azul");
        break;
      case 2:
        System.out.println("Verde");
        break;
      case 3:
        System.out.println("Amarillo");
        break;
      case 4:
        System.out.println("Violeta");
        break;
      case 5:
        System.out.println("Naranja");
        break;
    }
	}
}

