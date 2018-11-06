/*
 * Lanza 5 monedas (con un valor al azar) y muestra el resultado (cara o cruz).
 * 
 * @author Rubén Pacheco Matas
 */


public class Ejercicio21Random {
	
	public static void main (String[] args) {
  
    int tipoMoneda;
    int resultado;
    
    for (int cont = 0; cont < 5; cont++) {
      tipoMoneda = (int)(Math.random() * 8 + 1);
      switch (tipoMoneda) {
        case 1:
          System.out.printf("1 céntimo - ");
          resultado = (int)(Math.random() * 2 + 1);
          switch (resultado) {
            case 1:
              System.out.println("cara");
              break;
            case 2:
              System.out.println("cruz");
              break;
          }
          break;
        case 2:
          System.out.printf("2 céntimos - ");
          resultado = (int)(Math.random() * 2 + 1);
          switch (resultado) {
            case 1:
              System.out.println("cara");
              break;
            case 2:
              System.out.println("cruz");
              break;
          }
          break;
        case 3:
          System.out.printf("10 céntimos - ");
          resultado = (int)(Math.random() * 2 + 1);
          switch (resultado) {
            case 1:
              System.out.println("cara");
              break;
            case 2:
              System.out.println("cruz");
              break;
          }
          break;
        case 4:
          System.out.printf("20 céntimos - ");
          resultado = (int)(Math.random() * 2 + 1);
          switch (resultado) {
            case 1:
              System.out.println("cara");
              break;
            case 2:
              System.out.println("cruz");
              break;
          }
          break;
        case 5:
          System.out.printf("50 céntimos - ");
          resultado = (int)(Math.random() * 2 + 1);
          switch (resultado) {
            case 1:
              System.out.println("cara");
              break;
            case 2:
              System.out.println("cruz");
              break;
          }
          break;
        case 6:
          System.out.printf("1 euro - ");
          resultado = (int)(Math.random() * 2 + 1);
          switch (resultado) {
            case 1:
              System.out.println("cara");
              break;
            case 2:
              System.out.println("cruz");
              break;
          }
          break;
        case 7:
          System.out.printf("2 euros - ");
          resultado = (int)(Math.random() * 2 + 1);
          switch (resultado) {
            case 1:
              System.out.println("cara");
              break;
            case 2:
              System.out.println("cruz");
              break;
          }
          break;
        case 8:
          System.out.printf("5 céntimos - ");
          resultado = (int)(Math.random() * 2 + 1);
          switch (resultado) {
            case 1:
              System.out.println("cara");
              break;
            case 2:
              System.out.println("cruz");
              break;
          }
          break;
      }
    }
    
	}
}

