
package Ejercicio07POO;

import java.util.Scanner;

/**
 *
 * @author ODLana
 */
public class TestZona {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        Zona principal = new Zona(1000);
        Zona compra = new Zona(200);
        Zona vip = new Zona(25);
        
        int opcion = 0;
        
        while(opcion != 3) {
            System.out.println("1. Mostrar número de entradas libres.");
            System.out.println("2. Vender entradas.");
            System.out.println("3. Salir.");
        
            opcion = Integer.parseInt(s.nextLine());
        
            switch(opcion) {
                case 1:
                    System.out.println(principal.getEntradasPorVender());
                    System.out.println(compra.getEntradasPorVender());
                    System.out.println(vip.getEntradasPorVender());
                    break;
                case 2:
                    System.out.println("¿En qué zona?");
                    String zona = s.nextLine();
                    System.out.println("¿Cuántas entradas?");
                    int n = Integer.parseInt(s.nextLine());
                    
                    if (zona.equals("principal")) {
                        principal.vender(n);
                    } else if (zona.equals("compra")) {
                        compra.vender(n);
                    } else if (zona.equals("vip")) {
                        vip.vender(n);
                    } else 
                    break;
                case 3:
                    break;
            }
        }
        
    }
    
}
