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
public class Gato extends Mamifero {
    
    private String color;

    public Gato(String color, String nombre, String sexo) {
        super(nombre, sexo);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void Arañar(){
        System.out.println("Te hundo el pecho chaval.");
    }
    
}
