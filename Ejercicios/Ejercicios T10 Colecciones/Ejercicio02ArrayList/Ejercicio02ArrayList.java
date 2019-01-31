/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02ArrayList;

import java.util.ArrayList;

/**
 *
 * @author ODLana
 */
public class Ejercicio02ArrayList {
    
    public static void main(String[] args) {
            
        ArrayList<Integer> n = new ArrayList<>();
        
        for (int i = 0; i < (aleatorio(10,20)); i++) {
            n.add(aleatorio(0,100));
        }
        
        //Suma, mínimo y máximo.
        
        int suma = 0;
        int min = n.get(0);
        int max = n.get(0);
        
        for (Integer num : n) {
            suma += num;
            
            /*if (num < min) {
                min = num;
            }*/
            
            max = num > max ? num : max;
            
            /*if (num > max) {
                max = num;
            }*/
            
            min = num < min ? num : min;
        }
        
        System.out.println(n);
        System.out.println("Max - " + max);
        System.out.println("Min - " + min);
        System.out.println("Suma - " + suma);
        
    }
    
    public static int aleatorio(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min; 
    }
    
}
