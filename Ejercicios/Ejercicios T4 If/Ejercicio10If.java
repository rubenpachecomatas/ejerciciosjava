
public class Ejercicio10If {
  public static void main(String[] args) {
    
    System.out.println("Introduzca el número del mes: ");
    int mes = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el dia: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    switch (mes) {
      case 1:
	    if (dia >= 1 && dia < 20) {
          System.out.println("Sagitario");
        } else if (dia >= 20 && dia <= 30){
		  System.out.println("Capricornio");
        }
      break;
      case 2:
        if (dia >= 1 && dia < 16) {
          System.out.println("Acuario");
          
        } else if (dia >= 16 && dia <= 30){
          System.out.println("Piscis");
        }
      break;
      case 3:
        if (dia >= 1 && dia < 20) {
          System.out.println("Piscis");
        } else if (dia >= 20 && dia <= 30){
          System.out.println("Aries");
        }
      break;
      case 4:
        if (dia >= 1 && dia < 19) {
          System.out.println("Aries");
        } else if (dia >= 20 && dia <= 30){ 
		  System.out.println("Tauro");
        }
	  break;
	  case 5:
        if (dia >= 1 && dia < 21) {
		  System.out.println("Tauro");
        } else if (dia >= 21 && dia <= 30) {
          System.out.println("Géminis");
        }
      break;
      case 6:
        if (dia >= 1 && dia < 21) {
          System.out.println("Géminis");
        } else if (dia >= 21 && dia <= 30) {
          System.out.println("Cáncer");
        }
      break;
      case 7:
        if (dia >= 1 && dia < 23) {
          System.out.println("Cáncer");
        } else if (dia >= 23 && dia <= 30) { 
          System.out.println("Leo");
        }
      break;
      case 8:
        if (dia >= 1 && dia < 23) {
          System.out.println("Leo");
        } else if (dia >= 23 && dia <= 30) {
          System.out.println("Virgo");
        }
      break;
      case 9:
        if (dia >= 1 && dia < 23) {
          System.out.println("Virgo");
        } else if (dia >= 23 && dia <= 30) {
          System.out.println("Libra");  
        }
	  break;
      case 10:
        if (dia >= 1 && dia < 23) {
          System.out.println("Libra");
        } else if (dia >= 23 && dia <= 30) {
            System.out.println("Escorpio");
        }
      break;
      case 11:
        if (dia >= 1 && dia < 22) {
          System.out.println("Escorpio");
        } else if (dia >= 22 && dia <= 30) {
          System.out.println("Sagitario");
        }
      break;
      case 12:
        if (dia >= 1 && dia < 22) {
          System.out.println("Sagitario");
        } else if (dia >= 22 && dia <= 30) {
          System.out.println("Acuario");
        }
      break;
    }
       
  }
}

