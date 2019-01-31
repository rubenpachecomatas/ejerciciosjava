/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author ODLana
 */
public class Ejercicio03ArrayList {
    
    public static void main(String[] args) {

        ArrayList<Integer> n = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            n.add(aleatorio(0, 20));
        }
        Collections.sort(n);
        System.out.println(n);
    }
        
    public static int aleatorio(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min; 
    }
        
}
