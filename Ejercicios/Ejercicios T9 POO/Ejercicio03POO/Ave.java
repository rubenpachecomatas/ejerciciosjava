/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03POO;

/**
 *
 * @author ODLana
 */
public abstract class Ave extends Animal {

    public Ave(String nombre, String sexo) {
        super(nombre, sexo);
    }
    
    public void Volar(){
        System.out.println("Te hundo el pecho desde el aire chaval.");
    }
    
}
