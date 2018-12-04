
package tema.pkg8.funciones;

import java.util.Scanner;

/**
 *
 * @author ODLana
 */
public class Ejercicio17Funciones {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un número en binario: ");
        int num = Integer.parseInt(s.nextLine());
        
        int digitos = matematicas.funciones.digitos(num);
        System.out.println(digitos);
        int digito;
        int suma = 0;
        
        for (int i = 0; i < digitos; i++) {
            digito = num % 10;
            suma = suma + (digito * (int)Math.pow(2,i));  
            num /= 10;
        }
        
        System.out.println("El número convertido a decimal es: " + suma);
        
        
    }

}
