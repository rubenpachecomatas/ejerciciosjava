
package Ejercicio04POO;

/**
 *
 * @author ODLana
 */
public class TestFraccion {
    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion (2, 3);
        
        System.out.println(fraccion1);
        
        Fraccion fraccion2 = new Fraccion (6, 2);
        
        System.out.println(fraccion2);
        
        fraccion1.invierte();
        fraccion2.invierte();
        
        System.out.println("----------------");
        
        System.out.println(fraccion1);
        System.out.println(fraccion2);
        
        System.out.println("----------------");
        
        System.out.println(fraccion1.divide(fraccion2));
        System.out.println(fraccion1.multiplica(fraccion2));
        
        
    }
}
