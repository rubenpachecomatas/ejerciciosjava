
package Ejercicio02POO;

import java.util.Scanner;

/**
 *
 * @author ODLana
 */
public class TestVehiculo {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int opcion = 0;
        int km;
        
        Bicicleta bici1 = new Bicicleta("Verde");
        Coche coche1 = new Coche("Azul");
        
        while(opcion != 8) {
            System.out.println("VEHÍCULOS");
        System.out.println("_-_-_-_-_-_");
        System.out.println("1. Anda con la bicicleta.");
        System.out.println("2. Haz el caballito.");
        System.out.println("3. Anda con el coche.");
        System.out.println("4. Derrapa.");
        System.out.println("5. Ver km de la bicicleta.");
        System.out.println("6. Ver km del coche.");
        System.out.println("7. Ver km totales");
        System.out.println("8. Salir.");
        
        opcion = Integer.parseInt(s.nextLine());
        
        switch(opcion) {
            case 1:
                System.out.println("Km a recorrer: ");
                km = Integer.parseInt(s.nextLine());
                bici1.recorre(km);
                break;
            case 2:
                bici1.caballito();
                break;
            case 3:
                System.out.println("Km a recorrer: ");
                km = Integer.parseInt(s.nextLine());
                coche1.recorre(km);
                break;
            case 4:
                coche1.derrapar();
                break;
            case 5:
                System.out.println(bici1.getKilometrosRecorridos());
                break;
            case 6:
                System.out.println(coche1.getKilometrosRecorridos());
                break;
            case 7:
                System.out.println(Vehiculo.getKilometrosTotales());
                break;
        }
        
        }
    }
    
}
