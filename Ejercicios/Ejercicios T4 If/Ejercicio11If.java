/*
 * Calcula los minutos para llegar a la medianoche.
 * 
 */
 
public class Ejercicio11If {
  public static void main(String[] args) {
    
    System.out.println("Introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca los minutos: ");
    int minuto = Integer.parseInt(System.console().readLine());

    if (hora > 0 && hora <= 23) {
      if (minuto => 0 && minuto < 60) {
        int horas = 24 - hora;
        int minutos = 60 - minutos;
      }
    }
  }
}
