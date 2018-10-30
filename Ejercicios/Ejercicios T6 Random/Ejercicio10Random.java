/*
 * Genera 10 línes pintadas a partir de un carácter aleatorio y con una longitud
 * aleatoria entre 1 y 40.
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio10Random {
	
	public static void main (String[] args) {
    
    int caracter;
    String caracterFin;
    
    for (int cont = 0; cont < 10; cont++) {
      caracter = (int)((Math.random() * 6) + 1);
      switch (caracter) {
        case 1:
          caracterFin = "*";
          for (int i = 0; i < ((Math.random() * 40) + 1); i++) {
            System.out.printf(caracterFin);
          }
          break;
        case 2:
          caracterFin = "=";
          for (int i = 0; i < ((Math.random() * 40) + 1); i++) {
            System.out.printf(caracterFin);
          }
          break;
        case 3:
          caracterFin = "-";
          for (int i = 0; i < ((Math.random() * 40) + 1); i++) {
            System.out.printf(caracterFin);
          }
          break;
        case 4:
          caracterFin = ".";
          for (int i = 0; i < ((Math.random() * 40) + 1); i++) {
            System.out.printf(caracterFin);
          }
          break;
        case 5:
          caracterFin = "|";
          for (int i = 0; i < ((Math.random() * 40) + 1); i++) {
            System.out.printf(caracterFin);
          }
          break;
        case 6:
          caracterFin = "@";
          for (int i = 0; i < ((Math.random() * 40) + 1); i++) {
            System.out.printf(caracterFin);
          }
          break;
      }
      System.out.println("");
    }
	}
}

