
package Ejercicio02POO;

/**
 *
 * @author ODLana
 */
public abstract class Vehiculo {
    
    private static int vehiculosCreados;
    private static int kilometrosTotales = 0;
    
    private int kilometrosRecorridos;

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public int getKilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }

    public static void setVehiculosCreados(int vehiculosCreados) {
        Vehiculo.vehiculosCreados = vehiculosCreados;
    }

    public static void setKilometrosTotales(int kilometrosTotales) {
        Vehiculo.kilometrosTotales = kilometrosTotales;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
    
    public void recorre(int km) {
        this.kilometrosRecorridos += km;
        Vehiculo.kilometrosTotales += km;
    }
}
