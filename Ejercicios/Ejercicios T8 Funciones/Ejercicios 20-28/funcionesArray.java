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
public class funcionesArray {
    /* Crea un array unidimensional. */
    
    public static int[] generaArrayInt (int n, int max, int min) {
        
        int[] num = new int[n];
        
        for (int i = 0; i < n; i++) {
            num[i] = (int)(Math.random() * (max - min) + (min + 1));
        }
        
       return num;
    }
    
    /* Saca el minimo de un array. */
    
    public static int minimoArrayInt (int[] num, int maxValor) {
        
        int min = maxValor;
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        
        return min;
        
    }
    
    /* Saca el máximo de un array. */
    
    public static int maximoArrayInt (int[] num, int minValor) {
        
        int max = minValor;
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        
        return max;
        
    }
    
    /* Saca la media de un array. */
    
    public static int mediaArrayInt (int[] num) {
        
        int media = 0;
        for (int i = 0; i < num.length; i++) {
            media = media + num[i];
        }
        
        media = media / num.length;
        
        return media;
        
    }
    
    /* Comprueba si se encuentra en un array. */
    
    public static boolean estaEnArrayInt (int[] num, int n) {
        
        boolean comprob = false;
                
        for (int i = 0; i < num.length; i++) {
             if (num[i] == n) {
                 comprob = true;
             }
        }
        
        return comprob;
        
    }
    
    /* Saca la posición dentro del array. */
    
    public static int posicionEnArray (int[] num, int n) {
        
        int cont = 0;
        
        for (int i = 0; i < num.length; i++) {
             if (num[i] == n) {
                 cont = i;
                 break;
             }
        }
        
        return cont;
        
    }
    
    /* Voltea el array. */
    
    public static int[] volteaArrayInt (int[] num) {
        
        int[] reves = new int[num.length];
        int cont = num.length - 1;
        
        for (int i = 0; i <= num.length - 1; i++) {   
            reves[cont] = num[i];
            cont--;
        }
        
        return reves;
        
    }
    
    /* Rota n números a la derecha en un array. */
    
    public static int[] rotaDerechaArrayInt (int[] num, int n) {
        
        int[] nuevo = new int[num.length];
        int aux;
        
        for (int i = 0; i <= num.length - 1; i++) {
            aux = i + n;
            while (aux >= num.length) {
                aux = aux - num.length;
            }
            nuevo[aux] = num[i];
        }
        
        return nuevo;
        
    }
    
    /* Rota n números a la izquierda en un array. */
    
    public static int[] rotaIzquierdaArrayInt (int[] num, int n) {
        
        int[] nuevo = new int[num.length];
        int aux;
        
        for (int i = 0; i <= num.length - 1; i++) {
            aux = i - n;
            while (aux < 0) {
                aux = aux + num.length;
            }
            nuevo[aux] = num[i];
        }
        
        return nuevo;
        
    }
    

}
