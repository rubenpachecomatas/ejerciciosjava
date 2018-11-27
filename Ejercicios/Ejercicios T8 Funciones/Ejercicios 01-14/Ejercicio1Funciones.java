
package tema.pkg8.funciones;

import java.util.Scanner;

/**
 *
 * @author ODLana
 */
public class Ejercicio1Funciones {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        //Prueba Voltea
        System.out.print("Introduzca un número para verlo al revés: ");
        int num = Integer.parseInt(s.nextLine());
        System.out.println("El número invertido es " +
                matematicas.funciones.voltea(num));
        
        //Prueba esPrimo
        System.out.print("Introduzca un número para saber si es primo: ");
        num = Integer.parseInt(s.nextLine());
        System.out.println(matematicas.funciones.esPrimo(num));
        
        //Prueba Potencia
        System.out.println("Introduzca el número que quiere elevar: ");
        int base = Integer.parseInt(s.nextLine());
        System.out.println("Introduzca el exponente al que lo quiere elevar: ");
        int exp = Integer.parseInt(s.nextLine());
        System.out.println(matematicas.funciones.potencia(base, exp));
        
        //Prueba esCapicua
        System.out.print("Introduzca un número para saber si es o no capicua: ");
        num = Integer.parseInt(s.nextLine());
        System.out.println(matematicas.funciones.esCapicua(num));
        
        //Prueba siguientePrimo
        System.out.print("Introduzca un número para obtener el número primo"
                + " mayor más cercano: ");
        num = Integer.parseInt(s.nextLine());
        System.out.println(matematicas.funciones.siguientePrimo(num));
        
        //Prueba digitos
        System.out.print("Introduzca un número para obtener su número de"
                + " dígitos: ");
        num = Integer.parseInt(s.nextLine());
        System.out.println(matematicas.funciones.digitos(num));
        
        //Prueba digitoN
        System.out.println("Introduzca un número (Digito N): ");
        num = Integer.parseInt(s.nextLine());
        System.out.println("Introduzca una posición para obtener el dígito"
                + " correspondiente: ");
        int n = Integer.parseInt(s.nextLine());
        System.out.println(matematicas.funciones.digitoN(n, num));
        
        //Prueba posicionDeDigito
        System.out.println("Introduzca un número (Posicion de digito): ");
        num = Integer.parseInt(s.nextLine());
        System.out.println("Introduzca un dígito para obtener su posición dentro"
                + " del número: ");
        n = Integer.parseInt(s.nextLine());
        System.out.println(matematicas.funciones.posicionDeDigito(n, num));
        
        //Prueba quitaPorDetras
        System.out.println("Introduzca un número (Quita por detras): ");
        num = Integer.parseInt(s.nextLine());
        System.out.println("Introduzca el número de dígitos que desea quitarle"
                + " por la derecha: ");
        n = Integer.parseInt(s.nextLine());
        System.out.println(matematicas.funciones.quitaPorDetras(n, num));
        
        //Prueba quitaPorDelante
        System.out.println("Introduzca un número (Quita por delante): ");
        num = Integer.parseInt(s.nextLine());
        System.out.println("Introduzca el número de dígitos que desea quitarle"
                + " por la izquierda: ");
        n = Integer.parseInt(s.nextLine());
        System.out.println(matematicas.funciones.quitaPorDelante(n, num));
        
        //Prueba pegaPorDetras
        System.out.println("Introduzca un número (Pega por detras): ");
        num = Integer.parseInt(s.nextLine());
        System.out.println("Introduzca el dígito que desea pegar por detrás: ");
        n = Integer.parseInt(s.nextLine());
        System.out.println(matematicas.funciones.pegaPorDetras(n, num));
        
        //Prueba pegaPorDelante
        System.out.println("Introduzca un número (Pega por delante): ");
        num = Integer.parseInt(s.nextLine());
        System.out.println("Introduzca el dígito que desea pegar por delante: ");
        n = Integer.parseInt(s.nextLine());
        System.out.println(matematicas.funciones.pegaPorDelante(n, num));
        
        //Prueba juntaNumeros
        System.out.println("Introduzca un número (Junta numeros): ");
        String num1 = s.nextLine();
        System.out.println("Introduzca otro número para unirlo al anterior: ");
        String num2 = s.nextLine();
        System.out.println(matematicas.funciones.juntaNumeros(num1, num2));
        
        //Prueba trozoDeNumero
        System.out.println("Introduzca un número (Trozo de Numero): ");
        num = Integer.parseInt(s.nextLine());
        System.out.println("Introduzca la posicíon inicial: ");
        int posI = Integer.parseInt(s.nextLine());
        System.out.println("Introduzca la posición final: ");
        int posF = Integer.parseInt(s.nextLine());
        System.out.println(matematicas.funciones.trozoDeNumero(posI, posF, num));
    }
}
