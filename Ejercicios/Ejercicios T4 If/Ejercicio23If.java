/*
 * Calcula el precio final a partir de la base imponible, el tipo de IVA y el
 * tipo de descuento.
 * 
 */


public class Ejercicio23If {
	
	public static void main (String[] args) {
		
    System.out.println("Introduce la base imponible: ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.println("Tipo de IVA (general/redux/superredux): ");
    String iva = System.console().readLine();
    System.out.println("Tipo de cupón (nopro/mitad/meno5/5porc): ");
    String cup = System.console().readLine();
    
    double res = 0;
    System.out.println("Base imponible:     " + base);
    
    
    if (iva.equals("general")) {
      double ivaN = ((base / 100) * 21);
      res = ivaN + base;
      System.out.println("IVA (21%):        " + ivaN);
    } else if (iva.equals("redux")) {
      double ivaN = ((base / 100) * 10);
      res = ivaN + base;
      System.out.println("IVA (10%):        " + ivaN);
    } else if (iva.equals("superredux")) {
      double ivaN = ((base / 100) * 4);
      res = ivaN + base;
      System.out.println("IVA (4%):         " + ivaN);
    } else {
      System.out.println("Tipo de IVA no admitido.");
    }
    
    if (cup.equals("nopro")) {
      System.out.println("Promo (nopro):          -");
    } else if (cup.equals("mitad")) {
      double cupon = -1 * (res / 2);
      res = res + cupon;
      System.out.println("Promo (mitad):   " + cupon);
    } else if (cup.equals("meno5")) {
      res = res - 5;
      System.out.println("Promo (meno5):         -5");
    } else if (cup.equals("5porc")) {
      double porc = -1 * ((res / 100) * 5);
      res = res + porc;
      System.out.println("Promo (meno5):    " + porc);
    }
    
    System.out.println("Precio final:        " + res);
    
	}
}

