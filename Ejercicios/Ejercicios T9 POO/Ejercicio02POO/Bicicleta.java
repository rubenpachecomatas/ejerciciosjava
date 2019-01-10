/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02POO;

/**
 *
 * @author ODLana
 */
public class Bicicleta extends Vehiculo {
    
    private String color;

    public Bicicleta(String color) {
        super();
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void caballito() {
        System.out.println("¡Mira Papá, mira!");
    }
}
