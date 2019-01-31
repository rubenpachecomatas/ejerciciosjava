/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04ArrayList;

import static Ejercicio03ArrayList.Ejercicio03ArrayList.aleatorio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ODLana
 */
public class Ejercicio04ArrayList {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        ArrayList<String> n = new ArrayList<>();
        
        System.out.println("Introduzaca las palabras a ordenar: ");
        
        for (int i = 0; i < 10; i++) {
            n.add(s.nextLine());
        }
        Collections.sort(n);
        System.out.println(n);
    }
    
}
