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
public abstract class Mamifero extends Animal {

    public Mamifero(String nombre, String sexo) {
        super(nombre, sexo);
    }
    
    public void Mamar(){
        System.out.println("Te remamaste wey.");
    }
    
}
