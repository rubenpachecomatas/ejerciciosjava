
package Ejercicio01POO;

/**
 *
 * @author ODLana
 */
public class TestCaballo {
    
    public static void main(String[] args) {
        
       Caballo caballo1 = new Caballo("Azucarillo", "Helicóptero de combate furro", 7, "pistacho");
       Caballo caballo2 = new Caballo("Panceta", "pez", 7, "cyan");
       
       System.out.println("Hola, me llamo " + caballo1.getNombre() + ", tengo " + caballo1.getEdad() + " "
               + "años y soy un " + caballo1.getSexo() + " de color " + caballo1.getColor() + ".");
       caballo2.relinchar();
    }
    
}
