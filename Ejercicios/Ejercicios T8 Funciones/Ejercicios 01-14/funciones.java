/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas;

/**
 *
 * @author ODLana
 */
public class funciones {
    
    /* Le da la vuelta a un número cualquiera. */
    
    public static int voltea (int n) {
        int aux = n;
        int reves = 0;
        
        while (aux > 0) {
            reves = (reves * 10) + (aux % 10);
            aux = aux / 10;
        }
        
        return reves;
    }
    
    /* Comprueba es el número es primo o no. */
    
    public static boolean esPrimo (int n) {
        boolean primo = true;
        
        for (int cont = 2; cont < n; cont++) {
            if (n % cont == 0) {
                primo = false;
            }
        }
        
        return primo;
    }
    
    /* Eleva una base a un exponente.  */
    
    public static double potencia (int base, int exp) {
        double resultado = Math.pow(base, exp);
        return resultado;
    }
    
     /* Comprueba si un número es o no capicua..  */
    
    public static boolean esCapicua (int num) {
        boolean capi;
        if (num == voltea(num)) {
            capi = true;
        } else {
            capi = false;
        }
        
        return capi;
    }
    
    /* Muestra el número primo mayor más cercano al número introducido. */
    
    public static int siguientePrimo (int num) {
        do {
            num++;
        } while (esPrimo(num) == false);
        
        return num;
    }
    
    /* Muestra el número de dígitos del número introducido. */
    
    public static int digitos (int num) {
        
        int digitos = 0;
        
        if (num < 0) {
            num = -1 * num;
        }
        
        if (num < 10) {
            digitos = 1;
        } else {
            do {
                num /= 10;
                digitos++;
            } while (num > 0);
        }
        
        return digitos;
    }
    
    /* Muestra el dígito correspondiente a la posición introducida. */
    
    public static int digitoN (int n, int num) {
        
        int numRe = voltea(num);
        int digito;
        
        for (int i = 0; i <= (n - 1); i++) {
            numRe /= 10;
        }
        
        digito = numRe % 10;
        return digito;
        
    }
        
    /* Muestra la posición de la primera coincidencia con el dígito
    introducido. */
    
    public static int posicionDeDigito (int n, int num) {
        
        int numRe = voltea(num);
        int i = 0;
        
        while (numRe % 10 != n && numRe > 1) {
            numRe = numRe / 10;
            i++;
        }
        
        if (numRe < 1) {
            return i = -1;
        } else {
            return i;
        }
        
    }
        
    /* Quita n dígitos por detrás a un número. */
    
    public static int quitaPorDetras (int n, int num) {
        
        for (int i = 0; i < n; i++) {
            num = num / 10;
        }
        
        return num;
    }
    
    /* Quita n dígitos por delante a un número. */
    
    public static int quitaPorDelante (int n, int num) {
        
        int numRe = voltea(num);
        
        for (int i = 0; i < n; i++) {
            numRe = numRe / 10;
        }
        
        numRe = voltea(numRe);
        
        return numRe;
    }
    
    /* Pega un dígito por detrás a un número. */
    
    public static int pegaPorDetras (int n, int num) {
        
        num = (num * 10) + n;
        
        return num;
    }
    
    /* Pega un dígito por delante a un número. */
    
    public static int pegaPorDelante (int n, int num) {
            
        int numRe = voltea(num);
        numRe = (numRe * 10) + n;
        num = voltea(numRe);
        
        return num;
    }
    
    /* Pega dos números para formar uno. */
    
    public static int juntaNumeros (String num1, String num2) {
            
        String cadena = num1 + num2;
        
        int numEntero = Integer.parseInt(cadena);
        
        return numEntero;
    }
    
    /* Selecciona parte de un número. */
    
    public static int trozoDeNumero (int posI, int posF, int num) {
        
        int longitud = digitos(num);
        num = quitaPorDelante(posI, num);
        num = quitaPorDetras(longitud - posF - 1, num);
        return num;
    }
}
