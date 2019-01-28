/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10POO;

/**
 *
 * @author ODLana
 */
public class Ameba {
    private int peso;

    public Ameba() {
        this.peso = 3;
    }

    

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso " + peso + " microgramos.";
    }
    
    public void come(int n) {
        this.peso += (n-1);
    }
    
    public void come(Ameba n) {
        this.peso += (n.peso - 1);
        n.peso = 0;
    }
    
    
}
