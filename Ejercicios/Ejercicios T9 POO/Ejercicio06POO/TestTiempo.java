/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio06POO;

/**
 *
 * @author ODLana
 */
public class TestTiempo {
    public static void main(String[] args) {
        
        Tiempo tiempo1 = new Tiempo(2, 30, 45);
        Tiempo tiempo2 = new Tiempo(3, 14, 36);
        
        System.out.println(tiempo1);
        System.out.println(tiempo2);
        
        System.out.println(tiempo1.suma(tiempo2));
        
        System.out.println(tiempo2.resta(tiempo1));
    }
}
